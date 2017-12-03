package vn.sotaytiemchung.models.utils;

import javax.servlet.http.HttpServletRequest;

import vn.sotaytiemchung.models.bo.UserBO;
import vn.sotaytiemchung.models.bo.UserBOImpl;
import vn.sotaytiemchung.models.dto.User;
import vn.sotaytiemchung.models.dto.UserAccount;

public class SessionManager {

	static UserBO userBo = new UserBOImpl();

	public static User getCurrentLoggedUser(HttpServletRequest request) {
		String loggedUserId = ((UserAccount) request.getSession().getAttribute("logged-account")).getUserId();
		return userBo.findOneUser(loggedUserId);
	}

	public static void initialSession(HttpServletRequest request, UserAccount account) {
		request.getSession().setAttribute("logged-account", account);
	}
}
