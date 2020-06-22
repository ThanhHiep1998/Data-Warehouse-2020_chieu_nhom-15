package TH;

import com.chilkatsoft.CkGlobal;
import com.chilkatsoft.CkScp;
import com.chilkatsoft.CkSsh;

public class DownloadBySCP {
	static {
		try {
			System.loadLibrary("chilkat");
		} catch (UnsatisfiedLinkError e) {
			System.err.println("Native code library failed to load.\n" + e);
			System.exit(1);
		}
	}

	public static void download(String hostName, int port, String userName, String pass, String remotePath,String localPath) {
		CkSsh ssh = new CkSsh();

		// unclock .....
		CkGlobal ck = new CkGlobal();
		ck.UnlockBundle("Quang");

		// Connect to an SSH server:
		boolean success = ssh.Connect(hostName, port);
		if (!success) {
			System.out.println(ssh.lastErrorText());
			return;
		}

		// Wait a max of 3 seconds when reading responses..
		ssh.put_IdleTimeoutMs(3000);

		// Authenticate using login/password:
		success = ssh.AuthenticatePw(userName, pass);
		if (!success) {
			System.out.println(ssh.lastErrorText());
			return;
		}
		CkScp scp = new CkScp();
		success = scp.UseSsh(ssh);
		if (!success) {
			System.out.println(ssh.lastErrorText());
			return;
		}
		
		// download directory
		scp.put_SyncMustMatch("sinhvien_chieu*.*");
//		String remotePath = "/volume1/ECEP/song.nguyen/DW_2020/data";
//		String localPath = "D:\\tai_lieu\\datawarehouse_song\\baitap\\file_data";
		
		
		
		/* 
		 Download synchronization modes:
	     	mode=0: Download all files
	     	mode=1: Download all files that do not exist on the local filesystem.
	     	mode=2: Download newer or non-existant files.
	     	mode=3: Download only newer files.  
	              If a file does not already exist on the local filesystem, it is not downloaded from the server.
	     	mode=5: Download only missing files or files with size differences.
	     	mode=6: Same as mode 5, but also download newer files. 
	     */
		success = scp.SyncTreeDownload(remotePath, localPath, 2, false);
		if (!success) {
			System.out.println(ssh.lastErrorText());
			return;
		}

		System.out.println("SCP download file success.");
		
		
		// đóng kết nối
		ssh.Disconnect();

	}

	public static void main(String[] args) {
		download("drive.ecepvn.org", 2227, "guest_access", "123456", "/volume1/ECEP/song.nguyen/DW_2020/data","D:\\tai_lieu\\datawarehouse_song\\baitap\\file_data");

	}
		
	}
