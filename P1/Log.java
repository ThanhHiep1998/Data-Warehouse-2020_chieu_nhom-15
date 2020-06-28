package TH;


public class Log {
	String id_log;
	String id_config;
	String file_name;
	String status;
	String file_type;
	String date_download;
	String date_staging;
	

	public Log(String id_log, String id_config, String file_name, String status, String file_type, String date_download,String date_staging) {
		this.id_log = id_log;
		this.id_config = id_config;
		this.file_name = file_name;
		this.status = status;
		this.file_type = file_type;
		this.date_download = date_download;
		this.date_staging = date_staging;
	}

	

	public String getId_log() {
		return id_log;
	}

	public void setId_log(String id_log) {
		this.id_log = id_log;
	}

	public String getId_config() {
		return id_config;
	}

	public void setId_config(String id_config) {
		this.id_config = id_config;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

	public String getDate_download() {
		return date_download;
	}

	public void setDate_down(String date_download) {
		this.date_download = date_download;
	}

	public String getDate_staging() {
		return date_staging;
	}

	public void setDate_staging(String date_staging) {
		this.date_staging = date_staging;
	}


}
