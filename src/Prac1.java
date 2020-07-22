import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Prac1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver=new ChromeDriver(dc);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[starts-with(@class,'gLFyf')]")).sendKeys(Keys.TAB);
	}
}