package vn.sotaytiemchung.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.sotaytiemchung.exceptions.AccountException;
import vn.sotaytiemchung.models.bo.UserAccountBO;
import vn.sotaytiemchung.models.bo.UserAccountBOImpl;
import vn.sotaytiemchung.models.dto.User;
import vn.sotaytiemchung.models.dto.UserAccount;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserAccountBO userAccountBO;

	public SignupServlet() {
		super();
		userAccountBO = new UserAccountBOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. Create dispatcher for forward data for JSP file.
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/signup.jsp");

		// 2. Forward all data to signup.jsp file for process render view.
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String targetPage;

		// Step 1: Get user data from client input form.
		User newUser = new User();

		newUser.setName(request.getParameter("uName"));
		newUser.setTelephone(request.getParameter("uTelephone"));
		// TODO: Implement cover date string to date.
		newUser.setBirthday(null);
		newUser.setWeight(Integer.parseInt(request.getParameter("uWeight")));

		try {
			// Step 2: Do sign up user with credential information.
			UserAccount account = userAccountBO.signup(newUser, request.getParameter("uEmail"),
					request.getParameter("uPassword"));

			// Step 3: After sign up completed, do save new user account to session.
			request.getSession().setAttribute("account", account);

			// Set target redirect page is dash board.
			targetPage = "/WEB-INF/pages/dashboard.jsp";

		} catch (AccountException e) {
			// If Have error will send back user to sign up page.
			request.setAttribute("message", e.getMessage());

			// Send back user to sign up page.
			targetPage = "/WEB-INF/pages/signup.jsp";
		}

		// Step 3. Create dispatcher for forward data for JSP file.
		RequestDispatcher rd = request.getRequestDispatcher(targetPage);

		// Step 4. Forward all data to signup.jsp file for process render view.
		rd.forward(request, response);
	}
}
