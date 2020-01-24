import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreExcelFileData 
{
	public static void main(String[] args) 
	{
		try 
		{
		String excelPath = "C:\\Users\\admin\\Desktop\\excel.xlsx";
		
		// create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
			
		// create a sheet with a name in this workbook 
		XSSFSheet sheet = workbook.createSheet("doctor");
		
		// create a row in this sheet with an index
		// 0 means 1st row
		Row row = sheet.createRow(0);
		
		// create a cell in this row with index
		// 0 means first cell
		Cell cell0 = row.createCell(0);
		Cell cell1 = row.createCell(1);
		Cell cell2 = row.createCell(2);
		
		// store string data inside cell
		cell0.setCellValue("Raj Kumar Singh");
		cell1.setCellValue("Cardiaologist");
		cell2.setCellValue(6.5);

		// make the size of cell equal to the data 
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		
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
