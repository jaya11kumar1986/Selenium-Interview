package interviewexcelpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOne {

	public static Object[][] main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file=new File("E:\\Data.xlsx");
		FileInputStream fs=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		
		Object [][]data=new Object[row][cell];
		
		for(int i=0;i<row;i++) {
			
			XSSFRow row2 = sheet.getRow(i+1);
			
			for(int j=0;j<cell;j++) {
				
				 XSSFCell cell2 = row2.getCell(j);
				 CellType cellType = cell2.getCellType();
						
				
				switch(cellType) {
				
				case STRING:
					data[i][j]=cell2.getStringCellValue();
					break;
					
				case NUMERIC:
					data[i][j]=Integer.toString((int)cell2.getNumericCellValue());
				}
			}
			
			
		}
		
return data;
	}

}
