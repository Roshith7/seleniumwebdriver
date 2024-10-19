package Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Dynamicnew.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many rows");
		int noOfRows=sc.nextInt();
		
		System.out.println("Enter how many cells");
		int noOfcells=sc.nextInt();
		
		for(int r=0;r<=noOfRows;r++)
		{
			XSSFRow CurrentRow=sheet.createRow(r);
			for(int c=0;c<noOfcells;c++)
			{
				XSSFCell currentcell=CurrentRow.createCell(c);
				currentcell.setCellValue(sc.next());
				
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File Created");
		
		
	}

}
