package para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {

	WebDriver driver;
//	String browser = "firefox";

	@Parameters({"browser"})
	@Test
	public void paramter(String browser) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
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
