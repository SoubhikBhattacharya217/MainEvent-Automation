package excelconnect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelconnect {
File f;
FileInputStream fs;
XSSFWorkbook wb;
XSSFSheet sheet;
String file_path;
public void eLaunch(String file_path, int sheet_index) throws Exception {
this.file_path=file_path;
f = new File (file_path);
fs= new FileInputStream(f);
wb = new XSSFWorkbook(fs);
sheet = wb.getSheetAt(sheet_index);
}
public String eRead(int row, int column) {
String s = sheet.getRow(row).getCell(column).getStringCellValue();
return s;
}
public void eWrite(int row, int column,String str) throws IOException
{
FileOutputStream fout = new FileOutputStream(f);
sheet.getRow(row).createCell(column).setCellValue(str);
wb.write(fout);
}
}
