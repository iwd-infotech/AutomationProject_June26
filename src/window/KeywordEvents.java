package window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordEvents {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions actions = new Actions(driver);
		
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.clear();
		userName_TextBox.sendKeys("student");
		
		actions.keyDown(Keys.CONTROL)
			   .sendKeys("a")
			   .sendKeys("c")
			   .keyUp(Keys.CONTROL)
			   .sendKeys(Keys.TAB)
			   .perform();
		
//		WebElement password_TextBox = driver.findElement(By.name("password"));
//		password_TextBox.click();
		
		actions.keyDown(Keys.CONTROL)
		   .sendKeys("v")
		   .keyUp(Keys.CONTROL)
		   .perform();

	}

}
