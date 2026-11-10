package Utils;

import java.io.IOException;

public interface ExcelReader {
	public  String readDataFromExcel(String path,String sheetname,int row,int col) throws IOException;
}
