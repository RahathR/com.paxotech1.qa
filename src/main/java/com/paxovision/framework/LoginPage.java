package com.paxovision.framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {
	
	private WebElement emailBox;
	private WebElement password;
	private WebElement loginButton;
	private WebElement verifyemailbox;
	private WebElement logoutButton;
	public static String logInId = "//input[@class='login_button big red']";
	
	
	public WebElement EmailBox(String emailid){
		emailBox=driver.findElement(By.name("j_username"));
		emailBox.sendKeys(emailid);
		return emailBox;
		
		
	}
	
	public WebElement Password(String Passwordid){
		password = driver.findElement(By.name("j_password"));
		password.sendKeys(Passwordid);
		
		return password;
		
		
	}
	
	
	public WebElement Login(){
		loginButton = driver.findElement(By.xpath("//input[@class='login_button big red']"));
		loginButton.click();
		return loginButton ;
		
	}
	public WebElement logout(){
		logoutButton = driver.findElement(By.xpath(".//*[@id='cart_info']/a[1]/span"));
		logoutButton.click();
		return logoutButton;
	}
	
	public void  verifyemailbox (String text) {
		String verifyemailbox = driver.findElement(By.xpath(".//*[@id='en_US']")).getText();
		System.out.println(verifyemailbox);
		Assert.assertEquals(text, verifyemailbox);
	
	
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	public LoginPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver, this);
		
	}
	 
	
	
		
	
	
	

}
