package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
     WebDriver driver;
	
	public SigninPage (WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements( driver, this  );	
	}
	
	
		 @FindBy(id ="id_username")WebElement username;   
		 @FindBy(id ="id_password")WebElement password;   
		 @FindBy(xpath ="//input[@value='Login']")WebElement logInBtn;  
	   	@FindBy(linkText="Sign in")WebElement signIn;
		
		
		
	     public void UserName (String uname) {
			username.sendKeys(uname);
			}
		   public void Password(String pwd) {
			password.sendKeys(pwd);
			}
		   public void LogInBtn () {
			logInBtn.click();
			}
		
		    public void SignIn() {
			  signIn.click();
		 }
		    
}
		
		
		
		
		
		
		
		
		
		
	
	

