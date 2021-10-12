package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPT\\Excel\\DSR Template (1).xlsx");
		FileInputStream fs=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fs);
		Sheet sh = w.getSheet("Downtime");
		Row row = sh.getRow(3);
		int rows = sh.getPhysicalNumberOfRows();
		System.out.println(rows);
		int cells = row.getPhysicalNumberOfCells();
		System.out.println(cells);
		Cell cell = row.getCell(4);
		System.out.println(cell);
	}
	

}
