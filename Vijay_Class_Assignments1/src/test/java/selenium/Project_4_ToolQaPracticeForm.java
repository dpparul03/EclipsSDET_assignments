package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_4_ToolQaPracticeForm {


	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");


		WebElement frstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		frstName.sendKeys("Parul");

		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("Sharma");

		WebElement useremail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		useremail.sendKeys("dp.sharma");

		WebElement gender=driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[2]/label"));
		gender.click();
			

		WebElement usernumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		usernumber.sendKeys("0123456789");

		
		
		 WebElement dateofbirth=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		Select dropDown = new Select(dateofbirth);
		dropDown.selectByVisibleText("27 Sep 2022 ");
	

	
		
      // WebElement Subjects = driver.findElement(By.xpath("//div[@id='subjectsWrapper']/div[2]/div/div/div"));
		// Subjects.sendKeys("Computer Science");



		WebElement hobbie=driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label"));
		hobbie.click()
		;  

		WebElement picture = driver.findElement(By.id("uploadPicture"));
		picture.sendKeys("C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\pom.xml");

		WebElement address = driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']/div[2]/textarea"));
		address.sendKeys("hn123");





	}	

}