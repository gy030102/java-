package service;

import java.sql.ResultSet;
import java.sql.SQLException;

import configuration.DBOperation;
import model.User;

public class UserService {

	public User getById(String id) throws SQLException {
		// TODO 测试代码，后续需要完善
		String sqlString = "";
		ResultSet resultSet = DBOperation.query(sqlString);
		User user = new User();
		resultSet.next();
		resultSet.getString("id");
		// ...
		return user;
	}
}
