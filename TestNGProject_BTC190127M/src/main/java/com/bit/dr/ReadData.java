package com.bit.dr;

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
	
	@Test(dataProvider="login")
	public void test1(String a,String  b)
	{
		System.out.println(a+b);
	}

}
