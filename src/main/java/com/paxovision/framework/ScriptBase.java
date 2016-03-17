package com.paxovision.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ScriptBase {
	
	protected WebDriver driver= null;
	private Application heatClinic = null;
	
	
	
	
	@Before
	public void Setup() throws Exception{
		driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://qa1.paxotech.com/heatclinic/");
		
		
	}
	
	public Application heatClinic(){
		if(heatClinic == null){
			heatClinic = new Application(driver);
		}
		return heatClinic;
	}
	
	
	@After
	public void tearDown() throws Exception{
	//	driver.close();
		driver.quit();
	}

}
