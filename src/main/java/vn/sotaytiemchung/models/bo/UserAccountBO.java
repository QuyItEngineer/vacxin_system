package vn.sotaytiemchung.models.bo;

import vn.sotaytiemchung.exceptions.AccountException;
import vn.sotaytiemchung.exceptions.UserAuthenticationException;
import vn.sotaytiemchung.models.dto.User;
import vn.sotaytiemchung.models.dto.UserAccount;

public interface UserAccountBO {
	public UserAccount signup(User user, String email, String password) throws AccountException;
	
	public UserAccount signin(String email, String password) throws UserAuthenticationException;
}
