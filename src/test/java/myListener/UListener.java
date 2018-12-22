package myListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class UListener implements ITestListener {

	 @Override		
	    public void onFinish(ITestContext Result) 					
	    {		
	                		
	    }		

	    @Override		
	    public void onStart(ITestContext Result)					
	    {		
	            		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	    {		
	    		
	    }		

	    // When Test case get failed, this method is called.		
	    @Override		
	    public void onTestFailure(ITestResult Result) 					
	    {		
	    	System.out.println("==> TestCase Failed : " + Result.getName());
		    
	    }		

	    // When Test case get Skipped, this method is called.		
	    @Override		
	    public void onTestSkipped(ITestResult Result)					
	    {	
	    	System.out.println("==> TestCase Skipped : " + Result.getName());
		    
	    }		

	    // When Test case get Started, this method is called.		
	    @Override		
	    public void onTestStart(ITestResult Result)					
	    {
	    	System.out.println(" ==> " + Result.getName() +" TestCase Started");
		    
	    }		

	    // When Test case get passed, this method is called.		
	    @Override		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    	System.out.println("==> TestCase Passed : " + Result.getName());
		    
	    }		

	
}
