package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void start() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");
}
	
	 @AfterMethod
	
	public void end() {
		
		driver.quit();
	}
	 @Test(priority = 1, description = "Valid Registration")
	 
	 public void register1() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("Anjana");

	        driver.findElement(By.id("email")).sendKeys("anjana@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("9621475382");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000); 
	        
	        System.out.println("Valid Registration Executed");
	               
	 }
	 
	 @Test(priority = 2, description = "Register with Same Username and Different Email") 
		 
	 public void register2() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("Anjana");

	        driver.findElement(By.id("email")).sendKeys("anj@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("9621475382");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000); 
	        
	        System.out.println("username already Exist");
		 
	 }
	 
	 @Test(priority = 3, description = "Register with Existing Email and Different Username") 
	 
	 public void register3() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("Anju");

	        driver.findElement(By.id("email")).sendKeys("anjana@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("9621475382");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000);
	        
	        System.out.println("emailid already Exist");
		 
	 }
	 
	 @Test(priority = 4, description = "Register with Invalid Email Address") 
	 
	 public void register4() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("Anjana");

	        driver.findElement(By.id("email")).sendKeys("anjana@gm");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("9621475382");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000); 
	        
	        System.out.println("Invalid Email Address Executed");
		 
	 }
	 
	 @Test(priority = 5, description = "Username with Special Characters") 
	 
	 public void register5() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("!@#");

	        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("9621475382");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000); 
	        
	        System.out.println("Special Character Username Test Executed");
		 
	 }
	 
	 @Test(priority = 6, description = "Username Length Validation")
	 public void register6() throws InterruptedException {

	     driver.findElement(By.xpath("//a[text()='Register']")).click();
	     Thread.sleep(2000);

	     driver.findElement(By.id("username"))
	             .sendKeys("Asdfgghjfkljhdbfnnfmfnbbnfnd");

	     driver.findElement(By.id("email")).sendKeys("abc1@gmail.com");

	     Select dropdown = new Select(driver.findElement(By.id("role")));
	     dropdown.selectByVisibleText("Customer");

	     driver.findElement(By.id("phone")).sendKeys("9621475382");

	     driver.findElement(By.id("password")).sendKeys("Anjana@123");
	     driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	     driver.findElement(By.xpath("//button[@type='submit']")).click();

	     Thread.sleep(2000);

	     // Verify validation message
	     WebElement errorMessage = driver.findElement(By.xpath("//*[contains(text(),'Username')]"));

	     Assert.assertTrue(errorMessage.isDisplayed(),
	             "Username length validation message is not displayed.");

	     System.out.println("Username Length Validation Passed");
	 }
		 
	 
	 @Test(priority = 7, description = "Username Minimum Length Validation") 
	 public void register7() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("A");

	        driver.findElement(By.id("email")).sendKeys("abc2@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("9621475382");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000);
	        
	        System.out.println("minimum username Executed");
		 
	 }
	 
	 @Test(priority = 8, description = "Blank Username") 
	 
	 public void register8() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("");

	        driver.findElement(By.id("email")).sendKeys("abc3@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("9621475382");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000);
	        
	        System.out.println("blank username Executed");
		 	 
	 }
	 
	 @Test(priority = 10, description = "invalid Phone Number Validation") 
	 
	 public void register10() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("abc123");

	        driver.findElement(By.id("email")).sendKeys("abc3@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("96214");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@123");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000);
	        
	        System.out.println("invalid Phone Number Validation Executed");
		 
		 
	 }
	 
	 @Test(priority = 11, description = "Password Mismatch") 
	 
	 public void register11() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("username")).sendKeys("abc123");

	        driver.findElement(By.id("email")).sendKeys("abc3@gmail.com");

	        Select dropdown = new Select(driver.findElement(By.id("role")));
	        dropdown.selectByVisibleText("Customer");

	        driver.findElement(By.id("phone")).sendKeys("96214");

	        driver.findElement(By.id("password")).sendKeys("Anjana@123");

	        driver.findElement(By.id("password2")).sendKeys("Anjana@256");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Thread.sleep(3000);
	        
	        System.out.println("Password Mismatch Executed");
	 }
		 
}