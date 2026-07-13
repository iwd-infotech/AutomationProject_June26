package test;

import org.testng.annotations.Test;

public class TestCases {
	
  @Test (priority = -1)
  public void login() {
	  System.out.println("Login Test case");
  }
  
  @Test (priority = 0)
  public void search() {
	  System.out.println("Search Test case");
  }
  
  @Test (priority = 4)
  public void logout() {
	  System.out.println("Logout Test case");
  }
  
  @Test (priority = 3)
  public void dashboard() {
	  System.out.println("Dashboard test case");
  }
  
}
