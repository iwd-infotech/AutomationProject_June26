package para;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@Test(dataProvider = "loginData")
	public void Login(String user, String pass) {
		System.out.println(user + " " +pass);
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.clear();
		userName_TextBox.sendKeys(user);

		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.clear();
		password_TextBox.sendKeys(pass);

		WebElement submit_Button = driver.findElement(By.className(""));
		submit_Button.click();
	}

	@DataProvider
	public Object[][] loginData() {
		return new Object[][] {
			new Object[] { "student", "Password123" },
			new Object[] { "student", "Dassword123" },
			new Object[] { "12345", "65432" },
		};
	}
}
