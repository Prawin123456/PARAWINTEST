package test_Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_file {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		String Browser = prop.getProperty("browser");
		String Username = prop.getProperty("user_name");
		String Password = prop.getProperty("user_password");
		
		
		
	}

}
