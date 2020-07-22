package automate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zoom {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions cp=new ChromeOptions();
		cp.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='Hyderabad']")).click();
		driver.findElement(By.className("search")).click();
		driver.findElement(By.xpath("//div [text()='Popular Pick-up points']/following::div[2]")).click();
		driver.findElement(By.className("proceed")).click();
		Date d=new Date();
		DateFormat sdf=new SimpleDateFormat("dd");
		String today=sdf.format(d);
		int tommarrow=Integer.parseInt(today)+1;
		System.out.println(tommarrow);
		driver.findElement(By.xpath("//div[contains(text(),'"+tommarrow+"')]")).click();
		driver.findElement(By.className("proceed")).click();
		//int enddate=Integer.parseInt(today)+3;
		//System.out.println(enddate);
		//driver.findElement(By.xpath("//div[contains(text(),'"+enddate+"')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Low to High')]")).click();
		List<WebElement> l= driver.findElements(By.xpath("//div[@class='car-listing']"));
		System.out.println(l);
	}

}
