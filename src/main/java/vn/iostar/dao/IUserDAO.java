package vn.iostar.dao;

import vn.iostar.models.UserModel;

public interface IUserDAO {
	UserModel findByUsername(String username);
	
	void insertUser(UserModel user);
	
	boolean checkExistUsername(String username);
	
	boolean checkExistEmail(String email);
	
	boolean checkExistPhone(String phone);
	
	void updatePassword(String username, String newPassword);
}
