package com.bit.dr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData 
{
	
	
	public StringBuffer readTXT(String path)
	{
		StringBuffer sb=new StringBuffer();
		try {
			FileReader f=new FileReader(new File(path));
			BufferedReader bf=new BufferedReader(f);
			String line=bf.readLine();
			while(line!=null)
			{
				System.out.println(line);
				sb.append(line).append(System.lineSeparator());
				line=bf.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb;
	}
	
	
	
	
	
	
	@DataProvider(name="login")
	public Object[][] getData1()
	{
		
		Object[][] o=new Object[2][2];
		o[0][0]="userid1";
		o[0][1]="s17";
		
		o[1][0]="userid2";
		o[1][1]="724gjh";
		
		return o;
	}
	
	
	
	@DataProvider(name="signuo")
	public Object[][] getData()
	{
		
		Object[][] o=new Object[2][3];
		o[0][0]=7;
		o[0][1]=17;
		o[0][2]=71;
		o[1][0]=27;
		o[1][1]=72;
		o[1][2]=37;
		return o;
	}
	WebDriver dr;
	
	@Test(dataProvider="value")
	public void test3(Object u,Object p)
	{
		readTXT("/Users/bittechconsulting/eclipse-workspace/new/TestNGProject_BTC190127M/file1.txt");
		readTXT("\"/Users/bittechconsulting/eclipse-workspace/new/TestNGProject_BTC190127M/file1.txt\"");
		System.out.println(u+"+"+p);
		dr.findElement(By.xpath("")).sendKeys(u.toString());
	}
	
	@DataProvider(name="value")
	public Object[][] readxl() 
	{
		FileInputStream f = null;
		XSSFWorkbook book = null;
		XSSFSheet sheet = null;
		Object [][]  datas = null;
		try {
			f = new FileInputStream(new File("/Users/bittechconsulting/eclipse-workspace/new/TestNGProject_BTC190127M/book.xlsx"));
		   
			book=new XSSFWorkbook(f);
			sheet=book.getSheetAt(0);
			sheet.getRow(1).getCell(2).getStringCellValue();//to get one cell vale
		
		
		 
			int rowSize=sheet.getLastRowNum();
			int celSize=sheet.getRow(0).getLastCellNum();
			datas=new Object[rowSize][celSize];
		
			for(int i=1;i<rowSize;i++)
			{
				for(int j=0;j<celSize;j++)
				{
					XSSFCell c=sheet.getRow(i).getCell(j);
					switch(c.getCellType())
					{
					case XSSFCell.CELL_TYPE_NUMERIC:
					{
					datas[i-1][j]=c.getNumericCellValue();
					break;
					}
					case XSSFCell.CELL_TYPE_STRING:
					{
					datas[i-1][j]=c.getStringCellValue();
					break;
					}
					
					}
				
				
				
				}
			}
		
			} catch (FileNotFoundException e) {
			e.getMessage();
			System.out.println("file not found");
			}
			catch (IOException e) {
			e.getMessage();
			System.out.println("IO exception");
			}
			catch (NoSuchElementException e) {
			e.getMessage();
			System.out.println("element not found exception");
			}
			catch (Exception e) {
			e.getMessage();
			System.out.println("not matched");
			}
		finally {
			if(book!=null)
			{
				try {
					book.close();
				} catch (IOException e) {
					System.out.println("book is not initialized");
				}
			}
			if(f!=null)
			{
				try {
					f.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("hi");
		
		return datas;
	}
	
	
	
	
	
	
	
	
	
	
	@Test(dataProvider="login")
	public void test1(String a,String  b)
	{
		System.out.println(a+b);
	}

}
