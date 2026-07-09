package window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/multiple-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindow = driver.getWindowHandle();
		
		WebElement newTab = driver.findElement(By.xpath("//button[@onclick='NewTab()']"));
		newTab.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
