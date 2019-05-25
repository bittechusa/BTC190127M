package com.bit.dr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData 
{
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
		System.out.println(u+"+"+p);
		dr.findElement(By.xpath("")).sendKeys(u.toString());
	}
	
	@DataProvider(name="value")
	public Object[][] readxl() throws IOException
	{
		FileInputStream f=new FileInputStream(new File("/Users/bittechconsulting/eclipse-workspace/new/TestNGProject_BTC190127M/book.xlsx"));
		XSSFWorkbook book=new XSSFWorkbook(f);
		XSSFSheet sheet=book.getSheetAt(0);
		sheet.getRow(1).getCell(2).getStringCellValue();//to get one cell vale
		
		
		 
		int rowSize=sheet.getLastRowNum();
		int celSize=sheet.getRow(0).getLastCellNum();
		Object [][] datas=new Object[rowSize][celSize];
		
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
		
		
		
		return datas;
	}
	
	
	
	
	
	
	
	
	
	
	@Test(dataProvider="login")
	public void test1(String a,String  b)
	{
		System.out.println(a+b);
	}

}
