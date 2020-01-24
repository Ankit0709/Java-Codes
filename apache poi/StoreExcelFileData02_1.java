import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreExcelFileData02 
{
	public static void main(String[] args) 
	{
		int[] id = {10,1,20,2,30,3};
		String[] name = {"Raj","Kamal","Mina","Ram","Gita","Sita"};
		String[] desg = {"SE","SSE",
				"SE","JSE","SSE","Team Leader"};
		double[] salary = {1000.0,2000.0,3000.0,4000.0,5000.0,6000.0};
		String[] tech = {"PHP","C++","HTML","JS","JAVA","JSP"};
		
		try 
		{
		String excelPath = "C:\\Users\\admin\\Desktop\\excel02.xlsx";
		
		// create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
			
		// create a sheet with a name in this workbook 
		XSSFSheet sheet = workbook.createSheet("doctor");
		
		for(int i = 0; i < id.length; i++)
		{
			Row row = sheet.createRow(i);
			
			for(int j = 0; j < 5; j++)
			{
				Cell cell = row.createCell(j);
				
				if(j == 0)
				{
					cell.setCellValue(id[i]);
				}
				else if(j == 1)
				{
					cell.setCellValue(name[i]);
				}
				else if(j == 2)
				{
					cell.setCellValue(desg[i]);
				}
				else
				if(j == 3)
				{
					cell.setCellValue(salary[i]);
				}
				else if(j == 4)
				{
					cell.setCellValue(tech[i]);
				}
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
