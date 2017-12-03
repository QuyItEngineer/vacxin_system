package vn.sotaytiemchung.models.bo;

import vn.sotaytiemchung.models.dao.UserDAO;
import vn.sotaytiemchung.models.dao.UserDAOImpl;
import vn.sotaytiemchung.models.dto.User;

public class UserBOImpl implements UserBO {
	UserDAO userDAO;

	public UserBOImpl() {
		// Create instance of services class.
		userDAO = new UserDAOImpl();
	}

	@Override
	public User updateProfile(User user) {
		// Step 1: Do validate input data.
		if (validationUserData(user)) {
			return userDAO.updateUser(user);
		}

		return null;
	}

	@Override
	public User createUser(User user) {
		// Step 1: Do validate input data.
		if (validationUserData(user)) {
			return userDAO.createUser(user);
		}

		return null;
	}

	@Override
	public User findOneUser(String id) {
		if (id == null) {
			return null;
		}

		return userDAO.findOneUser(id);
	}

	private boolean validationUserData(User user) {
		return true;
	}

	@Override
	public User createRelatedUser(User relatedUser, String primaryUserId) {
		// Step 1: Create new user profile.
		// Step 2: Create related user record for make relationship.
		return null;
	}
}
