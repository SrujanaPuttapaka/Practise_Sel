package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class First {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	//Error: Timed out receiving message from renderer: 298.565
	ChromeOptions op=new ChromeOptions(); //to handle above error
	op.setPageLoadStrategy(PageLoadStrategy.NONE);  //to handle above error
	WebDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Index.html");
   driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();
  // driver.findElement(By.xpath("//button[@data-toggle='collapse']")).click();
   driver.findElement(By.xpath("//a[text()='Register']")).click();
   driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Srujana");
   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Puttapaka");
   driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Address");
   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@gmail.com");
   driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("0123456789");
   driver.findElement(By.xpath("//input[@value='FeMale']")).click();
   driver.findElement(By.xpath("//input[@value='Movies']")).click();
   driver.findElement(By.xpath("//div[@id='msdd']")).click();
   driver.findElement(By.xpath("//multi-select//div[2]//ul//li[6]//a")).click();
   driver.findElement(By.xpath("//multi-select//div[2]//ul//li[3]//a")).click();
   Select  s =new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
   s.selectByVisibleText("Backup Management");
   Select s1= new Select(driver.findElement(By.id("countries")));
  // s1.selectByValue("Albania"); //albenia   
   s1.selectByIndex(3);
   driver.findElement(By.xpath("//span[@role='combobox']")).click();
   driver.findElement(By.xpath("//span//ul//li[4]")).click();
   Select s2=new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
   s2.selectByValue("2002");
   Select s3=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
   s3.selectByIndex(3);
   Select s4=new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
   s3.selectByIndex(3);
   driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Srujana");
   driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Srujana");
   //driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
   }
}
