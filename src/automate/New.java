package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class New {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		//Error: Timed out receiving message from renderer: 298.565
		ChromeOptions op=new ChromeOptions(); //to handle above error
		op.setPageLoadStrategy(PageLoadStrategy.NONE);  //to handle above error
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//driver.get("https://www.google.com/");
//	System.out.println(driver.getTitle());
// driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Srujana");
//	//Actions a = new Actions(driver);
//	//a.keyUp(ntext, Keys.SHIFT).sendKeys("Srujana").keyDown(Keys.SHIFT).build().perform(); //keydown- pressing // keyUp - release
//
//	//driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Sruj");
// driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
// driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));

driver.get("http://demo.guru99.com/test/web-table-element.php");

	}
}
