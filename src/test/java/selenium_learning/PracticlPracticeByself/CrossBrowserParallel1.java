package selenium_learning.PracticlPracticeByself;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallel1 {
	WebDriver driver ;
	@Test
	public void testCase2() {

	}
	@BeforeClass
	@Parameters("browser")
	public void openBrowsers( @Optional("chrome")  String browser) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", browser);
		driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"), caps); 
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Jenkis");
		element.click();
		driver.quit();
	}
	

}
