package TestCase;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import Utilities.ReadConfig;

public class Base{

	ReadConfig readconfig = new ReadConfig ();

	public String baseUrl=readconfig.getAppliCationUrl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String chromepath=readconfig.getChromePath();
	public String edgepath=readconfig.getMsEdgePath();
	public static Logger logger;
	public static WebDriver driver;	


	@Parameters("browser")
	@BeforeTest
	public void setup(String br)
	{

		if(br.equals("chrome"))

		{

			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver = new ChromeDriver();
		}

		else if(br.equals("msedge"))
		{
			System.setProperty("webdriver.msedge.driver",readconfig.getMsEdgePath());
			driver = new EdgeDriver ();
		}


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		driver.manage().window().maximize(); 	
		driver.get(baseUrl);
		
		
		
		
       logger = LogManager.getLogger("FrameWorkProject");
       logger.info("Url opend" );
       PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterTest  
   public void tearDown()
    {
		driver.close();
		driver.quit();
    }	
	


	 public void captureScreenShot(WebDriver driver, String testName) throws IOException
	     {

	   TakesScreenshot screenshot = ((TakesScreenshot )driver);
	   File src = screenshot.getScreenshotAs(OutputType.FILE);
	   File dest = new File (System.getProperty("user.dir")+ "//Screenshot//" + testName + ".png");
	    FileUtils.copyFile(src, dest);
	    
	}
	

public static synchronized WebDriver getdriver() {
	
	return driver;
}

}




