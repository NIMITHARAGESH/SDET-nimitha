package com.vtiger.generic;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtility implements AutoConstants{

	/**
	 * @author adi123
	 * read data from Excel
	 * @param <Workbook>
	 * @param <Cell>
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return 
	 * @throws EncryptedDocumentException 
	 * @returm data from excel sheet
	 * @throws EncryptedDocument Exception
	 * @throws IOException
	 * 
	 */
	
	public String readDatafromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstants.excelpath);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row r=sh.getRow(rownum);
		Cell c=r.getCell(cellnum);
		String data=c.getStringCellValue();
		return data;
		
	}
	/**
	 * 
	 * 
	 * @param path
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	
	
	public String readDatafromExcel(String path,String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		 Workbook wb=WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetname);//sheet
		Row r=sh.getRow(rownum);// Row
		Cell c=r.getCell(cellnum);//cell
		
		String data = c.getStringCellValue();
		return data;
		 
	}
	
	/**
	 * get the last row
	 * @param path
	 * @param sheetname
	 * @param rownum
	 * @return rowcount
	 * @return count of last row
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public int getrowcount(String path,String sheetname) throws EncryptedDocumentException, IOException

	{
		FileInputStream fis=new FileInputStream(path);
		 Workbook wb=WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetname);
		int rowcount = sh.getLastRowNum();
		return rowcount;
	}
	
	/**
	 * @author adi123
	 * @param path
	 * @param sheetname
	 * @param rownum
	 * @param coloumn
	 * @param value
	 * @throws EncryptedDocumentException 
	 * @throws IOException
	 * 
	  */
	
	public void writeDataintoExcel(String path,String sheetname,int rownum,int cellnum,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		 Workbook wb=WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetname);
		Row r=sh.getRow(rownum);
		Cell c=r.createCell(cellnum);
		c.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();

	}

}
