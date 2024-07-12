package excel;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {
	
	@DataProvider(name="datamethod")
	public Object[][] getValue() throws IOException {
		
		Object[][]data=ExcelData.getdata();
		return data;
		
	}
	@Test(dataProvider = "datamethod")
	public void test_Case(String name,String id,String number) {
		
		
		System.out.println(name+" "+id+" "+number);
		
	}

}
