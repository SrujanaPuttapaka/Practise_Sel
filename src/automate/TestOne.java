package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.findElement(By.id("gb_70")).click();
		((RemoteWebDriver) driver).findElementById("gb_70").click();
		
		
		

	}

}
