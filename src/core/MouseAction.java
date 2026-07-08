package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.id("submit"));
		
		Actions action = new Actions(driver);
		action.click(loginButton).perform();
		action.doubleClick(loginButton).perform();
		action.contextClick(loginButton).perform();
		action.moveToElement(loginButton).perform();
		
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.clear();
		userName_TextBox.sendKeys("student");
		
		action.dragAndDrop(userName_TextBox, loginButton);
		action.clickAndHold(loginButton).perform();

	}

}
