package automate;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.setPageLoadStrategy(PageLoadStrategy.NONE);
	WebDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.popuptest.com/goodpopups.html");
	driver.findElement(By.xpath("//a[contains(text(), 'PopUp #2')]")).click();
	Set<String> handle = driver.getWindowHandles();
	Iterator<String> it = handle.iterator();
	String parent=it.next();
	String child1=it.next();
	System.out.println(parent);
	driver.switchTo().window(parent);
	Thread.sleep(2000);
	System.out.println("child window");
	driver.switchTo().parentFrame();
	System.out.println("main window");
	driver.findElement(By.xpath("//a[contains(text(), 'PopUp #3')]")).click();
	String sec=it.next();
	System.out.println(sec);
	Thread.sleep(2000);
	driver.switchTo().window(sec);
	driver.switchTo().parentFrame();
}
}

