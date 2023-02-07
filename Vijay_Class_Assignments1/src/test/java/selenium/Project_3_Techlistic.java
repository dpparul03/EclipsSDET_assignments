package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_3_Techlistic {
	

	public static void main (String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
	   
	   WebElement firstname=driver.findElement(By.name("firstname"));
	 firstname.sendKeys("Parul");
	   
	   WebElement lastname =driver.findElement(By.name ("lastname"));
	   lastname.sendKeys("Sharma");
	 

	WebElement exp =driver.findElement(By.xpath("//input[@value='2']"));
	exp.click();
	
	WebElement datepicker =driver.findElement(By.id ("datepicker"));
	datepicker.sendKeys("09/16/2022");
	
	WebElement checkbox =driver.findElement(By.xpath("//input[@value='Automation Tester']"));
	checkbox.click()
	;
	WebElement tools=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
	tools.click()
	;
	
	
	//WebElement continents=driver.findElement(By.name("continents"));
	// continents.sendKeys("Europ");
	   
		
	  
	WebElement dropdown=driver.findElement(By.id("continents"));
	dropdown.click();
	 driver.findElement(By.xpath("//option[. = 'Europe']")).click();

	

	 WebElement dropdwn= driver.findElement(By.id("selenium_commands"));
	    dropdwn.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

	}
	
}
	















	/*
	 // Select Continent
    driver.findElement(By.id("continents")).click();
    WebElement dropdown = driver.findElement(By.id("continents"));
    dropdown.findElement(By.xpath("//option[. = 'Asia']")).click();

    // Select Command
    WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
    dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

*/
