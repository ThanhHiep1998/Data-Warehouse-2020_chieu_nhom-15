package loadFile;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=DATAWAREHOUSE_data_Student";
	static String username = "sa";
	static String pass = "12345678";
	public static Connection getConnection(String s1, String s2, String s3) {
		
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//gọi class nó ra
			connection = (Connection) DriverManager.getConnection(s1, s2, s3);
			System.out.println("Connect success...");
		}catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error when you connect to database !Error is: " + e.getMessage());
		}
		return connection;

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		System.out.println(getConnection(jdbcUrl, username, pass));
		LoadFile lf = new LoadFile(getConnection(jdbcUrl, username, pass));
		lf.loadConfig();
	}
}
