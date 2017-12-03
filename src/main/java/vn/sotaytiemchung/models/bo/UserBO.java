package vn.sotaytiemchung.models.bo;

import vn.sotaytiemchung.models.dto.User;

public interface UserBO {
	public User updateProfile(User user);

	public User createUser(User user);

	public User findOneUser(String id);

	public User createRelatedUser(User relatedUser, String primaryUserId);
}
