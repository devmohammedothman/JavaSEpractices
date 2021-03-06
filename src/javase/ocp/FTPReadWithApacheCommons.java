//package javase.ocp;
//
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//import org.apache.commons.net.ftp.*;
//
//public class FTPReadWithApacheCommons {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String server = "192.168.1.39";
//        int port = 21;
//        String user = "root";
//        String pass = "root";
// 
//        FTPClient ftpClient = new FTPClient();
//        try {
// 
//            ftpClient.connect(server, port);
//            ftpClient.login(user, pass);
//            ftpClient.enterLocalPassiveMode();
//            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
// 
////            // APPROACH #1: using retrieveFile(String, OutputStream)
////            String remoteFile1 = "/365.csv";
////            File downloadFile1 = new File("/Downloads/downloaded_365.csv");
////            OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
////            boolean success = ftpClient.retrieveFile(remoteFile1, outputStream1);
////            outputStream1.close();
//// 
////            if (success) {
////                System.out.println("File #1 has been downloaded successfully.");
////            }
// 
//            // APPROACH #2: using InputStream retrieveFileStream(String)
//            String remoteFile2 = "/365.csv";
//            File downloadFile2 = new File("/Downloads/downloaded_365.csv");
//            OutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream(downloadFile2));
//            InputStream inputStream = ftpClient.retrieveFileStream(remoteFile2);
//            byte[] bytesArray = new byte[4096];
//            int bytesRead = -1;
//            while ((bytesRead = inputStream.read(bytesArray)) != -1) {
//                outputStream2.write(bytesArray, 0, bytesRead);
//            }
// 
//            boolean success = ftpClient.completePendingCommand();
//            if (success) {
//                System.out.println("File #2 has been downloaded successfully.");
//            }
//            outputStream2.close();
//            inputStream.close();
// 
//        } catch (IOException ex) {
//            System.out.println("Error: " + ex.getMessage());
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (ftpClient.isConnected()) {
//                    ftpClient.logout();
//                    ftpClient.disconnect();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//	}
//
//}
