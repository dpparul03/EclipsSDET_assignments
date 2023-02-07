package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructurePage {


WebDriver driver;
	
public DataStructurePage (WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements( driver, this  );
	
}

   

	 @FindBy(xpath=" //a[@href='data-structures-introduction']")WebElement GetStartedDataStructureBtn;  
	
	 @FindBy(linkText="Time Complexity")WebElement TimeComplexityBtn;
	
	 @FindBy(linkText="Practice Questions")WebElement PracticeQuestionsLink;
		
	 @FindBy(linkText="Try here>>>")WebElement clickTryhereBtn;
	
	 @FindBy(xpath ="//pre[@role='presentation']")WebElement TextBoxBtn;
		
	 @FindBy(xpath =" //button[normalize-space()='Run']")WebElement RunBtn;
	 
	 @FindBy(xpath ="  //a[normalize-space()='Sign out']")WebElement SignOut;
	 
	
	
	 
	
	 public void GetSrartedDataStructure () {
	 GetStartedDataStructureBtn.click();
	 
	 }
	 public void TimeComplexity () {
		 TimeComplexityBtn.click();
	 }
	 public void TryHere () {
		 clickTryhereBtn.click();
	 
	}
	 
	 public void TextBox (String string){
		 TextBoxBtn.sendKeys();
	 
	 }
	 
	 public void ClickRunBtn () {
		 RunBtn.click();
	 
	 }
	 
	 public void PracticeQuestions () {
			PracticeQuestionsLink.click(); 
			
	 }
			
	 public void ClickSignOut () {
			SignOut.click(); 
				
	 }
	 
	
}
	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
			

