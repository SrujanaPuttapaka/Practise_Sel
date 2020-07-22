package automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.setPageLoadStrategy(PageLoadStrategy.NONE);
	WebDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");
	List<WebElement> li= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@role='option']"));
	
	int size=li.size();
	System.out.println(size);
	
	for(int i=1;i<size;i++)
	{
		System.out.println(li.get(i).getText());
		if(li.get(i).getText().equalsIgnoreCase("java tutorial"))
		{
			li.get(i).click();
			break;
		}
	}
}
}
