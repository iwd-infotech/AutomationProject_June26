package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
//		WebDriver d = new ChromeDriver(); -> allowed
//		ChromeDriver d = new ChromeDriver();  -> allowed
//		WebDriver driver = new WebDriver();  -> Not allowed
//		WebDriver - Interface
//		driver - Reference variable
//		new - keyword
//		ChromeDriver() - ChromeDriver class constructor
//		new ChromeDriver();  - Object (Chrome driver)
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("Title: " +driver.getTitle());
	}

}
