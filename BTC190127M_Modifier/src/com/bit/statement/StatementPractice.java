package com.bit.statement;

import org.junit.Test;

import com.nonAccess.Practice;

public class StatementPractice { //main class file can B public or default
	
	//nested class can have any access modifier 
//	protected class Pen{
//		
//	}
	
	public int e = 2;
	public int e3 = 2;
	public int e2 = 2;
	int e6 = 2; //anything that is default can B accessed in the same package only
	
	public void abc() {
		//local variable can't be public, private, protected
		int a = 1;
	}
	
	@Test
	public void test1() {
		Sample s = new Sample();
		
		String r = s.getPassword();
		System.out.println(r);
		
		s.setPassword("computer");
		String r1 = s.getPassword();
		System.out.println(r1);
		System.out.println(r);
		
		
		//Static example 
		int k = Practice.b;
		Practice.test2();
	}
	
	
	
	

}

//in the same source class only top level class can B public
//class E{
//	
//}
