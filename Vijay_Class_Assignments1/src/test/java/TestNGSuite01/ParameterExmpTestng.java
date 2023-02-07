package TestNGSuite01;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class ParameterExmpTestng {
	@Parameters ({"browser", "userName", "Password"})
	@Test 
	public void test01(@Optional String browser,  String userName, String password) {
		
		System.out.println("name is "+browser);
		System.out.println(" name is "+userName);
		System.out.println("Password is "+password);
		
	
}
}