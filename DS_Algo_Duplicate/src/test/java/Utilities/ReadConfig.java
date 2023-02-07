package Utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
//object
Properties properties;
	//constructor
	public ReadConfig()
	{
	//config properties path
		
	String path="./Configuration/config.properties";
	try {
		properties=new Properties();
		
			FileInputStream  fis = new FileInputStream(path);
			
			properties.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
				
		}
	}
	
	public String getAppliCationUrl()
		{
			String url = properties.getProperty("baseUrl");
			return url;
		}
		
	public String getUsername()
	     {	
	     String username=properties.getProperty("username");
	      return username;
	     }
	
	public String getPassword()
	   {
		String password=properties.getProperty("password");
	      return password;
	   }

    public String getChromePath()
	    {
	      String chromepath=properties.getProperty("chromepath");
	      return chromepath;
	    }
    
    public String getMsEdgePath()
       {
	  String msedgepath=properties.getProperty("msedgepath");
	  return msedgepath;
       }

	}

	

	

	
	
	
	
