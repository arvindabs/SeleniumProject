package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;

public class ReadConfig {
	
	Actions action;
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties ");
		
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
		    pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());	
		}				
	}
	
	   public String getApplicationUrl()
	   {
		   String url=pro.getProperty("BaseURL");
		   return url;
	   }
	   public String getUserName()
	   {
		   String  uname=pro.getProperty("username");
		   return uname;
	   }
	   public String getPassward()
	   {
		   String pwd=pro.getProperty("passward");
		   return pwd;
	   }
     
}
