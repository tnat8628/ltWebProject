package vn.iostar.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vn.iostar.configs.DBConnectMySQL;
import vn.iostar.dao.IUserDAO;
import vn.iostar.models.UserModel;

public class UserDaoImpl implements IUserDAO{
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public UserModel findByUsername(String username) {
		
		String sql = "SELECT * FROM ltweb.users WHERE username = ? ";
		try {
			new DBConnectMySQL();
			conn = DBConnectMySQL.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
			UserModel user = new UserModel();
			user.setId(rs.getInt("id"));
			user.setEmail(rs.getString("email"));
			user.setUsername(rs.getString("username"));
			user.setFullname(rs.getString("fullname"));
			user.setPassword(rs.getString("password"));
			user.setImages(rs.getString("images"));
			user.setRoleid(Integer.parseInt(rs.getString("roleid")));
			user.setPhone(rs.getString("phone"));
			user.setCreatedate(rs.getDate("createdate"));
			return user;}
		} catch (Exception e) {
			e.printStackTrace();
		}
			return null;
	}
	// Test chương trình. Kích phải chuột chọn run as->java application
		public static void main(String[] args) {
			try {
				IUserDAO user = new UserDaoImpl();
				System.out.println(user.findByUsername("thu"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
