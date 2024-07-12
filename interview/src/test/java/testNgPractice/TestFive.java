package testNgPractice;

import org.testng.annotations.Test;

public class TestFive {
	
	
	@Test(groups = {"smoke"})
	public void test_1() {
		
		System.out.println("one");
	}
	
	@Test(groups = {"Regression"})
	public void test_2() {
		
		System.out.println("two");
	}
	
	@Test(groups = {"smoke"})
	public void test_3() {
		
		System.out.println("three");
	}

}
