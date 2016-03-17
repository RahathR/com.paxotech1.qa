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
	private WebElement shoppingCart;
	private WebElement updatequntity;

	private WebElement checkoutbutton;
	private WebElement finalCheckoutButton;
	private WebElement emailbox;
	private WebElement checkoutasguest;

	
	
	
	public WebElement item(){
		
		//item=driver.findElement(By.xpath("//a[@id='cartLink']"));
		item=driver.findElement(By.xpath(".//*[contains(@class,'modalcart')][@id='cartLink'"));
		item.click();
		return item;
	}
	public void clickItem(){
		item().click();
	}
	
	
	public WebElement quantity(String quantityAmount ){
		
		quantity=driver.findElement(By.cssSelector(".quantityInput"));  
		quantity.clear();
		quantity.sendKeys(quantityAmount);
		return quantity;
	}
	
	public WebElement shoppingCart(){
		shoppingCart= driver.findElement(By.xpath(".//*[@id='cartLink']"));
		shoppingCart.click();
		return shoppingCart;
	}
	 public void clickCart(){
		 shoppingCart().click();
	 }
	
	
	
	
	
	public WebElement updatequntity(){
		
//		updatequntity=driver.findElement(By.cssSelector(".addToCart"));
		updatequntity=driver.findElement(By.cssSelector(".updateQuantity"));
		updatequntity.click();
		return updatequntity;
	
	}
	
	
	public WebElement checkoutbutton(){
	    delayFor(400);
		//checkoutbutton=driver.findElement(By.xpath("//*[@id='cartLink']"));
		checkoutbutton=driver.findElement(By.xpath(".//*[contains(@class,'modalcart')][@id='cartLink']"));
		checkoutbutton.click();
		return checkoutbutton;
		
	}
	
	public WebElement finalCheckoutButton(){
		finalCheckoutButton = driver.findElement(By.xpath(".//*[@id='checkout']/a"));
		finalCheckoutButton.click();
		return finalCheckoutButton;
		
	
	
	
	
	
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



