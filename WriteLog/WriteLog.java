package TH;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.chilkatsoft.CkGlobal;
import com.chilkatsoft.CkScp;
import com.chilkatsoft.CkSsh;


public class WriteLog {
	
//	 khai báo 
	Config config = new Config();
	public static WriteLog writeLog = new WriteLog();
	
	
	//tạo kết nối tới config
	
	public void connectConfig(String idConFig) {
		try {
			Connection connectControlDB = ConnectDB.getConnection("jdbc:mysql://localhost:3306/controldb", "root","sa123");
			Statement statement_controldb = connectControlDB.createStatement();
			String sql = "Select id, source, destination, username_Source,username_Des, pw_Source,pw_Des,delimiters, port from config where id ='"+ idConFig + "'";
			ResultSet rs = statement_controldb.executeQuery(sql);
				
			// Di chuyển con trỏ xuống bản ghi kế tiếp.
			while (rs.next()) {
				// set giá trị 
				config.setId(rs.getString(1));
				config.setSource(rs.getString(2));
				config.setDestination(rs.getString(3));
				config.setUsername_Source(rs.getString(4));
				config.setUsername_Des(rs.getString(5));
				config.setPw_Source(rs.getString(6));
				config.setPw_Des(rs.getString(7));
				config.setDelimiters(rs.getString(8));
				config.setPort(rs.getString(9));
				}
				
			// Đóng kết nối
			connectControlDB.close();
			config.toString();
				
			} catch (SQLException e) {
				System.out.println("error statement");
				e.printStackTrace();
			}
		}
	
	
	// thực hiện download file từ sever
//	public static void download(String hostName, int port, String userName, String pass, String remotePath,String localPath) 
		public static void DownloadBySCP() {
		// khai báo biến
			String path = writeLog.config.getSource();
			String hostName = writeLog.getHost(path);
			String remotePath = writeLog.getRemotePath(path);
			int port = Integer.parseInt(writeLog.config.getPort());
			String userName = writeLog.config.getUsername_Source();
			String pass = writeLog.config.getPw_Source();
			String localPath =  "D:\\quang";

			
			CkSsh ssh = new CkSsh();
			CkGlobal glob = new CkGlobal();
			glob.UnlockBundle("Anything for 30-day trial");
			
			//kết nối tới máy chủ ssh
			boolean success = ssh.Connect(hostName, port);
			if (success != true) {
				System.out.println(ssh.lastErrorText());
				return;
			}
			// đợi 5s để đọc phản hồi
			ssh.put_IdleTimeoutMs(5000);
			
			// Xác thực bằng tên đăng nhập / mật khẩu:
			success = ssh.AuthenticatePw(userName, pass);
			if (success != true) {
				System.out.println(ssh.lastErrorText());
				return;
			}
			
			// kết nối thành công rồi sử dụng
			CkScp scp = new CkScp();
			success = scp.UseSsh(ssh);
			if (success != true) {
				System.out.println(scp.lastErrorText());
				return;
			}
			
			// Download synchronization modes:
			// mode=0: Download all files
			// mode=1: Download all files that do not exist on the local filesystem.
			// mode=2: Download newer or non-existant files.
			// mode=3: Download only newer files.
			// If a file does not already exist on the local filesystem, it is not
			// downloaded from the server.
			// mode=5: Download only missing files or files with size differences.
			// mode=6: Same as mode 5, but also download newer files.
			int mode = 2;
			
			// download theo định dạng
			scp.put_SyncMustMatch("sinhvien_chieu*");
			success = scp.SyncTreeDownload(remotePath, localPath, mode, false);
			if (success != true) {
				System.out.println(scp.lastErrorText());
				return;
			}
			System.out.println("SCP download file success.");
			System.out.println("-------------------------------");
			ssh.Disconnect();
		}
		
		static {
			try {
				System.loadLibrary("chilkat");
			} catch (UnsatisfiedLinkError e) {
				System.err.println("Native code library failed to load.\n" + e);
				System.exit(1);
			}
		}
		
		
	//   drive.ecepvn.org/volume1/ECEP/song.nguyen/DW_2020/data	
		
	//cắt ra phần host
	public String getHost(String path) {
		String hostName = "";
		int num = path.indexOf("/");
		hostName = path.substring(0, num);
		return hostName;
	}
	
	
	// cắt ra phần remotepath
	public String getRemotePath(String path) {
		String remotePath = "";
		int num = path.indexOf("/");
		remotePath = path.substring(num);
		return remotePath;
	}
	
	
	
	// duyệt rồi ghi log cho từng file
		public void checkFile() {
			File Folder = new File("D:\\quang");
			File[] childFile = Folder.listFiles();
			for (File file : childFile) {
				executeWriteLog(file);
					
		}
	}

	// thực hiện việc ghi log
	public void executeWriteLog(File file) {
		// lấy ngày, giờ  ghi log
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date s = new Date();
		String dateFormat = formatter.format(s);

		try {
			// tạo kết nối để thực hiện việc ghi log
			Connection connectControlDB = ConnectDB.getConnection("jdbc:mysql://localhost:3306/controldb?useSSL=false","root", "sa123");
			String sql_insert = "insert into log (id_log, id_config, file_name, status, file_type,date_download,date_staging) values (?,?,?,?,?,?,?)";
			PreparedStatement statement = connectControlDB.prepareStatement(sql_insert);
			statement.setString(1, config.getId().concat(file.getName()));
			statement.setString(2, config.getId());
			statement.setString(3, file.getName());
			statement.setString(4, "ER");
			statement.setString(5, writeLog.getExtend(file.getAbsolutePath()));
			statement.setString(6, dateFormat);
			statement.setString(7, "NULL");

			statement.executeUpdate();
			
			// đóng kết nối
			connectControlDB.close();
			
			// in ra màn hình
			System.out.println("write log: " + file.getName());
			System.out.println("------------------------------");
			
			
		} catch (Exception e) {
			System.out.println("fail");
			System.out.println(e);
		}

	}
	
	//cắt lấy phần đuôi
	public String getExtend(String path) {
		String extend = "";
		int num = path.indexOf(".") + 1;
		extend = path.substring(num);
		return extend;
	}

		
	public static void main(String[] args) {
//		String hostname = "drive.ecepvn.org";
//		int port = 2227;
//		String user = "guest_access";
//		String pw = "123456";
//		String remotePath = "/volume1/ECEP/song.nguyen/DW_2020/data";
//		String localPath = "D:\\quang";
//		DownloadBySCP(hostname, port, user, pw, remotePath, localPath);
//	 	writeLog.executeWriteLog(new File("D:\\sv.xlsx"));
		writeLog.connectConfig("1");
		writeLog.DownloadBySCP();
		writeLog.checkFile();
	}
	}

