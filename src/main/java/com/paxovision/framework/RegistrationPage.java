package com.paxovision.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends PageBase {
	

	public RegistrationPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver, this);
		
	}
	
	public WebElement Register;
	public WebElement EmailBox;
	public WebElement FirstName;
	public WebElement LastName;
	public WebElement Password;
	public WebElement ConfirmPassword;
	public WebElement RegisterButton;
	public WebElement HotsauceTab;
	public WebElement HomeTab;
	public WebElement Merchandise;
	public WebElement Clearance;
	public WebElement Newtohotsauce;
	public WebElement Faqs;
	
	
	
	
	
	
	public WebElement Register(String ClickRegister){
		Register = driver.findElement(By.xpath(".//*[@id='cart_info']/a[2]/span"));
		Register.click();
		return Register;
	
		
	
	
       }
	
	public WebElement EmailBox(String EmailId){
		EmailBox= driver.findElement(By.id("customer.emailAddress"));
		EmailBox.sendKeys(EmailId);
		return EmailBox;
		
		
		}
	public WebElement FirstName(String EnterName){
		FirstName = driver.findElement(By.id("customer.firstName"));
		FirstName.sendKeys(EnterName);
		return FirstName;
		
	}
	
	public WebElement LastName(String EnterLastName){
		LastName = driver.findElement(By.id("customer.lastName"));
		LastName.sendKeys(EnterLastName);
		return LastName;
		
	}

	public WebElement Password(String Passcode){
		Password = driver.findElement(By.id("password"));
		Password.sendKeys(Passcode);
		return Password;
		
	}	
		
		
	public WebElement ConfirmPassword(String Password){
		ConfirmPassword = driver.findElement(By.id("passwordConfirm")); 
		ConfirmPassword.sendKeys(Password);
		return ConfirmPassword;
		
	}
	
	public WebElement RegisterButton(String Register){
		RegisterButton = driver.findElement(By.xpath(".//*[@id='registrationForm']/div[6]/input"));
		RegisterButton.click();
		return RegisterButton;
	}
	
	public WebElement HomeTab(String Home){
		HomeTab = driver.findElement(By.xpath(".//*[@id='content']/nav/ul/li[1]/a"));
		HomeTab.click();
		return HomeTab;
	}
	
	public WebElement HotsauceTab(String HotSauce){
		HotsauceTab = driver.findElement(By.xpath(".//*[@id='content']/nav/ul/li[2]/a"));
		HotsauceTab.click();
		return HotsauceTab;
		
	}
	
	public WebElement Merchandise(String MerchandiseTab){
		Merchandise = driver.findElement(By.xpath(".//*[@id='content']/nav/ul/li[3]/a"));
		Merchandise.click();
		return Merchandise;
	
	}

	public WebElement Clearance(String ClearanceTab){
		Clearance = driver.findElement(By.xpath(".//*[@id='content']/nav/ul/li[4]/a"));
		Clearance.click();
		return Clearance;
	}
	
	public WebElement Newtohotsauce(String NewtohotsauceTab){
		Newtohotsauce = driver.findElement(By.xpath(".//*[@id='content']/nav/ul/li[5]"));
		Newtohotsauce.click();
		return Newtohotsauce;
	}
	
	public WebElement Faqs(String FaqsTab){
		Faqs = driver.findElement(By.xpath(".//*[@id='content']/nav/ul/li[6]/a"));
		Faqs.click();
		return Faqs;
	
	
	
}}