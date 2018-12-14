package javase.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class DxcCodilityTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "my.song.mp3 11b \n"
			+"greatSong.flac 1000b \n"
			+"not3.txt 5b \n"
			+"video.mp4 200b \n"
			+"game.exe 100b \n"
			+"mov!e.mkv 10000b";
		
		String test2 = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
		
		System.out.println(getAllFileSize(test2));
	}
	
	public static String getAllFileSize(String s)
	{
		
		ArrayList<Integer> musicFileSize = new ArrayList<>();
		
		ArrayList<Integer> imagesFileSize = new ArrayList<>();
		
		ArrayList<Integer> moviesFileSize = new ArrayList<>();
		
		ArrayList<Integer> otherFileSize = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new StringReader(s)))
		{
			String line ;
			while((line = reader.readLine()) != null)
			{
				
				String [] lineContents = line.split("\\s+");
				if(lineContents != null && lineContents.length > 1)
				{
					String fileNameExt = getExtension(lineContents[0]);
					int fileSize = getSize(lineContents[1]);
					
					switch(fileNameExt)
					{
					case "mp3":
						musicFileSize.add(fileSize);
						break;
					case "aac":
						musicFileSize.add(fileSize);
						break;
					case "flac":
						musicFileSize.add(fileSize);
						break;
					case "jpg":
						imagesFileSize.add(fileSize);
						break;
					case "bmp":
						imagesFileSize.add(fileSize);
						break;
					case "gif":
						imagesFileSize.add(fileSize);
						break;
					case "mp4":
						moviesFileSize.add(fileSize);
						break;
					case "avi":
						moviesFileSize.add(fileSize);
						break;
					case "mkv":
						moviesFileSize.add(fileSize);
						break;
					case "7z":
						otherFileSize.add(fileSize);
						break;
					case "txt":
						otherFileSize.add(fileSize);
						break;
					case "zip":
						otherFileSize.add(fileSize);
						break;
						default:
							otherFileSize.add(fileSize);
							break;
					}
				}
				 
			}
		}
		catch(IOException ex)
		{}
		
		
		StringBuilder strResult = new StringBuilder();
		strResult.append(musicFileSize.size() > 0 ? "music "+calcSize(musicFileSize)+"b \n" : "music 0b \n");
		strResult.append(imagesFileSize.size() > 0 ? "images "+calcSize(imagesFileSize)+"b \n" : "images 0b \n");
		strResult.append(moviesFileSize.size() > 0 ? "movies "+calcSize(moviesFileSize)+"b \n" : "movies 0b \n");
		strResult.append(otherFileSize.size() > 0 ? "other "+calcSize(otherFileSize)+"b \n" : "other 0b \n");
		
		return strResult.toString();
	}
	
	public static String getExtension(String line)
	{
		String [] strLine = line.split("\\.");
		return (strLine != null && strLine.length > 0) ? strLine[strLine.length -1] : "";
	}
	
	public static int getSize(String line)
	{
		String[] strLine = line.split("b");
		//need condition
		return (strLine != null && strLine.length > 0) ? Integer.parseInt(strLine[0]) : 0;
	}
	
	public static int calcSize(ArrayList<Integer> arr)
	{
		int size = 0;
		if(arr != null && arr.size() > 0)
		{
			for(int i : arr)
				size +=i;
		}
		else
			return 0;
		
		return size;
	}

}
