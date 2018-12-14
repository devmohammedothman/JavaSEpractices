//package javase.ocp;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.util.Vector;
//
//import com.jcraft.jsch.Channel;
//import com.jcraft.jsch.ChannelSftp;
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.Session;
//import com.jcraft.jsch.SftpException;
//
//public class ReadRemoteFileBySSH {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		
//		String SFTPHOST = "192.168.1.39";
//        int SFTPPORT = 22;
//        String SFTPUSER = "root";
//        String SFTPPASS = "root";
//        String SFTPWORKINGDIR = "/home/";
//
//        Session session = null;
//        Channel channel = null;
//        ChannelSftp channelSftp = null;
//
//        try {
//            JSch jsch = new JSch();
//            session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
//            session.setPassword(SFTPPASS);
//            java.util.Properties config = new java.util.Properties();
//            config.put("StrictHostKeyChecking", "no");
//            session.setConfig(config);
//            session.connect();
//            channel = session.openChannel("sftp");
//            channel.connect();
//            System.out.println("Session and Channel Connected " + channel.isConnected());
//            channelSftp = (ChannelSftp) channel;
//            channelSftp.cd(SFTPWORKINGDIR);
//            try{
//        	    Vector vv= channelSftp.ls(SFTPWORKINGDIR);
//        	    if(vv!=null){
//        	      for(int ii=0; ii<vv.size(); ii++){
//        	    	  //        		out.println(vv.elementAt(ii).toString());
//
//                        Object obj=vv.elementAt(ii);
//                        if(obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry){
//                          System.out.println(((com.jcraft.jsch.ChannelSftp.LsEntry)obj).getLongname());
//                        }
//
//        	      }
//        	    }
//        	  }
//        	  catch(SftpException e){
//        	    System.out.println(e.toString());
//        	  }
//            
//            byte[] buffer = new byte[1024];
//            InputStream bis = new BufferedInputStream(channelSftp.get("myfile.csv"));
//            
//            BufferedReader br = new BufferedReader(new InputStreamReader(bis));
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            
////            File newFile = new File("C:/Test.java");
////            OutputStream os = new FileOutputStream(newFile);
////            BufferedOutputStream bos = new BufferedOutputStream(os);
////            int readCount;
////            while ((readCount = bis.read(buffer)) > 0) {
////                System.out.println("Writing: "+buffer.toString());
////                bos.write(buffer, 0, readCount);
////            }
//            bis.close();
////            bos.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        finally
//        {
//         channelSftp.disconnect();
//         session.disconnect();
//        }
//	}
//
//}
