package testNgPractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestFour {
	
	@BeforeTest
	public void test_1() {
		
		System.out.println("one");
	}

	@BeforeClass
	public void test_2() {
		
		System.out.println("Two");
	}
	
	@Test
	public void test_3() {
		
		System.out.println("Three");
	}
	
	@Test
	public void test_() {
		
		System.out.println("four");
	}

}
