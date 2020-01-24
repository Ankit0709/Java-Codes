import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreExcelFileData03 
{
	public static void main(String[] args) 
	{
		Object[][] data = {{1,"a","a1",1000.0,"a11"},
				{1,"b","b1",1000.0,"b11"}};
		
		try 
		{
		String excelPath = "C:\\Users\\admin\\Desktop\\excel02.xlsx";
		
		// create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
			
		// create a sheet with a name in this workbook 
		XSSFSheet sheet = workbook.createSheet("doctor");
		
		for(int i = 0; i < data.length; i++)
		{
			Row row = sheet.createRow(i);
			
			for(int j = 0; j < data[i].length; j++)
			{
				Cell cell = row.createCell(j);
				
				cell.setCellValue(data[i][j].toString());
			}
		}
		
		// open excel file in write mode
		FileOutputStream fo = new FileOutputStream(excelPath, false);
		
		// store the data of workbook inside the file
		workbook.write(fo);
		
		System.out.println("SUCCESS");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
