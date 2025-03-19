package features;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfileUpdate {

	public static WebDriver driver;
	
	@Test
	public void updateProfile() throws InterruptedException, IOException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
				
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		
		driver.findElement(By.id("usernameField")).sendKeys("anjanaprabhu27@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Papamummy618327@");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.cssSelector(".view-profile-wrapper a")).click();
		driver.findElement(By.linkText("Update")).click();
		
		Robot robot=new Robot();
		robot.delay(2000);
		StringSelection filepath = new StringSelection("C:\\Users\\ASUS\\Desktop\\Resume\\Cognizant\\Anjana Varma Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("File uploaded successfully");
		//driver.close();
		
		
	}

}
