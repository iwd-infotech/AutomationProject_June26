package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScenario {

	public static void main(String[] args) {
		
//		Selenium Waits - Tells to webdriver to wait for specified amt of time 
//		while searching for elements
//		3. Three types of waits
//		a. Implicit Wait : Global Wait
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Exception -> NoSuchElementException
	
		
//		What is findElement() -> It finds a single element
//		driver -> It controls the browser
//		By.name -> name attribute to locate the element
//		sendKeys() -> typing in textbox
//		.click() -> Clicking on element with the mouse
		
//		2. Explicit Wait -> Waits for a specific condition before processing
//		In Explicit Wait there are 2 classes -> WebDriverWait & ExpectedConditions
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
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