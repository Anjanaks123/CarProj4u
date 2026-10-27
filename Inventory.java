package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inventory {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void start() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sathu.pythonanywhere.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		driver.findElement(By.id("username")).sendKeys("AnjanaKS");

		driver.findElement(By.id("password")).sendKeys("Password@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);
		
	}

	 @AfterMethod
		
		public void end() {
			
			driver.quit();
		}
	 
	 @Test(priority = 1, description = "Verify adding spare part with valid input")
	 
	 public void inventory1() {
		 
		 Select garage = new Select(driver.findElement(By.name("garage")));
		    garage.selectByVisibleText("Toyota Innovacity");

		    driver.findElement(By.id("id_name")).sendKeys("Battery");

		    driver.findElement(By.id("id_quantity")).sendKeys("10");

		    driver.findElement(By.id("id_price")).sendKeys("800");

		    driver.findElement(By.id("id_brand")).sendKeys("TVS");

		    driver.findElement(By.id("id_min_stock")).clear();
		    driver.findElement(By.id("id_min_stock")).sendKeys("2");

		    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

		    System.out.println("Inventory Part Added Successfully");
	 }
	 
	 @Test(priority = 2, description = "Verify adding spare part without any input")
	 
	 public void inventory2() {
		 
		 Select garage = new Select(driver.findElement(By.name("garage")));
		 garage.selectByVisibleText("Toyota Innovacity");

		 driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

		 System.out.println("Verify adding spare part without any input is executed");
	 }
	 
	 @Test(priority = 3, description = "Verify edit inventory with invalid input")
	 
	 public void inventory3() {
		 
		 Select garage = new Select(driver.findElement(By.name("garage")));
		 garage.selectByVisibleText("Toyota Innovacity");
		    
		 driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();

		 System.out.println("Verify edit inventory with invalid input is executed");
	 }
	 
    @Test(priority = 4, description ="Verify delete functionality with valid action")
	 
	 public void inventory4() {
		 
		 Select garage = new Select(driver.findElement(By.name("garage")));
		 garage.selectByVisibleText("Toyota Innovacity");
		    
		 driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();

		 System.out.println("Verify delete functionality with valid action is executed");
	 }
    
	 @Test(priority = 5, description = "Verify Name field is mandatory")
	 
	 public void inventory5() {
		 
		 Select garage = new Select(driver.findElement(By.name("garage")));
		    garage.selectByVisibleText("Toyota Innovacity");

		    driver.findElement(By.id("id_quantity")).sendKeys("10");

		    driver.findElement(By.id("id_price")).sendKeys("800");

		    driver.findElement(By.id("id_brand")).sendKeys("TVS");

		    driver.findElement(By.id("id_min_stock")).clear();
		    driver.findElement(By.id("id_min_stock")).sendKeys("2");

		    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

		    System.out.println("Verify Name field is mandatory is executed");
	 }
	 
	 
	 
	 
	 

}
