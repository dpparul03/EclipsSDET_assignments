package TestCase;
import java.io.IOException;
import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.RegistrationPage;
import Utilities.XLUtils;

public class RegistrationTest extends Base{
	
	@Test(priority =0 ,dataProvider="RegistrationData")
	public void RegistrationDDT(String userName, String pwd, String cpwd) throws InterruptedException 
	 {
     RegistrationPage rpg= new  RegistrationPage (driver);
    
    rpg.UserName(userName);
  
	rpg.PassWord(pwd);
	 logger.info("Entered password " );
	rpg.ConfirmPassword(cpwd);
	 logger.info("Entered confirm password" );
	rpg.clickRegistrationBtn();
	
	 }
	
	@Test(priority=1)
	
	public void sighOutOnRegistrationPage () throws InterruptedException {
		RegistrationPage rpg= new  RegistrationPage (driver);
	rpg.clicksignOutBtn();
	}

	 
	 
   @DataProvider(name="RegistrationData")
	String [][] getRegistrationData()  throws IOException {
	  Random rand = new Random();
	  int num;
	   
	   
   try {
	String path=System.getProperty("user.dir")+"\\src\\test\\java\\testData\\LoginData.xlsx";
	
	int rownum=XLUtils.getRowCount(path, "Sheet1" );
	int colcount=XLUtils.getCellCount(path,"Sheet1",1);
	 String registrationData[][]=new String[rownum][colcount];
 
      for(int i=1;i<=rownum;i++) {

 		  num=rand.nextInt(10000);
 		  
	 for(int j=0;j<colcount;j++) {
	   
    registrationData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j)+num;
	 }
 } 
 return registrationData;
 
	}
catch (Exception e) {
	System.out.println(e.getMessage());
}
	return null;

}

}
	 

