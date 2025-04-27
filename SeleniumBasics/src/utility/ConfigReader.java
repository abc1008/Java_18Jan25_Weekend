package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public static String readData(String propertyName) throws IOException
	{
		String path = "D:\\TRAININGS\\Selenium_JAVA_18JAN25_WEEKEND\\GIT_LOCAL_REPO\\Java_18Jan25_Weekend\\SeleniumBasics\\Config.properties";
		FileInputStream file = new FileInputStream(path);
		
		Properties prop  = new Properties();
		prop.load(file);  						 // load/open file
		
		String data = prop.getProperty(propertyName);  // read the data from file
		
		System.out.println(data);
		
		return data;
	}

}
