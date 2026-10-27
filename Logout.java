package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logout {
		
		@Test
		
		public void logout1() throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sathu.pythonanywhere.com/");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		driver.findElement(By.id("username")).sendKeys("xyz");

		driver.findElement(By.id("password")).sendKeys("Anjana@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[normalize-space()='Logout']")).click();
		
		driver.quit();

	}

}
