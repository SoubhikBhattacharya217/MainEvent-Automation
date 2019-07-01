package org.CognizantQA.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.CognizantQA.PageObject.POMabstract;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataConfig extends POMabstract {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	String p="pass";
	String f="fail";
	public DataConfig (String excelpath) {
		
		try {
			File file = new File (excelpath);
			FileInputStream fis = new FileInputStream (file);
			
			wb = new XSSFWorkbook (fis);
		}
		
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData (int sheetnum, int row, int col) {
		sheet = wb.getSheetAt(sheetnum);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

	public Object getRow(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
