package features;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfileUpdate {

	public static WebDriver driver;
	
	@Test
	public void updateProfile() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
				
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		
		driver.findElement(By.id("usernameField")).sendKeys("anjanaprabhu27@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Papamummy618327@");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".view-profile-wrapper a")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Update")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\ASUS\\Desktop\\Resume\\Cognizant\\fileupload");
		
		driver.close();
		
		
	}

}
