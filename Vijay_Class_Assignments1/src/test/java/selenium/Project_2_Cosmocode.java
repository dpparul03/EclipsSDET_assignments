package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_2_Cosmocode {
	
	public static void main (String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   driver.get("https://cosmocode.io/automation-practice/");
		
	   WebElement firstname =driver.findElement(By.id("firstname"));
	   firstname.sendKeys("Parul");
	   
	   
	   WebElement lastname =driver.findElement(By.className ("lastname"));
	   lastname.sendKeys("Sharma");
	   
	   
	   WebElement gender =driver.findElement(By.name("gender"));
	   gender.sendKeys("female");
	   
	   WebElement Language =driver.findElement( By.xpath("//input[@value='java']"));
	   Language.click();
	   
	   Select se = new Select(driver.findElement(By.xpath("//select[@name='age']")));
		se.selectByValue("30 to 39");
		
		WebElement submit = driver.findElement(By.id("submit_htmlform"));
		submit.click();
	
	}
}