package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
	public static WebDriver driver;
	
	public static  WebDriver getbrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\DigitalPoint\\Mar15\\forumAutomation\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    return driver;
}
}

