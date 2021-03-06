package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.busines.Product;
import prs.exception.PrsDataException;

public class ProductDb {

	public ProductDb() {

	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;
	}

	public List<Product> getAll() {
		String selectAll = "SELECT * FROM Product";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {
			List<Product> products = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("ID");
				int vendorId = rs.getInt("VendorId");
				String partNumber = rs.getString("PartNumber");
				String name = rs.getString("Name");
				double price = rs.getDouble("Price");
				String unit = rs.getString("Unit");
				String photoPath = rs.getString("PhotoPath");

				Product product = new Product(id, vendorId, partNumber, name, price, unit, photoPath);

				products.add(product);
			}

			return products;

		} catch (SQLException e) {
			throw new PrsDataException("CError retrieving prodcuts. Msg: " + e.getMessage());
		}
	}

}
