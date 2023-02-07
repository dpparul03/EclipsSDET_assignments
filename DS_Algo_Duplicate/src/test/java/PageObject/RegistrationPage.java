package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

WebDriver driver;
	
public RegistrationPage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements( driver, this  );

}
    @FindBy (xpath = "//input[@id='id_username']")WebElement username;
  @FindBy (xpath = "//input[@id='id_password1'] ")WebElement password;
     @FindBy (xpath = "//input[@id='id_password2'] ")WebElement confirmPassword;
   @FindBy (xpath ="//input[@value='Register']")WebElement RegisterBtn;
   @FindBy(linkText="Sign out")WebElement signOutBtn;

	 
   
   public void UserName (String userName){
     username.sendKeys(userName);
    }
     
    public void PassWord (String pwd) {
        password.sendKeys(pwd);
       }
     
    public void ConfirmPassword (String cpwd) {
        confirmPassword.sendKeys(cpwd);
       }
    
    public void clickRegistrationBtn () throws InterruptedException {
      RegisterBtn.click(); 

    }

     public void clicksignOutBtn () throws InterruptedException {
    	signOutBtn.click(); 
	}
	
}
