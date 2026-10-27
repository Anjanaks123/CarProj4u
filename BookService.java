
package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookService {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void start() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sathu.pythonanywhere.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		driver.findElement(By.id("username")).sendKeys("xyz");

		driver.findElement(By.id("password")).sendKeys("Anjana@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	}

	 @AfterMethod
		
		public void end() {
			
			driver.quit();
		}
	 
	 @Test(priority = 1, description = "Book Service with Valid Details")
	 
	 public void Bookservice1() throws InterruptedException {
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB6324 - Toyota Innovacity");

		    Select service = new Select(driver.findElement(By.id("id_service_type")));
		    service.selectByVisibleText("General Service");

		    Select garage = new Select(driver.findElement(By.id("id_garage")));
		    garage.selectByVisibleText("Falcon Motors");

		    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");

		    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Book Service Successfully");
		 	 
	 }
	 
    @Test(priority = 2, description = "Vehicle Validation")
	 
    public void Bookservice2() {

	    Select service = new Select(driver.findElement(By.id("id_service_type")));
	    service.selectByVisibleText("General Service");

	    Select garage = new Select(driver.findElement(By.id("id_garage")));
	    garage.selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");

	    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Vehicle Validation executed");
		 	 
	 }
    
	 @Test(priority = 3, description = "Service Type Validation")
	 
	 public void Bookservice3() {
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB6324 - Toyota Innovacity");

		    Select garage = new Select(driver.findElement(By.id("id_garage")));
		    garage.selectByVisibleText("Falcon Motors");

		    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");

		    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Service Type Validation executed"); 
		 
	 }
	 
	 @Test(priority = 4, description = "Garage Validation")
	 
	 public void Bookservice4() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB6324 - Toyota Innovacity");

		    Select service = new Select(driver.findElement(By.id("id_service_type")));
		    service.selectByVisibleText("General Service");

		    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");

		    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

				  System.out.println("Garage Validation executed");
		 
	 }
	 
	 @Test(priority = 5, description = "Appointment Date Validation")
	 
	 public void Bookservice5() {
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB6324 - Toyota Innovacity");

		    Select service = new Select(driver.findElement(By.id("id_service_type")));
		    service.selectByVisibleText("General Service");

		    Select garage = new Select(driver.findElement(By.id("id_garage")));
		    garage.selectByVisibleText("Falcon Motors");

		    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		 System.out.println("Appointment Date Validation executed");
		 	 
	 }
	 
	 @Test(priority = 6, description = "Appointment Time Validation")
	 
	 public void Bookservice6() {
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB6324 - Toyota Innovacity");

		    Select service = new Select(driver.findElement(By.id("id_service_type")));
		    service.selectByVisibleText("General Service");

		    Select garage = new Select(driver.findElement(By.id("id_garage")));
		    garage.selectByVisibleText("Falcon Motors");

		    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Appointment Time Validation executed");
		 	 
	 }
	 
	 @Test(priority = 7, description = "Past Date Validation")
	 
	 public void Bookservice7() {
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB6324 - Toyota Innovacity");

		    Select service = new Select(driver.findElement(By.id("id_service_type")));
		    service.selectByVisibleText("General Service");

		    Select garage = new Select(driver.findElement(By.id("id_garage")));
		    garage.selectByVisibleText("Falcon Motors");

		    driver.findElement(By.id("id_appointment_date")).sendKeys("20-06-2026");

		    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Past Date Validation executed");
		 	 
	 }
	 
	 @Test(priority = 8, description = "Bike Booking")
	 
	 public void Bookservice8() {
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB9854 - Honda !@#$");

			 Select service = new Select(driver.findElement(By.id("id_service_type")));
			 service.selectByVisibleText("Oil Change");

			 Select garage = new Select(driver.findElement(By.id("id_garage")));
			 garage.selectByVisibleText("King Service");
			 
		    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");

		    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();		 
			 
	 }
	 
	 @Test(priority = 9, description = "SUV Service Booking")
	 
	 public void Bookservice9() {
		 
		 Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		 vehicle.selectByVisibleText("KL66DC9574 - Hyundai creta");

		 Select service = new Select(driver.findElement(By.id("id_service_type")));
		 service.selectByVisibleText("Oil Change");

		 Select garage = new Select(driver.findElement(By.id("id_garage")));
		 garage.selectByVisibleText("King Service");

		 driver.findElement(By.id("id_appointment_date")).sendKeys("18-07-2026");

		 driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		 driver.findElement(By.xpath("//button[@type='submit']")).click();

		 System.out.println("SUV Service Booking executed");
		 	 
	 }
	 
	 @Test(priority = 10, description = "Successful Button Functionality")
	 
	 public void Bookservice10() {
		 
		    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
		    vehicle.selectByVisibleText("KL07AB6324 - Toyota Innovacity");

		    Select service = new Select(driver.findElement(By.id("id_service_type")));
		    service.selectByVisibleText("General Service");

		    Select garage = new Select(driver.findElement(By.id("id_garage")));
		    garage.selectByVisibleText("Falcon Motors");

		    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");

		    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		 System.out.println("Successful Button Functionality");
		 	 
	 }	

}
