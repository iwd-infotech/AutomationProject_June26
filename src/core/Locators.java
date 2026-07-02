package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
//		Locators -> 8 types of locators
//		id, name, className, tagName, linkText, partialLinkText,
//		cssSelector, xpath
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		1. ID
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.clear();
		userName_TextBox.sendKeys("student");
		
//		2. Name
		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.clear();
		password_TextBox.sendKeys("Password123");
		
//		3. Class
		WebElement submit_Button = driver.findElement(By.className(""));
		submit_Button.click();
		
//		4. TagName
		driver.findElement(By.tagName("button"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
//		5. LinkText
//		<a href="url">Forget Password</a>
		WebElement forgetPassword_Link = driver.findElement(By.linkText("Forgot your password? "));
		forgetPassword_Link.click();
		
//		6. Partial LinkText
		WebElement forgetPassword_partialLink = driver.findElement(By.linkText("Forgot your"));
		forgetPassword_partialLink.click();
		
//		7. xPath
		driver.findElement(By.xpath("//input[@id='wpforms-161-field_0']"));
		
//		8. css selector
		driver.findElement(By.cssSelector("label[for='wpforms-161-field_1']"));
		
		
		
		
		
		
		
		
		
	}

}
