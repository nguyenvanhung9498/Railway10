package ultils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import constants.JDBCProperties;

public class JDBCUltils {
	private static JDBCUltils intance;
	private static Connection connection;

	private JDBCUltils() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(JDBCProperties.DB_URL, JDBCProperties.DB_USER,
						JDBCProperties.DB_PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static JDBCUltils getIntance() {
		if (intance == null) {
			intance = new JDBCUltils();
		}
		return intance;
	}

	public void removeIntance() {
		intance = null;
		connection = null;
	}

	public ResultSet excecuteQuery(String sqlQuery) throws SQLException {
		ResultSet resultSet = null;
		Statement statement = connection.createStatement();
		resultSet = statement.executeQuery(sqlQuery);
		return resultSet;
	}

	public Connection getConnection() {
		return connection;
	}

}
