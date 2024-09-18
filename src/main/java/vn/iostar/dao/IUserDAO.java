package vn.iostar.dao;

import vn.iostar.models.UserModel;

public interface IUserDAO {
	UserModel findByUsername(String username);
}
