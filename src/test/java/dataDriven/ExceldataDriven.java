package dataDriven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataDriven {
	
	//identify Testcase column by scanning entire 1st row
	//ones the column is identified then scan the entire Testcase column and find the demo2 testcase row
	// after we grab Testcase demo2 row then pull all the data of that row and feed into our testcase

	public static void main(String[] args) throws FileNotFoundException {
		
	FileInputStream fis = new FileInputStream("D:\\ExcelData\\Book1.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook();
		int sheets= workbook.getNumberOfSheets();
		for (int i=0; i<sheets; i++)
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("sheet1"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				//identify Testcase column by scanning entire 1st row
				Iterator<Row> rows=	sheet.iterator();
	        Row fastrow= rows.next();
	       Iterator<Cell> ce= fastrow.cellIterator();
	       int k=0;
	       int column=0;
	       while(ce.hasNext())
	       {
	    	   Cell value= ce.next();
	    	   if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
	    	   {
	    		   column=k;
	    	   }
	    	   k++;
	       }
	       System.out.println(column);
	       System.out.println(ce.toString());
	       System.out.println(ce.hashCode());
	       System.out.println(((Cell) ce).getStringCellValue());
			}
		}
      
	}

}
