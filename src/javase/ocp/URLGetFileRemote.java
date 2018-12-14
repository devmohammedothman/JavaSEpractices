package javase.ocp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class URLGetFileRemote {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		URL url;
		try {
			 File file = new File("\\\\192.168.1.39\\365.csv");
			// file.toURI().toURL();
			url = file.toURI().toURL(); //new URL("file://root:root@192.168.1.39/365.csv");
			
			URLConnection connection = url.openConnection();
			System.out.println("connection -->"+connection);
			System.out.println("connection 11111-->"+connection.getURL());
			connection.setDoInput(true);
			InputStream inStream = connection.getInputStream();
			System.out.println("inStream -->"+inStream.toString());
			BufferedReader input = new BufferedReader(new InputStreamReader(
			        inStream));
			String line = "";
			Map<String,String> monitors = new HashMap<String, String>();
			String[] str = null;
			while ((line = input.readLine()) != null){
				System.out.println("Files in the folder are -->"+line);
			    /*str = line.split(":");
			    monitors.put(str[0], str[1]);
			    logger.info(str[0]+" --- "+str[1]);*/
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
