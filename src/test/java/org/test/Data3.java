package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data3 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPT\\Excel\\priya.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet sh = w.getSheet("sheet1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(2);
		String value = cell.getStringCellValue();
	   if (value.equals("aravind")) {
		   cell.setCellValue("priya");
		   
		
	}
	   FileOutputStream fo=new FileOutputStream(f);
	   w.write(fo);
	   System.out.println("done");
	}
	
	
	

}
