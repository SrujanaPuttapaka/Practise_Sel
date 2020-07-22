import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Securityissue {
	

	public static void main(String[] args) {
		
		/*StringBuffer sb=new StringBuffer("a");
		sb.append("1234dgaddisdhsfjslfjsfjsnfskdsdfsfs5");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
	
				
		DesiredCapabilities dp =new  DesiredCapabilities();
		dp.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver=new ChromeDriver(dp);
		driver.get("https://www.cacert.org/");
	}
		
		
	}


