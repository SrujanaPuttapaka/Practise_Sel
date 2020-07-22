package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ebay {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	ChromeOptions op= new ChromeOptions();
	op.setPageLoadStrategy(PageLoadStrategy.NONE);
	WebDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Alert*******************************************************
	
	/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	System.out.println("clicked OK");
	//driver.close();*/
	
	//How to choose file *******************************************************
	
	/*driver.get("https://html.com/input-type-file/");
	driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\sputtapaka\\Desktop\\mail.txt");*/
	
	
	//**************************************************
	/*driver.get("https://freecrm.co.in/");
	driver.findElement(By.xpath("//span[text()='Log In']")).click();
	driver.findElement(By.name("email")).sendKeys("srujanap95@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Chocolate!2345");
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	driver.findElement(By.xpath("//span[text()='Calendar']")).click();*/
	
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
	driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	/*driver.findElement(By.xpath("//button[contains(text(),'display')]")).click();
	Alert a= driver.switchTo().alert();
	a.accept();
	System.out.println("accepted");*/
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'display')]")).click();
	Alert a1= driver.switchTo().alert();
	 // alert message    
    String alertMessage1= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
    System.out.println(alertMessage1);	
	a1.dismiss();
	System.out.println("cancelled");
	/*driver.findElement(By.linkText("Textbox")).click();
	driver.findElement(By.xpath("//button[contains(text(),'display')]")).click();
	Alert a2= driver.switchTo().alert();
	System.out.println(a2.getText());*/
}
}
