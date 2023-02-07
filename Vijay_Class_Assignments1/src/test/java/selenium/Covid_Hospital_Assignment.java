package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid_Hospital_Assignment {


	public static void main (String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabili\r\n"
				+ "tydetails");
		driver.manage().window().maximize(); 
		// for Loop method
		for (int i=1; i<=121; i++) {

			WebElement hospital = driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//a"));
			String hospitalName = hospital.getText();
			System.out.println("name of the hospital : "+ hospitalName);
			
			WebElement tlbed = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//span[@class='count-text']"));
			String totlebed= tlbed.getText();
			System.out.println("Number of beds: "+ totlebed);
			
			
			 WebElement vacantbed=driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//span[@class='count-text pr-2']"));
			 String vacntbed = vacantbed.getText();
			 System.out.println("Number of vacant beds:" + vacntbed);
			
			
		
				WebElement o2beds = driver.findElement(By.xpath("//div[@id='collapseOne-"+i+"']/div/ul/li[2]/div//div[@class='caption-text']/../div[@class='count-text']"));
				 String bed= o2beds.getAttribute("innerText");
				System.out.println("No. of O2 Beds: " +bed);
						
			
				WebElement ventilator = driver.findElement(By.xpath("//div[@id='collapseOne-"+i+"']/div/ul/li[4]/div/div/../div[@class='count-text']"));
				String vent= ventilator.getAttribute("innerText");
				System.out.println("No. of Ventilators: " +vent);
				 
			 
				
				
		
			hospital.click();
			
			Thread.sleep(500);
			
			try {

		
		WebElement contact = driver.findElement(By.xpath("//span[@id='lblhosCno']"));
			String cnt= contact.getText();
			System.out.println("Contact No :"+cnt);
			
			
			WebElement close=driver.findElement(By.xpath("//span[@aria-hidden='true']"));
			close.click();
			Thread.sleep(500);
			
			}
			catch(Exception e) {
			}
		   	  
					System.out.println("****************************");
					System.out.println("****************************");
					
		
		
		
		

		}
	
	


driver.close();



}

}

