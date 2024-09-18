package vn.iostar.services.Impl;

import vn.iostar.dao.IUserDAO;
import vn.iostar.dao.Impl.UserDaoImpl;
import vn.iostar.models.UserModel;
import vn.iostar.services.IUserService;

public class UserServiceImpl implements IUserService{
	
	IUserDAO userDao = new UserDaoImpl();
	@Override
	public UserModel findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.findByUsername(username);
		if (user != null && password.equals(user.getPassword())) {
		return user;
		}
		return null;
	}

}
