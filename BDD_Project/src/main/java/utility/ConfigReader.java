package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	
	public static String readData(String propertyName) throws IOException
	{
		String path = "D:\\LEARNINGS\\BDD_PRACTICE\\Java_01Feb25\\BDD_Project\\Config.properties";
		
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);   // file load into memry
		String propertyValue  = prop.getProperty(propertyName);
		
		
		return propertyValue;
	}

}
