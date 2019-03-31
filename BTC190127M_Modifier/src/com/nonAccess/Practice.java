package com.nonAccess;

public class Practice extends AbstractPractice{
	//non access modifier are Static, Final and Abstract 
	
//	static class U{
//		
//	}
	
	@Override
	void fbSignUp() {
	
	}

	@Override
	void fbSignIn() {
		
	}
	
	
	
	
	//static always works with changed value 
	//static can B accessed anywhere in the project by class reference 
	//static can't work with non-static but non-static can work with static 
	//static initiates even before the class
	public int a = 1;
	public static int b = 5;
	
	//static can't work with non-static but non-static can work with static 
	int e = 2 + b;
	//static int w = 2 + a;
	
	void test1(){
		System.out.println(a);
		System.out.println(b);
		
		//static int p = 1;
	}
	
	//static method can't be overridden but overload is possible 
	public static void test2(){
		//System.out.println(a);
		System.out.println(b);
		
		//static int p = 1;
	}


	
	
	

}
