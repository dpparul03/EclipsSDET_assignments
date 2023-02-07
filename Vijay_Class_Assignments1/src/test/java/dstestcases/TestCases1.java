package dstestcases;
import dsutilities.LoggerLoad;
import org.testng.annotations.Test;
public class TestCases1 {

		@Test	
	public void tst01_TestingLog() throws InterruptedException
	{
	
// if want to display info message
	LoggerLoad.info("<------------Testing Info--------->");
// if want to display warn message
	LoggerLoad.warn("‹-----------Testing warn--------->");
//if want to display error message
	LoggerLoad.error("<-------------Testing error--------->");
		
	}

}
