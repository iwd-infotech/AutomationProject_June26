package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelMethods {
	
	@Test
	public void login() {
		System.out.println("Login Test: " +Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void dashboard() {
		System.out.println("Dashboard Test: " +Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void search() {
		System.out.println("Search Test: " +Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void payment() {
		System.out.println("PAyment Test: " +Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void demo() {
		System.out.println("Demo Test: " +Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}

}
