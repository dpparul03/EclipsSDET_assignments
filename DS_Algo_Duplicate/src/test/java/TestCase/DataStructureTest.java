package TestCase;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import PageObject.DataStructurePage;




public class DataStructureTest extends Base {

	@Test(priority=1)
	public void DatastructureTimeComplexity () throws InterruptedException {

		DataStructurePage	 ds = new  DataStructurePage (driver);
		Actions act = new Actions (driver);
		
		
		ds.GetSrartedDataStructure();

		ds.TimeComplexity();

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");

		ds.TryHere();

		act.sendKeys("print('Hello word')").perform();
	    logger.info("Message Sent " );
		ds.ClickRunBtn();
		driver.navigate().back();

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
	}   


	@Test(priority=2)
	public void DataStructurePrecticeQuestion () throws InterruptedException, IOException {

		DataStructurePage ds = new  DataStructurePage (driver);


		ds.PracticeQuestions();

		ds.ClickSignOut();
	    logger.info("SignOut properly " );



		}


	}

