package TestCase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.SigninPage;
import Utilities.XLUtils;


public class SigninTest  extends Base{


	@Test(priority=0,dataProvider="signinData")


	public void SigninDDT(String uname, String pwd) throws InterruptedException, IOException {

		SigninPage sgn= new SigninPage (driver);

		sgn.SignIn();

		sgn.UserName(uname);
		logger.info("user name provided");
		sgn.Password(pwd);
		logger.info("password provided");
		sgn.LogInBtn ();




	}



	@DataProvider(name="signinData")
	String [][] signinData()  throws IOException{

		try {

			String path=System.getProperty("user.dir")+"\\src\\test\\java\\testData\\LoginData.xlsx";

			int rownum=XLUtils.getRowCount(path, "Sheet2" );
			int colcount=XLUtils.getCellCount(path,"Sheet2",0);
			String signinData [][]  = new String[rownum][colcount];
			for(int i=1;i<=rownum;i++) 
			{

				for(int j=0;j<colcount;j++) 
				{

					signinData[i-1][j] = XLUtils.getCellData(path, "Sheet2", i,j);

				}
			} 
			return  signinData ;

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}
}
