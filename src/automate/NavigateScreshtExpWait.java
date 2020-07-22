package automate;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateScreshtExpWait {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.setPageLoadStrategy(PageLoadStrategy.NONE);
	WebDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	Thread.sleep(10000);
    WebElement loc=driver.findElement(By.xpath("//span[contains(text(),'Hotels')]"));
	//WebDriverWait wait= new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.elementToBeClickable(loc));
	clickWait(driver, loc, 20);
	System.out.println("waited");
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	System.out.println("spice");
	driver.navigate().forward();
	Thread.sleep(5000);
	System.out.println("google");
	Thread.sleep(5000);
	driver.navigate().refresh();
	System.out.println("refreshed");
	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File des= new File("./snaps/img1.png");
	FileUtils.copyFile(src,des);
	System.out.println("taken screenshot");
}

public static void clickWait(WebDriver driver, WebElement locator, int timeout)
{
	new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
    locator.click();
}
}
