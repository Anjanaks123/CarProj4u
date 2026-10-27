package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddVehicles {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void start() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sathu.pythonanywhere.com/");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		driver.findElement(By.id("username")).sendKeys("xyz");

		driver.findElement(By.id("password")).sendKeys("Anjana@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);

	}

	 @AfterMethod
		
		public void end() {
			
			driver.quit();
		}
	 
	 @Test(priority = 1, description = "Add Vehicle with Valid Details")
	  
	 public void Addvehicle1() throws InterruptedException {
		    
		    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		    Thread.sleep(2000);

		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		    vehicle.selectByVisibleText("Car");
	        
		    Select brand = new Select(driver.findElement(By.id("id_brand")));
		    brand.selectByVisibleText("Toyota");
		    
		    driver.findElement(By.id("id_model")).sendKeys("Swift");

		    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

		    driver.findElement(By.id("id_mileage")).sendKeys("25000");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Vehicle Added Successfully");
		 
	 }
	 
	 @Test(priority = 2, description = "Vehicle Type mandatory")
	  
	 public void Addvehicle2() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		    Thread.sleep(2000);
	        
		    Select brand = new Select(driver.findElement(By.id("id_brand")));
		    brand.selectByVisibleText("Toyota");
		    
		    driver.findElement(By.id("id_model")).sendKeys("Swift");

		    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

		    driver.findElement(By.id("id_mileage")).sendKeys("25000");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Vehicle Type mandatory is executed");
		 
		 
}
	 @Test(priority = 3, description = "Brand mandatory")
	  
	 public void Addvehicle3() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		    Thread.sleep(2000);

		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		    vehicle.selectByVisibleText("Car");
		    
		    driver.findElement(By.id("id_model")).sendKeys("Swift");

		    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

		    driver.findElement(By.id("id_mileage")).sendKeys("25000");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Brand mandatory executed");
}
	 @Test(priority = 4, description = "Model mandatory")
	  
	 public void Addvehicle4() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		 Thread.sleep(2000);

		 Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		 vehicle.selectByVisibleText("Car");
	        
		 Select brand = new Select(driver.findElement(By.id("id_brand")));
		 brand.selectByVisibleText("Toyota");

		 driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

		 driver.findElement(By.id("id_mileage")).sendKeys("25000");

		 driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		 
		 System.out.println("Model mandatory executed");
	
}
	 @Test(priority = 5, description = "Registration Number mandatory")
	  
	 public void Addvehicle5() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		    Thread.sleep(2000);

		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		    vehicle.selectByVisibleText("Car");
	        
		    Select brand = new Select(driver.findElement(By.id("id_brand")));
		    brand.selectByVisibleText("Toyota");
		    
		    driver.findElement(By.id("id_model")).sendKeys("Swift");

		    driver.findElement(By.id("id_mileage")).sendKeys("25000");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
		    System.out.println("Registration Number mandatory executed");
	
}
	 
	 @Test(priority = 6, description = "Verify Mileage field is mandatory")
	  
	 public void Addvehicle6() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		 Thread.sleep(2000);

		 Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		 vehicle.selectByVisibleText("Car");
	        
		 Select brand = new Select(driver.findElement(By.id("id_brand")));
		 brand.selectByVisibleText("Toyota");
		    
		 driver.findElement(By.id("id_model")).sendKeys("Swift");

		 driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

		 driver.findElement(By.xpath("//button[@type='submit']")).click();

		 System.out.println("Verify Mileage field is mandatory executed");
	 }
	 
	 @Test(priority = 7, description = "Invalid Registration Number")
	  
	 public void Addvehicle7() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		 Thread.sleep(2000);

		 Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		 vehicle.selectByVisibleText("Car");
	        
		 Select brand = new Select(driver.findElement(By.id("id_brand")));
		 brand.selectByVisibleText("Toyota");
		    
		 driver.findElement(By.id("id_model")).sendKeys("Swift");

		 driver.findElement(By.id("id_registration_number")).sendKeys("KL07");

		 driver.findElement(By.id("id_mileage")).sendKeys("25000");

		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 System.out.println("Invalid Registration Number executed");
	 }
	 
	 @Test(priority = 8, description = "Duplicate Registration Number")
	  
	 public void Addvehicle8() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		 Thread.sleep(2000);
		 
		 Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		 vehicle.selectByVisibleText("Car");
	        
		  Select brand = new Select(driver.findElement(By.id("id_brand")));
		  brand.selectByVisibleText("Toyota");
		    
		  driver.findElement(By.id("id_model")).sendKeys("Innovacity");

		  driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB6324");

		  driver.findElement(By.id("id_mileage")).sendKeys("25000");

		  driver.findElement(By.xpath("//button[@type='submit']")).click();

		  System.out.println("Duplicate Registration Number executed");
	 }
	 
	 @Test(priority = 9, description = "Mileage with alphabets")
	  
	 public void Addvehicle9() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		 Thread.sleep(2000);

		 Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		 vehicle.selectByVisibleText("Car");
	        
		 Select brand = new Select(driver.findElement(By.id("id_brand")));
		 brand.selectByVisibleText("Toyota");
		    
		 driver.findElement(By.id("id_model")).sendKeys("Swift");

		 driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

		 driver.findElement(By.id("id_mileage")).sendKeys("!@#$");

		 driver.findElement(By.xpath("//button[@type='submit']")).click();

		 System.out.println("Mileage with alphabets executed");
	 }
	 
	 @Test(priority = 10, description = "Special characters in Model")
	  
	 public void Addvehicle10() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

		    Thread.sleep(2000);

		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
		    vehicle.selectByVisibleText("Car");
	        
		    Select brand = new Select(driver.findElement(By.id("id_brand")));
		    brand.selectByVisibleText("Toyota");
		    
		    driver.findElement(By.id("id_model")).sendKeys("!@#$%%");

		    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

		    driver.findElement(By.id("id_mileage")).sendKeys("25000");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		  System.out.println("Special characters in Model is executed");
	 }
}