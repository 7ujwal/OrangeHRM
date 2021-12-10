package org.Automation.Test;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

	import java.io.FileInputStream;

	import java.io.IOException;

	public class ExcelFile {
	// 4.0.1 2018203.zip
	    public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
	        FileInputStream fis = new FileInputStream("D:\\capgemini work space\\java\\New folder\\ORANGEHRM\\Data\\ujwal.xlsx");
	        Workbook wb = WorkbookFactory.create(fis);
	        Sheet sh = wb.getSheet("Sheet1");
	        Row r = sh.getRow(0);
	        Cell c0=r.getCell(0);
	        Cell c1=r.getCell(1);
	        String data0 = c0.getStringCellValue();
	        String data1 = c1.getStringCellValue();
	        System.out.println(data0+" - "+data1);
               
	    }
	}
