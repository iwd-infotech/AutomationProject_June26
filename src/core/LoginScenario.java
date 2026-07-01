package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScenario {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		What is findElement() -> It finds a single element
//		driver -> It controls the browser
//		By.name -> name attribute to locate the element
//		sendKeys() -> typing in textbox
//		.click() -> Clicking on element with the mouse
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.clear();
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
		loginButton.isDisplayed();
		loginButton.click();
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}

// Manual Test cases
// Browser launch -> URl hit
// Enter user
// Enter Pass
// Click on Login button
// Verification