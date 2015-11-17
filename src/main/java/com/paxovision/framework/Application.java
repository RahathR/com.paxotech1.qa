package com.paxovision.framework;

import org.openqa.selenium.WebDriver;

public class Application {
	
	private WebDriver driver;
	private HomePage homePage = null;
	private LoginPage loginPage = null;
	private RegistrationPage registrationPage = null;
	private HotsaucesPage hotsaucesPage = null;
	private MerchandisePage merchandisePage = null;
	private ShoppingCartTab shoppingcarttab = null;	
	
	 
	public Application(WebDriver driver){
		this.driver = driver;
	}
		
		
		public HomePage homePage(){
			if(homePage ==null){
				homePage = new HomePage(driver);
			}
			return homePage;
		}
		
	
		public LoginPage loginPage(){
			if(loginPage ==null){
				loginPage = new LoginPage(driver);
			}
			return loginPage;
		}
		
		public RegistrationPage registrationPage(){
			if(registrationPage == null){
				registrationPage = new RegistrationPage(driver);
				}
			return registrationPage;
		}
		
		public  HotsaucesPage hotsaucesPage(){
			if(hotsaucesPage == null){
				hotsaucesPage = new HotsaucesPage(driver);
				}
			return hotsaucesPage;
		}

		public  MerchandisePage merchandisePage(){
			if(merchandisePage == null){
				merchandisePage = new MerchandisePage(driver);
				}
			return merchandisePage;
		}


		public  ShoppingCartTab shoppingcarttab(){
			if(shoppingcarttab == null){
				shoppingcarttab = new  ShoppingCartTab(driver);
				}
			return shoppingcarttab;
		
		}
}
		


