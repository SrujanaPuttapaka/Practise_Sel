import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
public static void main(String[] args) throws MalformedURLException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://makemysushi.com/");
	List<WebElement> alllist=driver.findElements(By.tagName("a"));
	alllist.addAll(driver.findElements(By.tagName("img")));
	System.out.println(alllist.size());
	List<WebElement> activelist=new ArrayList<>();
	for(int i=0;i<alllist.size();i++)
	{
		if((alllist.get(i).getAttribute("href")!=null)&&(!alllist.get(i).getAttribute("href").contains("javascript")))
		{
			activelist.add(alllist.get(i));
		}
	}
	System.out.println(activelist.size());
	
	for(int j=0;j<activelist.size();j++)
	{
		HttpURLConnection connection=(HttpURLConnection) new URL(activelist.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response=connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelist.get(j).getAttribute("href")+"-->"+response);
		}
	
}
}
