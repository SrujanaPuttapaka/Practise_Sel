package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver= new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.get("https://freecrm.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.name("email")).sendKeys("srujanap95@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Chocolate!2345");
		driver.findElement(By.xpath("//div[@class='ui stacked segment']/descendant::div[text()='Login']")).click();
		driver.findElement(By.xpath("//div[@id='main-nav']//a[2]")).click();
	String date="18.April.2020";
		System.out.println(date);
		String date1[]= date.split("\\.");
		System.out.println(date1[0]);
		/*String day=date1[0];
		String month=date1[1];
		String year=date1[2];	*/
		//System.out.println(day);
		/*System.out.println(date1[1]);
		System.out.println(date1[2]);
		
		for(int i=1;i<=date1.length;i++)
		{
			System.out.println(date1[i]);
		}*/
		
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
driver.findElement(By.xpath("//a[@title='Next']")).click();
	/*String dataval="18-04";
	selectda(driver, date, dataval);
	
		}
public static void selectda(WebDriver driver, WebElement element, String dataval)
{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+dataval+"');", element);*/
	
	
	
}
}
