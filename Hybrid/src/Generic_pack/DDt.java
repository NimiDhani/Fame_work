package Generic_pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;


public class DDt {
	public static String test(String sh,int r,int c)  {
		String data=null;
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		
			Workbook book=WorkbookFactory.create(fis);
			Sheet s1 = book.getSheet(sh);
			Row r1 = s1.getRow(r);
			Cell c1 = r1.getCell(c);
			 data = c1.toString();
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return data;
	}
}
