package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data2 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPT\\Excel\\priya.xlsx");
	    Workbook w=new XSSFWorkbook();
	    Sheet sh = w.createSheet("sheet1");
	    Row row = sh.createRow(1);
	    Cell cell = row.createCell(2);
	    cell.setCellValue("aravind");
	    FileOutputStream fo=new FileOutputStream(f);
	    w.write(fo);
	    System.out.println("done");
	    
	}
	

}
