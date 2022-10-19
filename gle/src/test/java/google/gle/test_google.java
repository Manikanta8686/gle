package google.gle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_google {
	 @Test
	public void open_google() throws InterruptedException
	{
		 
		String expected_title="Google";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String actual_title=driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(expected_title, actual_title);
		Thread.sleep(3000);
		driver.close();
		}
	
}
