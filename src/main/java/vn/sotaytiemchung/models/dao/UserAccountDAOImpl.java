package vn.sotaytiemchung.models.dao;

import vn.sotaytiemchung.models.dto.UserAccount;

public class UserAccountDAOImpl implements UserAccountDAO {

	@Override
	public UserAccount createAccount(String userId, String email, String password) {
		// Step 1: Open database connection.
		// Step 2: Build statement for create new account.
		// Step 3: After create successfully just return.
		return null;
	}

	@Override
	public UserAccount findAccountByEmail(String email) {
		// Step 1: Open database connection.
		// Step 2: Build statement for find account by email.
		// Step 3: If found account just return.
		return null;
	}

	@Override
	public UserAccount findUserByCredential(String email, String password) {
		// Step 1: Open database connection.
		// Step 2: Build statement for find account by email and password.
		// Step 3: If found account just return.
		return null;
	}

}
