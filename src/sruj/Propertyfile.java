package sruj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertyfile {
	WebDriver driver;
@Test
	public void pro() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Selenium\\SelePrac\\src\\sruj\\data.properties");
		prop.load(fis);
		if(prop.getProperty("browser").equals("chrome"))
		{
//			driver=new ChromeDriver();
//			System.setProperty("webdriver.chrome.driver", "./driver.chromedriver.exe");
			System.out.println(prop.getProperty("url"));
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			System.out.println("firefox");
		}
		else
		{
			System.out.println("nobrowser");
		}
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}
}
