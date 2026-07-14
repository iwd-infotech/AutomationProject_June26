package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeClass_Concept {
	
  @Test (priority = 1)
  public void loginTest() {
	  System.out.println("Login test");
  }
  
  @Test (priority = 2)
  public void searchTest() {
	  System.out.println("search test");
  }
  
  @Test (priority = 3)
  public void Payment() {
	  System.out.println("Payment test");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

}
