package com.paxovision.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartTab extends PageBase{
	
	
	public ShoppingCartTab(WebDriver driver){
				super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	private WebElement item;
	private WebElement quantity;
	private WebElement updatequntity;
	private WebElement checkoutbutton;
	private WebElement emailbox;
	private WebElement checkoutasguest;
	
	
	
	public WebElement item(){
		
		item=driver.findElement(By.id("cartLink"));
		item.click();
		return item;
	}
	
	
	
	public WebElement quantity(String quantityAmount ){
		
		quantity=driver.findElement(By.cssSelector(".quantityInput"));  
		quantity.clear();
		quantity.sendKeys(quantityAmount);
		return quantity;
	}
	
	
	public WebElement updatequntity(){
		
		updatequntity=driver.findElement(By.xpath("//*[@class='updateQuantity']"));
		updatequntity.click();
		return updatequntity;
	
	}	
	
	public WebElement checkoutbutton(){
		
		checkoutbutton=driver.findElement(By.xpath(".//*[@id='checkout']/a/span"));
	    delayFor(20000);
		checkoutbutton.click();
		return checkoutbutton;
		
	}
	
	
	
	public WebElement emailbox(String emailId){
		
		emailbox=driver.findElement(By.id("emailAddress"));
		emailbox.sendKeys(emailId);
	    return emailbox;
	
	}

	public WebElement checkoutasguest(){
		
		emailbox=driver.findElement(By.id("checkoutasguest"));
		checkoutasguest.click();
	    return checkoutasguest;
	
	
	
	
	
	
}
}



