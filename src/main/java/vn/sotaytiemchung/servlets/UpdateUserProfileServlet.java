package vn.sotaytiemchung.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.sotaytiemchung.exceptions.UserNotFoundException;
import vn.sotaytiemchung.models.bo.ImmunizationScheduleBO;
import vn.sotaytiemchung.models.bo.UserBO;
import vn.sotaytiemchung.models.bo.UserBOImpl;
import vn.sotaytiemchung.models.dto.User;
import vn.sotaytiemchung.models.utils.SessionManager;

@WebServlet("/app/profile")
public class UpdateUserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserBO userBO;
	ImmunizationScheduleBO iScheduleBO;

	public UpdateUserProfileServlet() {
		super();
		userBO = new UserBOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("uid");
		String targetPage;

		User selectedUser;

		if (userId == null) {
			selectedUser = SessionManager.getCurrentLoggedUser(request);
		} else {
			selectedUser = userBO.findOneUser(userId);
		}

		if (selectedUser != null) {
			request.setAttribute("user", selectedUser);
			targetPage = "WEB-INF/pages/user-edit-profile.jsp";
		} else {
			request.setAttribute("message", "User not found.");
			targetPage = "WEB-INF/pages/404.jsp";
		}

		request.getRequestDispatcher(targetPage).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

		try {
			// Step 1: Get user profile need update.
			User selectedUser = userBO.findOneUser(request.getParameter("id"));
			User loggedUser = SessionManager.getCurrentLoggedUser(request);

			// Step 2: Check authorization.
			if (selectedUser != null && isAllowEditProfile(loggedUser, selectedUser)) {

				// Step 3: Get user data from client input form.
				if (request.getParameter("uName") != null) {
					selectedUser.setName(request.getParameter("uName"));
				}

				if (request.getParameter("uTelephone") != null) {
					selectedUser.setTelephone(request.getParameter("uTelephone"));
				}

				if (request.getParameter("uBirthday") != null) {
					selectedUser.setBirthday(formatter.parse(request.getParameter("uBirthday")));
				}

				if (request.getParameter("uWeight") != null) {
					selectedUser.setWeight(Integer.parseInt(request.getParameter("uWeight")));
				}

				// Step 4: Do update profile user.

				User updatedUser = userBO.updateProfile(selectedUser);

				if (updatedUser != null) {
					request.setAttribute("user", updatedUser);
					request.setAttribute("message", "Update user profile successfully.");
				} else {
					request.setAttribute("message", "Has error when save user profile.");
				}
			} else {
				throw new UserNotFoundException();
			}
		} catch (UserNotFoundException | ParseException e) {
			// If Have error will send back user to sign up page.
			request.setAttribute("message", e.getMessage());
		}

		// Step 4. Create dispatcher and forward data.
		request.getRequestDispatcher("WEB-INF/pages/user-edit-profile.jsp").forward(request, response);
	}

	private boolean isAllowEditProfile(User loggedUser, User updateUser) {
		// If current logged user update profile them self.
		if (updateUser.getId().equalsIgnoreCase(loggedUser.getId())) {
			return true;
		}

		// If current logged user update profile of related user that created by
		// themselves.
		if (iScheduleBO.isRelatedUser(loggedUser.getId(), updateUser.getId())) {
			return true;
		}

		return false;
	}
}
