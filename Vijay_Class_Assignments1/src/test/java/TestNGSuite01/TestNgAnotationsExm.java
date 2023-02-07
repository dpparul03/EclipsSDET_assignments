package TestNGSuite01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	   public class TestNgAnotationsExm {

//Q1

@BeforeTest
public void BeforeTest(){
	System.out.println("I am executing before every test");
}

@Test
public void testCase01() {
	System.out.println(" Testcase01");
}
@AfterTest
public void AfterTest(){
	System.out.println("I am executing After every test");
}



@BeforeClass
public void BeforeClass(){
	System.out.println("I am executing before every class");
}
@Test
public void testCase02() {
	System.out.println(" Testcase01");
}
@AfterClass
public void AfterClass(){
	System.out.println("I am executing After every class");
}



@BeforeSuite
public void BeforeSuite(){
	System.out.println("I am executing before every suite");
}
	@Test
	public void testCase03() {
		System.out.println(" Testcase01");	
}
@AfterSuite
public void AfterSuite(){
	System.out.println("I am executing After every suite");
}



@BeforeMethod
public void beforeMethod() {
	System.out.println("I am exeuting before every method");
}
@Test
public void testCase04() {
	System.out.println(" Testcase01");
}
@AfterMethod
public void afterMethod() {
	System.out.println("I am exeuting after every method");
}





	   
	
	
		@DataProvider
		public Object[][] data001(){

			Object[][] data={ 
					{"parul", "pass001", "Login Success"},
					{"sharma", "pass002", "Login failure"}
			};

			return data;
		}
			@Test 
			(dataProvider = "data001")
			public void login(String username, String password, String Message) {

				System.out.println(username +" and "+ password);
				System.out.println("Error message is "+ Message);

			}
			
			 
			
			
	//     Q7  group
			   
			  @BeforeGroups (groups = {"smoke"})
				public void beforeGroup() {
					System.out.println("I am executing before group of Smoke");
				}
				
				@AfterGroups(groups = {"smoke"})
				public void AfterGroup() {
					System.out.println("I am executing After group of Smoke");
				}  
			   
			    @Test (groups = {"smoke" })
			   public void test05() {
			   System.out.println(" test case 05");	
			    }
			   
		
		
		
		@Parameters ({"browser", "userName", "Password"})
		@Test 
		public void test01( String browserName,  String userName, String password) {
			
			System.out.println("browsername is "+browserName);
			System.out.println("User name is "+userName);
			System.out.println("Password is "+password );
			
	
		
			
//assignment 8- part 2			
		//example for reporter and assert
		
		
		/*
		 @Test (groups = {"smoke" })
		   public void test05() {
		   System.out.println(" test case 05");	
		  Reporter.log ("i am executing test case 05");
		  
		 }
		  
		 @Test
		 public void testCase04() {
		 	System.out.println(" Testcase01");
		   
		 	Reporter.log ("i am executing test case 01");
		  Assert.assertEquals(true, false);
		  
		  */
		 } 	
		
		
	
		 
		  
		  
		  
		/*
	Q4	 order/ hierarchy -	
		
		 @BeforeSuite
		   public void BeforeSuite() {
		   System.out.println("executing before every suite");
		   }
		
		 @BeforeTest
		   public void BeforeTest() {
			   System.out.println("executing before every test");
			   }
		 @BeforeClass
		   public void BeforeClass() {
			   System.out.println("executing before every class");
			   }
		 @BeforeMethod
		   public void beforeMethod() {
		   System.out.println("executing before every method");
		    }
		   
		   @AfterMethod
		   public void afterMethod() {
		   System.out.println("executing after every method");
		}
		
		   @AfterClass
		   public void AfterClassClass() {
			   System.out.println("executing after every class");
			   }
		   
		   @AfterTest
			  public void AftereTest() {
				   System.out.println("executing after every test");
				   }
		   @AfterSuite
		   public void AfterSuite() {
		   System.out.println("executing after every suite");
		   }
		  
		   */
		   
		      
	    
	
		
		}
	   
	   
		
	