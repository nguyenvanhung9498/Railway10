package backend.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import backend.*;

import entity.*;
import ultils.JDBCUltils;

public class UserRepository implements IUserRepository {
	@Override
	public ArrayList<User> getUser(int id) {

		String sqlString1 = "select* " + "FROM	`user` u  "
				+ "join `ProjectAndUser` pau on pau.userId = u.id  where projectId=? ";
		ArrayList<User> listuser = new ArrayList<>();
		PreparedStatement pStatement;
		try {
			pStatement = JDBCUltils.getIntance().getConnection().prepareStatement(sqlString1);
			pStatement.setInt(1, id);
			ResultSet resultSet = pStatement.executeQuery();
			while (resultSet.next()) {
				if (resultSet.getString("Role").toLowerCase().equals("manager")) {
					Manager managerQuery = new Manager(resultSet.getInt("id"), resultSet.getString("fullName"),
							resultSet.getString("email"), resultSet.getString("password"));

					listuser.add(managerQuery);
				} else if (resultSet.getString("Role").toLowerCase().equals("employee")) {
					Employee employeeQuery = new Employee(resultSet.getInt("id"), resultSet.getString("fullName"),
							resultSet.getString("email"), resultSet.getString("password"),
							resultSet.getInt("projectId"));
					listuser.add(employeeQuery);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listuser;

	}

	@Override
	public ArrayList<Manager> getListManager() {
		ArrayList<Manager> listManager = new ArrayList<>();
		String sql = "select* " + "FROM	`user` u  " + "join `manager` m on m.id = u.id  "
				+ "join `ProjectAndUser` pau on pau.userId = u.id";
		try {

			Statement statement = JDBCUltils.getIntance().getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Manager managerQuery = new Manager(resultSet.getInt("id"), resultSet.getString("fullName"),
						resultSet.getString("email"), resultSet.getString("password"), resultSet.getInt("expInYear"));
				listManager.add(managerQuery);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listManager;

	}

	@Override
	public ArrayList<User> getListUsers() {
		ArrayList<User> listUser = new ArrayList<>();
		String sqlQuery = "SELECT * FROM `user`";

		ResultSet resultSet;
		try {
			resultSet = JDBCUltils.getIntance().excecuteQuery(sqlQuery);
			while (resultSet.next()) {
				User user = new User(resultSet.getInt("id"), resultSet.getString("fullName"),
						resultSet.getString("email"), resultSet.getString("password"));
				listUser.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listUser;

	}
}
