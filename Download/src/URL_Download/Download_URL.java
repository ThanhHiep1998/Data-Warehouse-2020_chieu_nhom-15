package URL_Download;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class Download_URL {
    public static void main(String[] args) {
        // Make sure that this directory exists
        String dirName = "C:\\Users\\Thanh Hiep\\Downloads";
        try {
            saveFileFromUrlWithJavaIO(
                dirName + "\\sinhvien_chieu_nhom15.xlsx", "http://drive.ecepvn.org:5000/d/f/558307832617766929?fbclid=IwAR2xrnE2jopujNa5HNexYixIssOI3qxriL_gpH8x-BudUz95IPW9_0kyiEo");
            System.out.println("finished");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Using Java IO
    public static void saveFileFromUrlWithJavaIO(String fileName, String fileUrl)
    throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try { in = new BufferedInputStream(new URL(fileUrl).openStream());
            fout = new FileOutputStream(fileName);
            byte data[] = new byte[4096];
            int count;
            while ((count = in .read(data, 0, 4096)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if ( in != null)
                in .close();
            if (fout != null)
                fout.close();
        }
    }
    // Using Commons IO library
    // Available at http://commons.apache.org/io/download_io.cgi
    public static void saveFileFromUrlWithCommonsIO(String fileName,
        String fileUrl) throws MalformedURLException, IOException {
        FileUtils.copyURLToFile(new URL(fileUrl), new File(fileName));
    }
}