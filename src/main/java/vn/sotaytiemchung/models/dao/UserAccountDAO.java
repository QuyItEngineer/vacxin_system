package vn.sotaytiemchung.models.dao;

import vn.sotaytiemchung.models.dto.UserAccount;

public interface UserAccountDAO {
	public UserAccount createAccount(String userId, String email, String password);

	public UserAccount findAccountByEmail(String email);

	public UserAccount findUserByCredential(String email, String password);
}
