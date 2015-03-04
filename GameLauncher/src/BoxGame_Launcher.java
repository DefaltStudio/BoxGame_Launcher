import java.io.*;
import java.net.*;

public class BoxGame_Launcher {
	public static void main(String[] args)
	{
		
	}
	
	public static boolean checkFile() 
	{
		File testFile = new File(System.getProperty("user.home") + File.separator);
		return testFile.exists();
	}
	
	public static String getCurrentVersion() throws Exception
	{
		URL url = new URL("http://dev.defalt.net/BocGame/current_version.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine;
		String versionNumberStr = "";
		while ((inputLine = in.readLine()) != null)
		{
			versionNumberStr = inputLine;
		}
		in.close();
		return versionNumberStr;
	}
}
