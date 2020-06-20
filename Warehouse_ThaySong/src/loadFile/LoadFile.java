package loadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadFile {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		LoadFile lf = new LoadFile();
		lf.load(",", "E:\\TaiLieuHocTap\\Datawarehouse\\sinhvien_chieu_nhom15.csv");
//		ex.copy("", "");E:\TaiLieuHocTap\Datawarehouse
	}

	public void load(String delimited, String excelFile) throws ClassNotFoundException, SQLException, IOException {

		Connection connect = DBConnection.getConnection();
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
