package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageGarage {
	
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
			
	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);
		
	}

	 @AfterMethod
		
		public void end() {
			
			driver.quit();
		}
	 
	 @Test(priority = 1, description = "Add Garage with Valid Inputs")
	 
	 public void managegarage1() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("Toyota Innovacity");

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("Ernakulam");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("Aluva, Ernakulam");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("9685743620");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Garage Added Successfully");
		 
		 
	 }
	 
	 @Test(priority = 2, description = "Add Garage without Inputs")
	 
	 public void managegarage2() {

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Add Garage without Inputs is executed");	 

}
	 
	 @Test(priority = 3, description = "Verify mandatory validation for Name field")
	 
	 public void managegarage3() {

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("Ernakulam");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("Aluva, Ernakulam");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("9685743620");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify mandatory validation for Name field is executed");	 

}
	 
	 @Test(priority = 4, description = "Verify mandatory validation for City field")
	 
	 public void managegarage4() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("Toyota Innovacity");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("Aluva, Ernakulam");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("9685743620");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify mandatory validation forCity field is executed");
		 		 
	 }
	 
	 @Test(priority = 5, description = "Verify mandatory validation for Address field")
	 
	 public void managegarage5() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("Toyota Innovacity");

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("Ernakulam");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("9685743620");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify mandatory validation for Address field is executed");
		 
		 
	 }
	 
	 @Test(priority = 6, description = "Verify mandatory validation for Phone Number field")
	 
	 public void managegarage6() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("Toyota Innovacity");

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("Ernakulam");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("Aluva, Ernakulam");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify mandatory validation for Phone Number field is  executed");		 
		 
	 }
	 
	 @Test(priority = 7, description = "Verify validation for Name field with special characters")
	 
	 public void managegarage7() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("!@#$%");

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("Ernakulam");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("Aluva, Ernakulam");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("9685743620");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify validation for Name field with special characters is executed");	 
		 
	 }
	 
	 @Test(priority = 8, description = "Verify validation for Phone Number field with alphabetic input")
	 
	 public void managegarage8() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("Toyota Innovacity");

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("Ernakulam");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("Aluva, Ernakulam");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("abcd");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify validation for Phone Number field with alphabetic input is executed");
		  
	 }
	 
	 @Test(priority = 9, description = "Verify validation for City field with special characters")
	 
	 public void managegarage9() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("Toyota Innovacity");

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("!@#$%");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("Aluva, Ernakulam");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("9685743620");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify validation for City field with special characters is executed");
		 
		 
	 }
	 
	 @Test(priority = 10, description = "Verify validation for Address field with special characters")
	 
	 public void managegarage10() {
		 

		    driver.findElement(By.id("id_name")).clear();
		    driver.findElement(By.id("id_name")).sendKeys("Toyota Innovacity");

		    driver.findElement(By.id("id_city")).clear();
		    driver.findElement(By.id("id_city")).sendKeys("Ernakulam");

		    driver.findElement(By.id("id_address")).clear();
		    driver.findElement(By.id("id_address")).sendKeys("!@#$%");

		    driver.findElement(By.id("id_phone")).clear();
		    driver.findElement(By.id("id_phone")).sendKeys("9685743620");

		    driver.findElement(By.xpath("//button[@type='submit']")).click();

		    System.out.println("Verify validation for Address fieldwith special characters is executed");
		 
		 
	 }
	 
	 
	 
}
