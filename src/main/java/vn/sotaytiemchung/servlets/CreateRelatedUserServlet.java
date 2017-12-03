package vn.sotaytiemchung.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.sotaytiemchung.models.bo.UserBO;
import vn.sotaytiemchung.models.dto.User;
import vn.sotaytiemchung.models.dto.UserAccount;

@WebServlet("/app/add-user")
public class CreateRelatedUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserBO userBO;

	public CreateRelatedUserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. Create dispatcher for forward data for JSP file.
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/add-related-user.jsp");

		// 2. Forward all data to signup.jsp file for process render view.
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String targetPage;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

		UserAccount loggedAccount = (UserAccount) request.getSession().getAttribute("account");
		
		try {
			// Step 1: Get user data from client input form.
			User newUser = new User();

			newUser.setName(request.getParameter("uName"));
			newUser.setTelephone(request.getParameter("uTelephone"));
			newUser.setBirthday(formatter.parse(request.getParameter("uBirthday")));
			newUser.setWeight(Integer.parseInt(request.getParameter("uWeight")));

			// Step 2: Create new related user profile.
			User newCreatedUser = userBO.createRelatedUser(newUser, loggedAccount.getId());

			if (newCreatedUser != null) {
				// On created user success, redirect to schedule manage page of new user.
				targetPage = "/app?uid=" + newCreatedUser.getId();

			} else {
				// On error send back to create new related user page.
				targetPage = "/WEB-INF/pages/add-related-user.jsp";
				request.setAttribute("message", "Has error when trying to create new user profile.");
			}

		} catch (ParseException e) {
			targetPage = "/WEB-INF/pages/400.jsp";
			request.setAttribute("message", e.getMessage());
		}

		request.getRequestDispatcher(targetPage).forward(request, response);
	}
}
