package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaymentTest {

	@Test
	public void payment() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.clear();
		userName_TextBox.sendKeys("student");

		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.clear();
		password_TextBox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.className(""));
		submit_Button.click();
	}

}
