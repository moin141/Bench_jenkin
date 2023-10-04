package jenkins_bench_training;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class openchrome {
	
	
	@Test
	public void lauchBrowser()
	{
		
		
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohdmoin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Google"),"Title match");
		
		driver.quit();


		
	}

	}
	
	

