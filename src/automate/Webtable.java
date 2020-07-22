package automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions cp=new ChromeOptions();
		cp.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver=new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://demo.automationtesting.in/Index.html");
	    //driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();
	    driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[text()='WebTable']")).click();
		List <WebElement> col    =driver.findElements(By.xpath("//div//span[text()='Email']"));
		System.out.println(col.size());
	}

}
