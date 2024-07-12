package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelData {
	@Test(dataProvider = "login")
	public void test_place(String fname,String lname,String ini,String ph ) {
		
		System.out.println(fname+" "+lname+" "+ini+" "+ph);
		
	}
	
	
	
	@DataProvider(name="login")
	public static Object[][] getdata() throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\Data1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		
		Object[][]ob=new Object[rowcount][colcount];
		
		for(int i=0;i<rowcount;i++) {
			
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0;j<colcount;j++) {
				
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
					ob[i][j] = cell.getStringCellValue();
				break;
				
				case NUMERIC:
				ob[i][j]=	Integer.toString((int)cell.getNumericCellValue());
				break;
				}
			}
		}
		
		return ob;
	}

}
