package vn.iostar.services;

import vn.iostar.models.UserModel;

public interface IUserService {
	UserModel findByUsername(String username);
	UserModel login(String username, String password);
}
