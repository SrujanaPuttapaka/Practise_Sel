import java.util.concurrent.TimeUnit;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	//	driver.findElement(By.xpath("//a[contains(text(),'LEARN HTML')]")).click();
////a[contains(text(),'Menu')]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath="]/td[1]";
		for(int i=2;i<7;i++)
		{
			String actualxpath=beforexpath+i+afterxpath;
			WebElement ele=driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());
			if(ele.getText().equals("Island Trading"))
			{
				System.out.println(ele.getText() +" element found at: " +i+ "position");
				
				break;
			}
		}
			
					}

}
