package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Data1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPT\\Excel\\AARU1 - Copy.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sh = w.getSheet("Sheet1");
		int rows = sh.getPhysicalNumberOfRows();
		System.out.println(rows);
		for (int i = 0; i < rows; i++) {
			Row row = sh.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			String value;
			
			for (int j = 0; j < cells; j++) {
				Cell cell = row.getCell(j);
				int c = cell.getCellType();
				if (c==1) {
					 value = cell.getStringCellValue();
					
				}
					else if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat s=new SimpleDateFormat("dd.M.yyyy");
						 value = s.format(date);
						
					}
					else {
						double d = cell.getNumericCellValue();
						long l=(long)d;
						 value = String.valueOf(l);
						
					}	
						
					System.out.println(value);	
						
					}
					
				}
				
			}
		}
	


