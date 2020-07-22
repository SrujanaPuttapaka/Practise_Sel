package automate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Propfile {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable notifications");
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Selenium\\SelePrac\\src\\automate\\sruj.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();	
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Testleaf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		
	}

}
