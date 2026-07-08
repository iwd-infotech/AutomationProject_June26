package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTopics {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
//		Validation
		String Expectedtitle = driver.getTitle();
		System.out.println(Expectedtitle);
		String actualTitle = "guru99";
		if (actualTitle.equals(Expectedtitle)) {
			System.out.println("Title matched");
		}
		
		driver.getCurrentUrl();
		driver.getPageSource();
		String window = driver.getWindowHandle();
		driver.getWindowHandles();
		driver.close();
		driver.quit();
		
	}

}
