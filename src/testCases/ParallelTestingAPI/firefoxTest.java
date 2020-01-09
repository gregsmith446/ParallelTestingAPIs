package testCases.ParallelTestingAPI;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firefoxTest {

	@Test
	public void test2() throws MalformedURLException
	{
		URL u = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		RemoteWebDriver driver = new RemoteWebDriver(u, cap);
				
		driver.get("http://www.bing.com");
		System.out.println("FireFox:");
		System.out.println(driver.getTitle());
	}
	
}
