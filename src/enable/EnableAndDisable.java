package enable;

import org.testng.annotations.Test;

public class EnableAndDisable {

	@Test 
	public void testcaseOne() {
		System.out.println("testcaseOne");
	}
	
	@Test
	public void testcaseTwo() {
		System.out.println("testcaseTwo");
	}
	
	@Test (enabled = false)
	public void testcaseThree() {
		System.out.println("testcaseThree");
	}
	
	@Test (enabled = false)
	public void testcaseFour() {
		System.out.println("testcaseFour");
	}
	
	@Test (enabled = true)
	public void testcaseFive() {
		System.out.println("testcaseFive");
	}
	
}
