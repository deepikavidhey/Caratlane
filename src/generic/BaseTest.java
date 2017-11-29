package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(CustomListener.class)
public class BaseTest implements IAutoConst
{
	public static WebDriver driver;
	static
	{
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	}

	@BeforeMethod
	public void openApp()
	{
	/*ChromeOptions co=new ChromeOptions();
	co.addArguments("---disable-Notifications");*/
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.caratlane.com");
	
	}

	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}	
	
}
