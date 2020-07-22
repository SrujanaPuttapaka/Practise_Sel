package automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getlinks {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.setPageLoadStrategy(PageLoadStrategy.NONE);
	WebDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	List<WebElement> li=driver.findElements(By.tagName("a"));

	int count=li.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
	 String s=li.get(i).getText();
	 System.out.println(s);
	}
	
	}
}
