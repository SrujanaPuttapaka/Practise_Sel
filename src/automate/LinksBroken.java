package automate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinksBroken {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./newdriver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://makemysushi.com/");
		List<WebElement> li=driver.findElements(By.tagName("a"));
		li.addAll(driver.findElements(By.tagName("img")));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
		System.out.println(li.get(i).getText());
		}
		for(int j=0;j<li.size();j++)
		{
		HttpURLConnection con= (HttpURLConnection) new URL(li.get(j).getAttribute("href")).openConnection();
		con.connect();
		String response=con.getResponseMessage();
		con.disconnect();
		System.out.println(li.get(j).getAttribute("href")+"--->"+response);
		
		}}
}

