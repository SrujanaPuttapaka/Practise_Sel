package automate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowha {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	//Error: Timed out receiving message from renderer: 298.565
	ChromeOptions op=new ChromeOptions(); //to handle above error
	op.setPageLoadStrategy(PageLoadStrategy.NONE);  //to handle above error
	WebDriver driver=new ChromeDriver(op);
	driver.get("http://demo.automationtesting.in/Register.html");
	
	//navigate to switch
	driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
	
	//click windows
	driver.findElement(By.xpath("//li[4]//ul//li[2]//a")).click();
	
	//Click on pop up
	driver.findElement(By.xpath("//button[text()='    click   ']")).click();
	
	Set<String> allWindows = driver.getWindowHandles();
	
	System.out.println(allWindows.size());
	for(String a: allWindows)
	{
		System.out.println(driver.switchTo().window(a).getCurrentUrl());
	}
	
}
}

