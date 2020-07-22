package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Basics {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*driver.get("https://www.spicejet.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li//a[@id='highlight-addons']"))).build().perform();
		System.out.println("moved");
		driver.findElement(By.xpath("//ul//li[10]//a[text()='Visa Services']")).click();
		System.out.println(driver.getTitle());*/
		driver.get("https://jqueryui.com/droppable/");
		//driver.findElement(By.xpath("//ul//li[2]//a[text()='Droppable']")).click();
		driver.switchTo().frame(0);
		Actions a= new Actions(driver);
		a.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
	System.out.println("dropped");
	}

}
