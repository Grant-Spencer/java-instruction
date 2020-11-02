package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.busines.User;
import prs.exception.PrsDataException;

public class UserDb {

	public UserDb() {

	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;
	}

	public List<User> getAll() {
		String selectAll = "SELECT * FROM User";

		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {

			List<User> users = new ArrayList<>;
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNUmber");
				String email = rs.getString("email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isAdmin");
				
				User user = new User(id, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
						
						users.add(user);
			}
			
		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving users. Msg: " + e.getMessage());
		}
	}

	public User autheticateUser(String userName, String password) {
		String selectByUserAndPass = "SELECT * FROM user WHERE Username =? AND password = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(selectByUserAndPass);) {
			ps.setString(1, userName);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				int id = rs.getInt("ID");
				String userNameFromDb  = rs.getString("UserName");
				String passwordFromDb  = rs.getString("Password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNUmber");
				String email = rs.getString("email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isAdmin");
				
				User user = new User(id, userNameFromDb, passwordFromDb, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
			
						return user;
			}else {
				return null;
			}
		} catch (SQLException e) {
			throw new PrsDataException("Error authenticating user. Msg: " + e.getMessage());
		}
	}
}
