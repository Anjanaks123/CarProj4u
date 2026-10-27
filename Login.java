package Car4uautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
		
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
		 
		 @Test (priority = 1, description = "Valid Registration" )
		 
		 public void login1() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("Anjana");

			 driver.findElement(By.id("password")).sendKeys("Anjana@123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Valid Login Executed");
			 
		 }
		 
         @Test (priority = 2, description = "Login with invalid username" )
		 
		 public void login2() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("Ana");

			 driver.findElement(By.id("password")).sendKeys("Anjana@123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Login with invalid username Executed");
			 
		 }
         
         @Test (priority =3, description = "Login with empty username field" )
		 
		 public void login3() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("");

			 driver.findElement(By.id("password")).sendKeys("Anjana@123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Login with empty username field Executed");


	}
         @Test (priority =4, description = "Login with invalid password" )
		 
		 public void login4() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("Anjana");

			 driver.findElement(By.id("password")).sendKeys("Anjana123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Login with invalid password Executed");
         
}
         @Test (priority =5, description = "Login with empty password field" )
		 
		 public void login5() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("Anjana");

			 driver.findElement(By.id("password")).sendKeys("");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Login with empty password field Executed");
         
}
         
         @Test (priority =6, description = "Verify username case sensitivity" )
		 
		 public void login6() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("anjana");

			 driver.findElement(By.id("password")).sendKeys("Anjana@123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Verify username case sensitivity Executed");
         
}
     
         @Test (priority =7, description = "Verify password case sensitivity" )
		 
		 public void login7() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("Anjana");

			 driver.findElement(By.id("password")).sendKeys("anjana@123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Verify password case sensitivity Executed");
         
}
         
         @Test (priority =8, description = "Verify login with empty credentials" )
		 
		 public void login8() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("");

			 driver.findElement(By.id("password")).sendKeys("");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Verify password case sensitivity Executed");
         
}
         
         @Test (priority =9, description = "Verify username with leading/trailing space" )
		 
		 public void login9() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("   Anjana");

			 driver.findElement(By.id("password")).sendKeys("Anjana@123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Verify username with leading/trailing space Executed");
         
}
         
         @Test (priority =10, description = "Verify password with leading/trailing spaces" )
		 
		 public void login10() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[text()='Login']")).click();

			 driver.findElement(By.id("username")).sendKeys("Anjana");

			 driver.findElement(By.id("password")).sendKeys("   Anjana@123");

			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 Thread.sleep(2000);

			 System.out.println("Verify password with leading/trailing spaces Executed");
         
}
         
}
