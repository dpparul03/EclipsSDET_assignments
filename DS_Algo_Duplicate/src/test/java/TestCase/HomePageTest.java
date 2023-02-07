package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import PageObject.HomePage;


    @Listeners
      public class HomePageTest extends Base {
    	 
    	 
	@Test 
     
    public void homepage() throws InterruptedException, IOException {
    		   			   	
   HomePage hmPage= new HomePage(driver)
   ;
   
   hmPage.clickGetStartedPage();
  logger.info("clicked on get started btn");
  
    
   hmPage.clickdataStructure ();
   
   hmPage.clickDataGetStartedbtn ();
   
   hmPage.clickSignInPage ();
   
  hmPage.clickRegistrationbtn();
  
	

	  
	  
	if ( driver.getTitle().equals("hmPage"));
	  {
		Assert.assertTrue(true);
		logger.info("Homepage open");
	  }
	 
	  {
		  
	  captureScreenShot(driver,"homepage");
		  
		Assert.assertTrue(false);
		logger.info("Homepage not  open");
	  
	  
	
	  }
	
  }
	
      }  
	
      
	
