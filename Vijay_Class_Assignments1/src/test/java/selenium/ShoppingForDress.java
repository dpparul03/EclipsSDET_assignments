package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.StringUtils;

public class ShoppingForDress {


	

	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");


		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("summer dress");
		
		WebElement catalog= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ac_results']//li")));	
		catalog.click();
		
		WebElement addToCart= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='add_to_cart']/button/span[contains(text(),'Add to cart')]")));
		 addToCart.click();
		
		
		WebElement continueShop= new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Continue shopping']")));
		continueShop.click();
		Thread.sleep(1000);
		
		
		//dress1
		WebElement seach = driver.findElement(By.id("search_query_top"));
		seach.sendKeys("faded short sleeve t-shirts"+Keys.ENTER);
		
	    WebElement tshirtimage = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='center_column']//div[@class='product-image-container']")));
		action.moveToElement(tshirtimage).perform();

		WebElement compare= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='functional-buttons clearfix']/div[2]/a[text()='Add to Compare']")));
		compare.click();

		Thread.sleep(500);
		driver.findElement(By.id("search_query_top")).clear();

		//dress2		 
		WebElement printdress = driver.findElement(By.id("search_query_top"));
		printdress.sendKeys("Printed dress"+ Keys.ENTER);


		WebElement imgePrintedDress = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='center_column']//li[2]//div[@class='product-image-container']")));
		action.moveToElement(imgePrintedDress).perform();
		Thread.sleep(1000);
       WebElement addcompare= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a")));
		addcompare.click();
		
		Thread.sleep(2000);
		WebElement finalCompare= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='center_column']/div/div[2]/form/button/span")));
		finalCompare.click();
		
/*diff processs/simple way from compare price to checkout
 * 
		WebElement remove =new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cmp_remove']/i")));
		remove.click();
		Thread.sleep(500);

		WebElement adcart =new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-id-product ='4']/../../div[5]/div/div/a/span")));
		adcart.click();
       WebElement cross =new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='layer_cart']/div/div/span")));
		cross.click();
       WebElement cart =new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //div[@class='shopping_cart']/a/b[contains(text(),'Cart')]")));
		cart.click();

		WebElement checkout =new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='button_order_cart']/span[contains(text(),'Check out')]")));
		checkout.click();
         WebElement checkout1= new WebDriverWait(driver,Duration.ofSeconds(10)).
		until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='cart_navigation clearfix']//span")));
		checkout1.click();
*/

		//Prices comparison
		WebElement price1=driver.findElement(By.xpath("//table[@id=\"product_comparison\"]//td[2]/div[3]/span"));
		WebElement price2=driver.findElement(By.xpath("//table[@id=\"product_comparison\"]//td[3]/div[3]/span"));
		
		String value1 = price1.getText().substring(1);
		String value2 = price2.getText().substring(1);
		
		//Add Dress to cart with High Price
		if (Float.parseFloat(value1) > Float.parseFloat(value2))
		{
			driver.findElement(By.xpath("//table[@id='product_comparison']//td[2]//a[1]/span")).click();
		}
		else
		{
			driver.findElement(By.xpath("//table[@id='product_comparison']//td[3]//a[1]/span")).click();
			
				}
	
		WebElement procheckout= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='layer_cart_cart col-xs-12 col-md-6']/div[4]/span/../a/span")));
		procheckout.click();
		
		
		WebElement finalcheckout1= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='cart_navigation clearfix']//span")));
		finalcheckout1.click();
			
		WebElement email=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@id='email_create']")));
			email.click();	
			
			 String emailAddress = "";
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				while (emailAddress.length() < 5) {
				    int character = (int) (Math.random() * 26);
				    emailAddress += alphabet.substring(character, character + 1);
				emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
				}
				
				
				Thread.sleep(1000);
				WebElement emailEle = driver.findElement(By.xpath("//input[@id='email_create']"));
				emailEle.sendKeys(emailAddress+"@gmail.com");
               driver.findElement(By.xpath("//div[@class='submit']/button/span")).click(); 


		/*	diff way to put email	
				
				Random randomgen = new Random();
				int randomnum = randomgen.nextInt();
				registerEmail.sendKeys("aabbccdd*"+randomnum+"@gmail.com");
				driver.findElement(By.xpath("//div[@class='submit']//span")).click(); */

               Thread.sleep(2000);
   			
       		WebElement gender=new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-id_gender2")));
       		gender.click();
       		
    		
    		WebElement firstname = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer_firstname']")));
    		firstname.click();
    		 firstname.sendKeys("Parul");	


    			driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Sharma");
    			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345@");
    			Select date=new Select(driver.findElement(By.id("days")));
    			date.selectByValue("10");;
    			Select month=new Select(driver.findElement(By.id("months")));
    			month.selectByValue("10");
    			Select year=new Select(driver.findElement(By.id("years")));
    			Thread.sleep(500);
    			year.selectByValue("1988");
    			driver.findElement(By.id("firstname")).sendKeys("");
    			driver.findElement(By.id("lastname")).sendKeys("");
    			driver.findElement(By.id("company")).sendKeys("Numpy");
    			driver.findElement(By.id("address1")).sendKeys("Atlanta");
    			driver.findElement(By.id("city")).sendKeys("Dunwoody");
    			Select state = new Select(driver.findElement(By.id("id_state")));
    			Thread.sleep(500);
    			state.selectByValue("10");
    			driver.findElement(By.id("postcode")).sendKeys("30345");
    			driver.findElement(By.id("uniform-id_country")).click();
    			Select country = new Select(driver.findElement(By.id("id_country")));
    			Thread.sleep(500);
    			country.selectByValue("21");
    			
    			driver.findElement(By.id("phone_mobile")).sendKeys("0123456789");
    			driver.findElement(By.id("alias")).sendKeys("Address");
    			
    			driver.findElement(By.id("submitAccount")).click();
    		 
 // update address   			
    			WebElement updateaddress =new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='address_update']/a/span")));
    			updateaddress.click();
    		 
    			driver.findElement(By.id("address1")).clear();
    			driver.findElement(By.id("address1")).sendKeys("112 drexle");
    			driver.findElement(By.id("submitAddress")).click();
    		 
    			WebElement proceedtocheckout =new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='processAddress']/span")));
    			proceedtocheckout .click();
    		 
  //shipping
    			Thread.sleep(1000);
    			WebElement chk = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-cgv")));
    			action.moveToElement(chk).perform();
    			chk.click();
    			
    			WebElement check = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='processCarrier']/span")));
    			check.click();
    			
  //payment
    			WebElement cheque= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cheque']")));
    			cheque.click();
    			
    		 
   //confirm order 		 
    			WebElement confirmOrder = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='cart_navigation clearfix']/button/span")));
    			action.moveToElement(confirmOrder);
    			action.click().perform();
    			
    		 
    			Thread.sleep(1000);
    			WebElement refID = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='box order-confirmation']")));
    			action.moveToElement(refID);
    			
    			String refStr=refID.getText();
    			//refStr = refStr.substring(refStr.indexOf("reference")+9);
    			String refStr1=StringUtils.substringBetween(refStr,"reference",".");
    			System.out.println("Reference ID : "+refStr1);
    			
    			refStr = refStr.substring(refStr.indexOf("reference")+9);
    			

    		 
    		 WebElement backtoorder = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='cart_navigation exclusive']/a")));
    			action.moveToElement(backtoorder);
    			action.click().perform();
    			
    			//Total Price
    			WebElement totalAmt = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='first_item ']//td[3]/span")));
    			action.moveToElement(totalAmt);
    			System.out.println("Total Amount(with Tax): "+totalAmt.getText());
    			
    			//Order Status
    			WebElement orderStatus = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='first_item ']//td[5]/span")));
    			action.moveToElement(orderStatus);
    			System.out.println("Order Status: "+orderStatus.getText());
    			
    			//Logout
    			driver.findElement(By.xpath("//div[@class='nav']//div[@class='container']//div[2]/a[@class='logout']")).click();

    			driver.close();
    		}	
    		 
    		 
    		 
    		 
    		 
    		 
    		 
}




















