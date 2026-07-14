package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_Concept {
	
  @Test
  public void validLoginTest() {
	  System.out.println("Valid Login Test");
  }
  
  @Test
  public void inValidLoginTest() {
	  System.out.println("Invalid Login Test");
  }
  
  @BeforeMethod
  public void openBrowser() {
	  System.out.println("Browser Launched");
  }

  @AfterMethod
  public void closeBrowser() {
	  System.out.println("Browser CLosed");
  }

}
