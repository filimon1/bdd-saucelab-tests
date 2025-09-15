package util.driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static String get_Browser= "";
	protected static String base_URL="";
	protected static String get_username= "";
	protected static String get_password="";
	public static WebDriver driver= null;
	
	public static WebDriver getDriver() throws IOException {
		
		Properties prop = new Properties();
		InputStream input= new FileInputStream("SauceLab.properties");
		prop.load(input);
		
		get_Browser=prop.getProperty("browser");
		base_URL=prop.getProperty("url");
		get_username=prop.getProperty("username");
		get_password=prop.getProperty("password");
		
		if (get_Browser==null) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(get_Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(get_Browser.equalsIgnoreCase("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}

		return driver;
	}
	
	public static String get_base_URL() {
		return base_URL;
		
	}
	
	
}
