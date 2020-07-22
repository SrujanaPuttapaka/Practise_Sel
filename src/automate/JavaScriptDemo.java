package automate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("--disable notifications");
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver=new ChromeDriver(op);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Selenium\\SelePrac\\src\\automate\\sruj.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
	WebElement wb =	driver.findElement(By.xpath("//input[@aria-label='Log In']"));	
	flash(wb,driver);
	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolur= element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++)
		{
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolur, element, driver);
		}
		
		
	}
	
	public static void changeColor(String color,WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguement[0].style.backgroundColor= '"+color+"'", element);
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	}

	


