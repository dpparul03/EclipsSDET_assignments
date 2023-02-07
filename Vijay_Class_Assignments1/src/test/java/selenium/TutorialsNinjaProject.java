package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialsNinjaProject {


	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Deepak\\Parul_Learning\\SDET81\\Assignment\\Maven_1\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php \r\n"+ "");


		driver.manage().window().maximize();

		Thread. sleep (1000);

		WebElement cur =driver.findElement( By.xpath(" //div[@class='pull-left']/form/div/button/span"));
		cur.click();

		Thread. sleep (1000);

		WebElement curnc =driver.findElement( By.xpath("//div/div/form/div/button/span/../../ul/li/button[@name='EUR'] "));
		curnc.click();

		Thread. sleep (1000);

		WebElement cart =driver.findElement( By.xpath(" //div[@id='content']/div[2]/div[4]/div/div[3]/button/i"));
		cart.click();


		try
		{
			WebElement selectcamera = driver.findElement(By.xpath("//select[@id='input-option226']"));
			Select dropDown = new Select( selectcamera);
			dropDown.selectByIndex(1);
		}
		catch(Exception e) {
			System.out.println("unavailable to select camera" +e.getMessage());

			Thread. sleep (1000);


			WebElement home =driver.findElement( By.xpath("//i[@class='fa fa-home'] "));
			home.click();

			Thread. sleep (1000);

			WebElement image =driver.findElement( By.xpath(" //div[@id='content']/div[2]/div[2]/div/div/a/img"));
			image.click();

			Thread. sleep (1000);

			WebElement phonequant =driver.findElement(By.xpath("//div[@id='product']/div/input"));
			phonequant.clear(); 
			phonequant.sendKeys("2");

			Thread. sleep (1000);

			WebElement addcart =driver.findElement( By.xpath(" //div[@id='product']/div/input[2]/../../div/button"));
			addcart.click();

			Thread. sleep (1000);

			WebElement success =driver.findElement( By.xpath("//div[@class='alert alert-success alert-dismissible']"));
			success.click();
			System.out.println(success.getText());

			Thread. sleep (1000);

			WebElement clickcart =driver.findElement( By.xpath("//div[@class='col-sm-3']/div/button/span"));
			clickcart.click();

			Thread. sleep (1000);

			WebElement viewcart =driver.findElement( By.xpath("//div[@class='col-sm-3']/div/button/span/../../ul/li[2]/div/p/a/strong"));
			viewcart.click();

			Thread. sleep (1000);

			WebElement phonequantity =driver.findElement( By.xpath("//input[@class='form-control']"));
			phonequantity.clear();
			phonequantity.sendKeys("3");


			WebElement update =driver.findElement( By.xpath("//input[@class='form-control']/.././span/button/i[1]"));
			update.click();


			WebElement taxEle =driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td/strong"));
			String Ecotax = taxEle.getText();
			System.out.println("Ecotax value: " + Ecotax); 

			WebElement vatEle =driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr/td[2]/../../../../table/tbody/tr[3]/td/strong"));
			String vat = vatEle.getText();
			System.out.println(" VAT: " + vat); 

			Thread. sleep (1000);

			WebElement checkout =driver.findElement( By.xpath("//div[@class='buttons clearfix']/div[2]/a"));
			checkout.click();

			WebElement stockout = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			System.out.println(stockout.getText()); 

			Thread. sleep (1000);

			WebElement updatecart=driver.findElement( By.xpath("//span[@id='cart-total']"));
			updatecart.click();

			Thread. sleep (1000);

			WebElement removeitem=driver.findElement( By.xpath("//span[@id='cart-total']/../../ul/li/table/tbody/tr/td[5]/button"));
			removeitem.click();


			Thread. sleep (500);

			WebElement backhome=driver.findElement( By.xpath("//div[@class='pull-right']/a"));
			backhome.click();

			Thread. sleep (1000);
			
			WebElement macbook=driver.findElement( By.xpath("//div[@class='image']/a/img"));
			macbook.click();
			
			Thread. sleep (1000);
			
			WebElement adcart=driver.findElement( By.xpath("//div[@id='product']/div/input[2]/../button"));
			adcart.click();

			Thread. sleep (1000);

			WebElement successmsg=driver.findElement( By.xpath("//div[@class='alert alert-success alert-dismissible']"));
			successmsg.click();
			System.out.println(successmsg.getText());

			WebElement shopcart=driver.findElement( By.xpath("//div[@id='top-links']/ul/li[4]/a/span"));
			shopcart.click();

			Thread. sleep (1000);


			WebElement coupon=driver.findElement( By.xpath("//div[@class='panel-group']/div/div/h4/a"));
			coupon.click();

			
			WebElement adcoupon=driver.findElement( By.xpath("//input[@id='input-coupon']"));
			adcoupon.sendKeys("ABCD123");

			Thread. sleep (1000);
			
			WebElement couponaply=driver.findElement( By.xpath("//input[@id='input-coupon']/../span/input"));
			couponaply.click();


			Thread. sleep (1000);

			WebElement errormessage=driver.findElement( By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			errormessage.click();
			System.out.println(errormessage.getText());

			

			WebElement giftcard=driver.findElement( By.xpath("//a[@href='#collapse-voucher']"));
			giftcard.click();

			
			WebElement 	adgiftcard=driver.findElement( By.xpath("//input[@name='voucher']"));
			adgiftcard.sendKeys(" AXDFGH123");

			Thread. sleep (1000);
			
			
			WebElement clickaply=driver.findElement( By.xpath("//input[@name='voucher']/../span/input"));
			clickaply.click();

			Thread.sleep (1000);

			WebElement giftcarderror=driver.findElement( By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			giftcarderror.click();
			System.out.println(giftcarderror.getText());

			Thread.sleep (1000);

			WebElement opencoupon=driver.findElement( By.xpath("//div[@class='panel-group']/div/div/h4/a"));
		    opencoupon.click();
	
		    Thread.sleep (1000);
		    
			WebElement clncoupon=driver.findElement( By.xpath("//input[@id='input-coupon']"));
			clncoupon.clear();

			Thread.sleep (1000);

		   WebElement opengiftcard=driver.findElement( By.xpath("//a[@href='#collapse-voucher']"));
		   opengiftcard.click();
		
			Thread.sleep (1000);
			
		
			WebElement removegiftcard=driver.findElement( By.xpath("//input[@name='voucher']"));
			removegiftcard.clear();
			
			Thread.sleep (1000);
			
			WebElement chekout=driver.findElement( By.xpath("//div[@class='buttons clearfix']/div[2]/a"));
			chekout.click();
			
		
			Thread.sleep (1000);
			
			WebElement continueEle = driver.findElement(By.xpath("//input[@value='Continue']"));
			continueEle.click();
			
			Thread.sleep (1000);
			
			 WebElement firstname =driver.findElement(By.xpath("//input[@name='firstname']"));
			  firstname.sendKeys("Parul");
			   
			  WebElement lasttname =driver.findElement(By.xpath("//input[@name='lastname']"));
			  lasttname.sendKeys("Sharma");

			  Thread.sleep (1000);
			  
			// WebElement email =driver.findElement(By.xpath("//input[@id='input-payment-email']"));
			// email.sendKeys("e.parulsharma@gmail.com");
			  
			  String emailAddress = "";
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				while (emailAddress.length() < 5) {
				    int character = (int) (Math.random() * 26);
				    emailAddress += alphabet.substring(character, character + 1);
				emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
				}
			    

				WebElement emailEle = driver.findElement(By.id("input-payment-email"));
				emailEle.sendKeys(emailAddress+"@gmail.com");

			    
			  WebElement contact =driver.findElement(By.xpath("//input[@name='telephone']"));
			  contact.sendKeys("0123456789");
			   
			  Thread.sleep (1000);
			  
			  
			  WebElement password =driver.findElement(By.xpath("//input[@id='input-payment-password']"));
			  password.sendKeys("abc2123");
			   
			  Thread.sleep (1000);
			   
			  WebElement confpassword =driver.findElement(By.xpath("//input[@name='confirm']"));
			 confpassword.sendKeys("abc2123");
			   
			  
			 WebElement company =driver.findElement(By.xpath("//input[@id='input-payment-company']"));
			 company.sendKeys("amazing");
			   
			  
			 WebElement address1=driver.findElement(By.xpath("//input[@id='input-payment-address-1']"));
			 address1.sendKeys("hn123");
			   
			  
			  
			 WebElement address2 =driver.findElement(By.xpath("//input[@id='input-payment-address-2']"));
			 address2.sendKeys("hn1234");
			   
			  
			 WebElement city =driver.findElement(By.xpath("//input[@id='input-payment-city']"));
			 city.sendKeys("Atlanta");
			   
			  
			 WebElement postcode=driver.findElement(By.xpath("//input[@id='input-payment-postcode']"));
			 postcode.sendKeys("234567");
			   
			 Thread.sleep (1000);
			
			 Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']")));
				dropDown.selectByValue("223");
				
				Thread.sleep (1000);
				
				dropDown = new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']")));
				dropDown.selectByValue("3631");

				WebElement newsletter=driver.findElement( By.xpath("//input[@name='newsletter']"));
				newsletter.click();

				WebElement policy=driver.findElement( By.xpath("//input[@name='agree']"));
				policy.click();

				Thread. sleep (1000);
				
				WebElement contnue=driver.findElement( By.xpath("//input[@id='button-register']"));
				contnue.click();
				
				Thread. sleep (1000);
				
				 WebElement textcomment =driver.findElement(By.xpath("//textarea[@name='comment']"));
				textcomment.sendKeys("call before delivery");
				   
				Thread. sleep (1000);
				
				WebElement	agree = driver.findElement(By.xpath("//input[@name='agree']"));
				agree.click();
				
				WebElement conti = driver.findElement(By.xpath("//input[@id='button-payment-method']"));
				conti.click();
				
				
				Thread. sleep (1000);

			   WebElement warning=driver.findElement( By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
				warning.click();
				System.out.println(warning .getText());

				Thread. sleep (1000);

				WebElement paymethod = driver.findElement(By.xpath("//div[@id='content']/div/div[3]/div/h4/a"));
				paymethod.click();
				
				
				WebElement contactUs= driver.findElement(By.xpath("//html/body/footer/div/div/div[2]/ul/li[1]/a"));
				contactUs.click();
				
				Thread. sleep (1000);
				
				WebElement enquiry = driver.findElement(By.xpath("//textarea[@id='input-enquiry']"));
				enquiry.sendKeys("Unable to add payment ");
				
				
				WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
				submit.click();
				
				
				WebElement clickcontnue = driver.findElement(By.xpath("//div[@id='content']/div/div/a"));
		         clickcontnue.click();
				

			}

				
}
	}


