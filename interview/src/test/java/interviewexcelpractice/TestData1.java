package interviewexcelpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData1 {
	
	public static Object[][] getData() throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\\\Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		
		Object [][] data=new Object[rowcount][cellcount];
		
		for(int i=0;i<rowcount;i++) {
			
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0;j<cellcount;j++) {
				
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
					data[i][j]=cell.getStringCellValue();
					break;
					
				case NUMERIC:
					data[i][j]=Integer.toString((int)cell.getNumericCellValue());
					break;
					
				case BOOLEAN:
					
					data[i][j]=cell.getBooleanCellValue();
					break;
				}
			}
		}
		
		return data;
	
	}

}
