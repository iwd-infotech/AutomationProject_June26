package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement customerID_TextBox = driver.findElement(By.xpath("//input[@name='cusid']"));
		customerID_TextBox.clear();
		customerID_TextBox.sendKeys("12345");
		
		WebElement submitButton = driver.findElement(By.xpath("//*[@value='Submit']"));
		submitButton.click();
		
		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
		String popUpText = alert.getText();
		System.out.println(popUpText);
		alert.accept();
		
	}

}
