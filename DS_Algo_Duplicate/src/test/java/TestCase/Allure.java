package TestCase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;
import org.openqa.selenium.TakesScreenshot;

public class Allure extends Base implements ITestListener {

	private static String getTestMethodName(ITestResult iTestResult) {
		
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	
	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		
		
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value="{0}",type="text/plain")
	public static String saveTextLog(String message) {
		
		return message;
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("I am in start of  method"+ result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I am in start of  method"+ result.getMethod().getMethodName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			saveFailureScreenShot(driver);
			saveTextLog(getTestMethodName(result)+ " failed and screenshot Taken");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("I am in start of  method"+ context.getName());
		//context.setAttribute("WebDriver", BaseClass.driver);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("I am in finish of  method"+ context.getName());
			
	}
	
	

}

