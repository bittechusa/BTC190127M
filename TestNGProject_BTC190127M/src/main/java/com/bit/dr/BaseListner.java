package com.bit.dr;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListner implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is success");
	}

	public void onTestFailure(ITestResult r) {
		// TODO Auto-generated method stub
		 if(r.getStatus()==ITestResult.FAILURE)
		  {
			  System.out.println(r.getName()+"  is failed and took screen shot");
		  }
		 
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+" is onstarted");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+" is onfinish");
	}

}
