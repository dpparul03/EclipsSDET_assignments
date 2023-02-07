package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage (WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements( driver, this  );
		
	}

	 @FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/a[1]/button[1]") WebElement GetStartbtn;        
	@FindBy (xpath ="//a[normalize-space()='Data Structures']")WebElement DataStructures;
	@FindBy (xpath ="//a[@href='linked-list']")WebElement LinkedListedGetStartedBtn;
	@FindBy (xpath = "//a[normalize-space()='Sign in'] ")WebElement SignIn;
	  @FindBy (xpath ="//a[normalize-space()='Register!']" )WebElement Register;
	 
	
	 
	public void clickGetStartedPage () {
	 GetStartbtn.click();
	}
	
	public void clickdataStructure () {
	 DataStructures.click();
	}  
	
	public void clickDataGetStartedbtn () {
		LinkedListedGetStartedBtn.click();
		 
	}
	
	public void clickSignInPage () {
		SignIn.click();

	}
		public void clickRegistrationbtn() {
			Register.click();
	
	}

		
	
}

	

	
		
	
