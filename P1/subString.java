package TH;

public class subString {
	
	public static void main(String[] args) {
		
		String path = "drive.ecepvn.org/volume1/ECEP/song.nguyen/DW_2020/data";
		int num = path.indexOf("/");
		String hostName= path.substring(0,num);
		System.out.println(hostName);
		
		String remotePath = "";
		int num1 = path.indexOf("/");
		remotePath = path.substring(num1);
		System.out.println(remotePath);
		
		String path2 = "sinhvien_chieu_nhom10.xlsx";
		String ex = "";
		int num2 = path2.indexOf(".") + 1;
		ex = path2.substring(num2);
		System.out.println(ex);
		   
		    
	}

	}
	
	
