package loadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadFile {
	Connection connection;

	public LoadFile(Connection connection) {
		super();
		this.connection = connection;
	}

	public void loadConfig() throws SQLException, ClassNotFoundException, IOException {
		String source;
		String destination;
		String username_source;
		String username_des;
		String pass_source;
		String pass_des;
		String fileName;
		String delimited;
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from config");
		while (rs.next()) {
			source = rs.getString("source");
			destination = rs.getString("destination");
			username_source = rs.getString("username_source");
			username_des = rs.getString("username_des");
			pass_source = rs.getString("pass_source");
			pass_des = rs.getString("pass_des");
			fileName = rs.getString("fileDataName");
			delimited = rs.getString("delimited");
			loadFileCSV(source, username_source, pass_source, delimited, fileName);
			System.out.println("sucessful");
		}

	}

	public void loadFileCSV(String source, String username, String pass, String delimited, String excelFile)
			throws ClassNotFoundException, SQLException, IOException {
//		String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=DATAWAREHOUSE_data_Student";
//		String username = "sa";
//		String password = "12345678";
		Connection connect = null;
		connect = DriverManager.getConnection(source, username, pass);
		System.out.println("Connect DB Successfully :)");

		BufferedReader lineReader = new BufferedReader(new FileReader(excelFile));
		String lineText = null;

		int count = 0;
		String sql;

		lineText = lineReader.readLine();
		sql = "CREATE TABLE students " + "(Number INT not NULL, " + " Id NVARCHAR(20) not Null, "
				+ " LastName NVARCHAR(50), " + " FirstName NVARCHAR(20), " + " NameClass NVARCHAR(50), "
				+ " Address NVARCHAR(255), " + " NumPhone NVARCHAR(50), " + " Email NVARCHAR(50), "
				+ " Note NVARCHAR(255), " + " PRIMARY KEY ( Id ))";
		System.out.println(sql);
		PreparedStatement preparedStatement = connect.prepareStatement(sql);
		preparedStatement.execute();
		System.out.println("Create table Successfully :)");

		// skip header line
		String query = "INSERT INTO  students VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pre = connect.prepareStatement(query);
		while ((lineText = lineReader.readLine()) != null) {
			String[] data = lineText.split(",");
			System.out.println("length: " + data.length);
			String number = data[0];
			String id = data[1];
			String lastName = data[2];
			String firstName = data[3];
			String nameclass = data[4];
			String address = data[5];
			String numPhone = data[6];
			String email = data[7];
			String note = data[8];

			pre.setString(1, number);
			pre.setString(2, id);
			pre.setString(3, lastName);
			pre.setString(4, firstName);
			pre.setString(5, nameclass);
			pre.setString(6, address);
			pre.setString(7, numPhone);
			pre.setString(8, email);
			pre.setString(9, note);
			pre.execute();
			System.out.println("Insert......");

		}
	}

}
