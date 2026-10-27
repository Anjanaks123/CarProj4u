package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Reports {
	
		@Test(priority = 1, description = "View Report")
		
		public void selectGarage() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://sathu.pythonanywhere.com/");

			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[text()='Login']")).click();

			driver.findElement(By.id("username")).sendKeys("AnjanaKS");

			driver.findElement(By.id("password")).sendKeys("Password@123");

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		    driver.findElement(By.xpath("//a[contains(text(),'View Reports')]")).click();
				
		    Thread.sleep(2000);

		    Select garage = new Select(driver.findElement(By.name("garage")));
		    garage.selectByVisibleText("Toyota Innovacity");

		    Thread.sleep(2000);

		    System.out.println("View Report executed");
		    
		    driver.quit();
		    
		}

}
