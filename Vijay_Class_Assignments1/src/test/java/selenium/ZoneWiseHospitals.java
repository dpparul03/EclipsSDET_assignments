package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ZoneWiseHospitals {
	
	
	public static void main (String[] args ) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabili\r\n"
				+ "tydetails");

	
			for(int j=1;j<=10;j++) {
			
			WebElement zoneElement=driver.findElement(By.xpath("//select[@name='ddlZone']"));
			zoneElement.click();
			Select dropDown = new Select(zoneElement);
			List<WebElement> zonelist = dropDown.getOptions();
			
			String zones = zonelist.get(j).getText();
			dropDown.selectByIndex(j);
			System.out.println("Zone:"+zones);
			System.out.println("----------------------------------------------------------------");

}
	}
}
			