package loadFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//gọi class nó ra
			//khai báo port kết nối, tên database, user password(khi tạo database nó có tkhoan có password đó).. port thường dùng trong sqlserver là 1433
			connection = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DATAWAREHOUSE_data_Student;user=sa; password = 12345678");
			System.out.println("Connect success...");
		}catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error when you connect to database !Error is: " + e.getMessage());
		}
		return connection;

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnection());
	}
}
