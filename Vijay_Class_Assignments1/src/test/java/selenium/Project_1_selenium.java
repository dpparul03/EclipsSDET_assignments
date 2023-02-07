package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Project_1_selenium {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");


		WebElement textarea = driver.findElement(By.id("ta1"));

		textarea.sendKeys("hello I am NumpyNinja");

		WebElement input= driver.findElement(By.id("radio2"));

		input.sendKeys("female");


	   WebElement username =driver.findElement(By.xpath ("//div[@id='HTML31']/div//input"));

		username.sendKeys("Parul");

	
		
		WebElement lastname =driver.findElement(By.xpath ("//div[@id='HTML31']/div//input[2]"));
	
		lastname.sendKeys("pass123") ;

		WebElement button=driver.findElement(By.xpath("//button[@value='LogIn']"));
		button.click();

		WebElement userid =driver.findElement(By.xpath("//input[@name='userid']"));

		userid.sendKeys("dp.parul") ;


		WebElement password =driver.findElement(By.xpath ("//input[@name='pswrd']"));
		password.sendKeys("parul123") ;


		WebElement onclick=driver.findElement(By.xpath("//input[@value='Login']"));
		onclick.click();

	}
}