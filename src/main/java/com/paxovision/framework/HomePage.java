package com.paxovision.framework;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase{
	
	
	public HomePage(WebDriver driver){
				super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	private WebElement loginlink;
	private WebElement registration;
	private WebElement tabItems;
	private WebElement hotsauce;
	private WebElement merchandise;
	private WebElement clearance;
	private WebElement newtohotsauce;
	private WebElement faqs;
	private WebElement ShoppingCartTab;
	private WebElement verifyHompage;
	private WebElement verifyLanguages;
	private WebElement verifyLogin;
	private WebElement Errormessage;
	private WebElement verifyRegister;
	
	
	
	public WebElement loginlink(String list){
		loginlink = driver.findElement(By.xpath("//*[text()='"+list+"']"));
		loginlink.click();
		return loginlink;
	}
	
	
	public WebElement registration(){
		registration = driver.findElement(By.xpath("//*[text()='Register']"));
		registration.click();
		return registration;
	}
	
	public WebElement tabItems(String tabname){
		tabItems = driver.findElement(By.xpath("//*[text()='"+tabname+"']"));
		tabItems.click();
		return tabItems;
	}
	
	public WebElement ShoppingCartTab (String cart){
		ShoppingCartTab = driver.findElement(By.xpath("//*[text()='"+cart+"']"));
		ShoppingCartTab.click();
		return ShoppingCartTab;
	
	}
		
	public WebElement verifyHompage (String expected){
		verifyHompage = driver.findElement(By.xpath(".//*[@id='logo']/h1/a"));
		String actual = verifyHompage.getText();
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
		
		return verifyHompage;
		
	
	
	}
	
	public void  verifyLanguages (String text) {
		String verifyLanguages = driver.findElement(By.xpath(".//*[@id='en_US']")).getText();
		System.out.println(verifyLanguages);
		Assert.assertEquals(text, verifyLanguages);
		
		
		
	}

	public void  verifyLogin(String text) {
		String verifyLogin = driver.findElement(By.xpath(".//*[@id='cart_info']/span/a")).getText();
		System.out.println(verifyLogin);
		Assert.assertEquals(text, verifyLogin);
		 
		
	
	
	
}	
	public void  Errormessage(String text) {
		String Errormessage = driver.findElement(By.xpath(".//*[@id='login']/span/p/span")).getText();
		System.out.println(Errormessage);
		Assert.assertEquals(text, Errormessage);
		 
}
	public void  verifyRegister(String text) {
		String verifyRegister = driver.findElement(By.xpath(".//*[@id='login']/span/p/span")).getText();
		System.out.println(verifyRegister);
		Assert.assertEquals(text, verifyRegister);
		
		
	}
	
	

}
		 

