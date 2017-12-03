package vn.sotaytiemchung.models.bo;

import vn.sotaytiemchung.exceptions.AccountException;
import vn.sotaytiemchung.exceptions.UserAuthenticationException;
import vn.sotaytiemchung.models.dao.UserAccountDAO;
import vn.sotaytiemchung.models.dao.UserAccountDAOImpl;
import vn.sotaytiemchung.models.dto.User;
import vn.sotaytiemchung.models.dto.UserAccount;

public class UserAccountBOImpl implements UserAccountBO {
	UserAccountDAO userAccountDAO;
	UserBO userBO;

	public UserAccountBOImpl() {
		// Create instance of services class.
		userAccountDAO = new UserAccountDAOImpl();
		userBO = new UserBOImpl();
	}

	@Override
	public UserAccount signup(User user, String email, String password) throws AccountException {
		// Step 1: Check if email already used by other user.
		if (userAccountDAO.findAccountByEmail(email) != null) {
			throw new AccountException("Email already exits");
		}
		// Step 2: Create new user profile.
		User newUser = userBO.createUser(user);

		if (newUser != null) {
			// Step 3: Create new account with user profile.
			UserAccount newAccount = userAccountDAO.createAccount(newUser.getId(), email, password);

			// Step 4: Return new account if create successfully.
			if (newAccount != null)
				return newAccount;

			throw new AccountException("Has problem when create user account.");
		} else {
			throw new AccountException("Has problem when create user profile.");
		}
	}

	@Override
	public UserAccount signin(String email, String password) throws UserAuthenticationException {
		// Step 1: Check if email is exits.
		UserAccount userAccount = userAccountDAO.findAccountByEmail(email);

		if (userAccount == null) {
			throw new UserAuthenticationException("Email not exits.");
		}

		// Step 2: Compare password, if equals will return.
		if (userAccount.getPassword().equalsIgnoreCase(password)) {
			return userAccount;
		} else {
			throw new UserAuthenticationException("Password not correct.");
		}
	}
}
