package com.paxovision.framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HotsaucesPage extends PageBase{
	

	private WebElement buyproduct;
	private WebElement BuyNow;
	private WebElement verifyTitle;
	private WebElement verifyHopingsauce;
	
	
	public WebElement Buyproduct(String productName ){
		
		buyproduct=driver.findElement(By.xpath("//img[contains(@alt,\""+productName+"\")]"));  
		elementHighlight(buyproduct);
		buyproduct.click();
		return buyproduct;
	}
	
	public WebElement BuyNow(){
		BuyNow=driver.findElement(By.xpath("//*[@value='Buy Now!']"));
		elementHighlight(BuyNow);
		BuyNow.click();
		return BuyNow;
		
	}
		
	
		public void  verifyTitle(String expected) {
		verifyTitle = driver.findElement(By.xpath("//*[text()='Sweet Death Sauce']"));
		String actual = verifyTitle.getText();
		elementHighlight(verifyTitle);
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
		
	   }
		
	
		public void  verifyHopingsauce(String expected) {
			verifyHopingsauce = driver.findElement(By.xpath("//*[@id='product_content']//*[text()='Hoppin' Hot Sauce']"));
			String actual = verifyHopingsauce.getText();
			elementHighlight(verifyHopingsauce);
			System.out.println(actual);
			Assert.assertEquals(expected, actual);	
		
		
		}
		
	

	
	
	public HotsaucesPage(WebDriver driver){
				super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
}	
	


	
