package com.paxovision.framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MerchandisePage extends PageBase{
	
	
	
	
	private WebElement buyproduct;
	private WebElement productColor;
	private WebElement shirtsize;
	private WebElement Buynow;
	private WebElement verifyBuyproduct;
	
	
	
	public WebElement Buyproduct(String productName ){
		buyproduct =driver.findElement(By.xpath("//div[contains(text(),\""+productName+"\")]/../..//input[@type='submit']")); 
		buyproduct.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buyproduct;
	}
	
	
	public WebElement productColor(String color ){
		productColor =driver.findElement(By.partialLinkText(color)); 
		productColor.click();
	  delayFor(2000);
		return productColor;
	}
	  
	
	public WebElement shirtsize( String size){
		shirtsize =driver.findElement(By.linkText(size)); 
		shirtsize.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shirtsize;
	
	
}
	public WebElement Buynow(String buynow ){
		Buynow =driver.findElement(By.xpath(".//*[@class='product-options modal simplemodal-data']//*[@class='addToCart']"));
		Buynow.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Buynow;
	
	
	
	
	
	}
		
	public void  verifyBuyproduct(String text) {
		String verifyBuyproduct = driver.findElement(By.xpath(".//*[@id='login']/span/p/span")).getText();
		System.out.println(verifyBuyproduct);
		Assert.assertEquals(text, verifyBuyproduct);
		
		
		
	
	}
	
	
	
	public MerchandisePage(WebDriver driver){
		super(driver);
PageFactory.initElements(this.driver, this);
}

	
}