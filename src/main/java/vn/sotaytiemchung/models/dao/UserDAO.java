package vn.sotaytiemchung.models.dao;

import vn.sotaytiemchung.models.dto.User;

public interface UserDAO {
	User findOneUser(String id);
	User createUser(User user);
	User updateUser(User user);
}
