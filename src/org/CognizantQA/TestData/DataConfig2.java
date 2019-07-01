package org.CognizantQA.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.CognizantQA.PageObject.POMabstract;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class DataConfig2 extends POMabstract {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	String p="pass";
	String f="fail";
	public DataConfig2 (String excelpath) {
		try {
			File file = new File (excelpath);
			FileInputStream fis = new FileInputStream (file);
			FileOutputStream fout = new FileOutputStream (file);
			wb = new XSSFWorkbook (fis);
		}
		
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String setData (int sheetnum,int row,int col){
		sheet=wb.getSheetAt(sheetnum);
		File file = new File (excelpath);
		FileOutputStream fout = new FileOutputStream (file);

		String data=sheet.getRow(row).createCell(col).setCellValue("pass");
		wb.write(fout);
		return data;
		
	}

	}
}
