package UtilsBooks;

import java.sql.Connection;
import java.sql.DriverManager;

public class UtilsBooks {
	public static Connection getConnection() {
		try {
			// 2. Load driver JDBC
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// 3. DirverManager ==> connection(host. port. username/password)
			String url = "jdbc:sqlserver://localhost:1433;databaseName=Book_Management;encrypt=true;trustServerCertificate=true";
			String username = "sa";
			String password = "cuonglhfpt";
			
			Connection connect = DriverManager.getConnection(url, username, password);
			return connect;
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
