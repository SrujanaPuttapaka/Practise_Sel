package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.setPageLoadStrategy(PageLoadStrategy.NONE);
	//op.addArguments("--disable-notifications");

	WebDriver driver=new ChromeDriver(op);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://mail.google.com/");
   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srujanap95@gmail.com");
   driver.findElement(By.xpath("//span[text()='Next']")).click();
}
}
