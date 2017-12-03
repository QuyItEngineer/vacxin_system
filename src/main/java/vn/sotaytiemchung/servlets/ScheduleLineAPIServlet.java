package vn.sotaytiemchung.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.sotaytiemchung.models.bo.ImmunizationScheduleBO;
import vn.sotaytiemchung.models.bo.ImmunizationScheduleBOImpl;
import vn.sotaytiemchung.models.bo.UserBO;
import vn.sotaytiemchung.models.dto.LineSchedule;
import vn.sotaytiemchung.models.dto.User;
import vn.sotaytiemchung.models.utils.SessionManager;

@WebServlet("/app/schedule-line")
public class ScheduleLineAPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ImmunizationScheduleBO iScheduleBO;
	UserBO userBo;

	public ScheduleLineAPIServlet() {
		super();
		iScheduleBO = new ImmunizationScheduleBOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String lineId = request.getParameter("id");

		LineSchedule sLine = iScheduleBO.getLineSchedule(lineId);

		if (sLine != null) {
			// TODO: Cover object to JSON and return.
		} else {
			// TODO: Return 404 status code and not found message.
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Step 1: Get logged user information from session.
		User loggedUser = SessionManager.getCurrentLoggedUser(request);

		LineSchedule ls = new LineSchedule();
		// Step 2: Populate data into new line schedule object.
		ls.setVaccineName(request.getParameter("vaccine_name"));
		ls.setNote(request.getParameter("note"));
		ls.setStatus(request.getParameter("status"));
		ls.setUser(loggedUser);

		// Step 3: Do create new line schedule.
		LineSchedule newLS = iScheduleBO.createLineSchedule(ls);

		if (newLS != null) {
			// TODO: Cover to JSON and return.
		} else {
			// Return error message.
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Step 1: Get logged user information from session.
		User loggedUser = SessionManager.getCurrentLoggedUser(request);

		// Step 2: Check authorization
		LineSchedule currentLS = iScheduleBO.getLineSchedule(request.getParameter("id"));

		if (currentLS != null) {
			if (!currentLS.getUser().getId().equalsIgnoreCase(loggedUser.getId())) {
				// TODO: Return 403 and message you are not owner of this schedule.
			}
		} else {
			// TODO: Return 404 and not found line schedule message.
		}

		// Step 3: Populate body data into line schedule object.
		LineSchedule ls = new LineSchedule();

		if (request.getParameter("vaccine_name") != null) {
			ls.setVaccineName(request.getParameter("vaccine_name"));
		}

		if (request.getParameter("note") != null) {
			ls.setNote(request.getParameter("note"));
		}

		if (request.getParameter("status") != null) {
			ls.setStatus(request.getParameter("status"));
		}

		ls.setUser(loggedUser);

		// Step 4: Do update line schedule.
		LineSchedule newLS = iScheduleBO.updateLineSchedule(ls);

		if (newLS != null) {
			// TODO: Cover to JSON and return.
		} else {
			// TODO: Return error message.
		}
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Step 1: Get logged user information from session.
		User loggedUser = SessionManager.getCurrentLoggedUser(request);

		// Step 2: Check authorization
		LineSchedule currentLS = iScheduleBO.getLineSchedule(request.getParameter("id"));

		if (currentLS != null) {
			if (!currentLS.getUser().getId().equalsIgnoreCase(loggedUser.getId())) {
				// TODO: Return 403 and message you are not owner of this schedule.
			}
		} else {
			// TODO: Return 404 and not found line schedule message.
		}

		// Step 3: Do remove line schedule.
		LineSchedule removedLS = iScheduleBO.removeLineSchedule(currentLS.getId());

		if (removedLS != null) {
			// TODO: Cover to JSON and return.
		} else {
			// TODO: Return error message.
		}
	}
}
