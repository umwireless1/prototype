package Excel;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtilities {
	
	public static XSSFWorkbook  workbook;
	public static XSSFSheet sheet;
	
	public ExcelUtilities(String excelPath, String sheetName) throws IOException {
		
		
		 
		  workbook = new XSSFWorkbook(excelPath);
		
		 sheet = workbook.getSheet(sheetName);
		
	}
	

	
	
	public static String getCellData(int rowNum, int colNum) throws IOException
	{
		
		
		
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		
	}
	
	
	
	
	
	
	public static void getRowCount() throws IOException {
		
		
		
		
		
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		System.out.println(rowCount);
	}
	
	
	
	
	
	

}
