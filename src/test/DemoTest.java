package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DemoTest {
	
	WebDriver driver;
	
  @Test
  public void loginTest() {
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.clear();
		userName_TextBox.sendKeys("student");
		
		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.clear();
		password_TextBox.sendKeys("Password123");
		
		WebElement submit_Button = driver.findElement(By.className(""));
		submit_Button.click();
  }
  
  @Test
  public void inValidloginTest() {
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.clear();
		userName_TextBox.sendKeys("545453");
		
		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.clear();
		password_TextBox.sendKeys("Password123");
		
		WebElement submit_Button = driver.findElement(By.className(""));
		submit_Button.click();
  }
  
  @BeforeMethod
  public void setup() {
	  driver = new ChromeDriver();
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
