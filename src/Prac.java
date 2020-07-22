import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.name("travel_date")).click();
		int count =driver.findElements(By.className("day")).size();
		for (int i=0;i<=count;i++)
		{
			String num=driver.findElements(By.className("day")).get(i).getText();
			if(num.equalsIgnoreCase("24"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
