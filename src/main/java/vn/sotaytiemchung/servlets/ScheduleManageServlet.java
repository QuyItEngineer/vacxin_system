package vn.sotaytiemchung.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.sotaytiemchung.exceptions.UserNotFoundException;
import vn.sotaytiemchung.models.bo.ImmunizationScheduleBO;
import vn.sotaytiemchung.models.bo.ImmunizationScheduleBOImpl;
import vn.sotaytiemchung.models.dto.ImmunizationSchedule;
import vn.sotaytiemchung.models.dto.UserAccount;;

@WebServlet("/app/schedule")
public class ScheduleManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ImmunizationScheduleBO iScheduleBO;

	public ScheduleManageServlet() {
		super();

		iScheduleBO = new ImmunizationScheduleBOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String targetPage;

		// Step 1. Get logged account from session.
		UserAccount loggedAccount = (UserAccount) request.getSession().getAttribute("account");

		// Step 2: Get uid query parameter on URL, this contain user id of that user who
		// want to view immunization schedule.
		String userId = request.getParameter("uid");

		// If uid is null, will resolve to current logged user id.
		if (userId == null)
			userId = loggedAccount.getUserId();

		// Step 3: Check user permission on schedule.
		if (!loggedAccount.getId().equalsIgnoreCase(userId)) {
			// If logged user id not equals, next check whether logged user
			// view schedule of related user that created by logged user or not.
			if (!iScheduleBO.isRelatedUser(loggedAccount.getId(), userId)) {
				// If user user don't have permission just send to 403 page.
				request.setAttribute("message", "You dont't have permission on this schedule.");

				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pages/403.jsp");
				rd.forward(request, response);
			}
		}

		try {
			ImmunizationSchedule schedule = iScheduleBO.getUserSchedule(userId);

			// Set to attribute for view page can render schedule.
			request.setAttribute("schedule", schedule);

			targetPage = "/WEB-INF/pages/schedule-manage.jsp";
		} catch (UserNotFoundException e) {
			request.setAttribute("message", e.getMessage());

			// On user not found send to bad request page.
			targetPage = "/WEB-INF/pages/400.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(targetPage);
		rd.forward(request, response);
	}
}
