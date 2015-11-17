package com.paxotech1.qa;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.Test;

import com.paxovision.framework.ScriptBase;

public class HeatClinicTest extends ScriptBase {
  
	
	/*@Test
	public void test(){
		
	heatClinic().homePage().verifyHompage("The Heat Clinic Home");
	heatClinic().homePage().loginlink("Login");
	heatClinic().loginPage().EmailBox("rahath3@gmail.com");
	heatClinic().loginPage().Password("abcdefg");
	heatClinic().loginPage().Login();
	heatClinic().homePage().verifyLanguages("");
	heatClinic().homePage().verifyLogin("rony");
	}
	
	
	@Test
	public void test2(){
		
		heatClinic().homePage().loginlink("Login");
		heatClinic().loginPage().EmailBox("xrahath3@gmail.com");
		heatClinic().loginPage().Password("abcdefg");
		heatClinic().loginPage().Login();
		heatClinic().homePage().Errormessage("The e-mail address and/or password entered do not match our records. Please try again");
		
	
		
		
	}
	//assertTrue(driver.getPageSource().contains(""));
	
	
	
	@Test
	public void test02(){
		heatClinic().homePage().registration();
	
	}
	*/
	@Test 
	
	public void test3(){
		heatClinic().registrationPage();
		heatClinic().registrationPage().Register(null);
		heatClinic().registrationPage().EmailBox("rahath45@gmail.com");
		heatClinic().registrationPage().FirstName("rony");
		heatClinic().registrationPage().LastName("Rooony");
		heatClinic().registrationPage().Password("abcdefg");
		heatClinic().registrationPage().ConfirmPassword("abcdefg");
		heatClinic().registrationPage().RegisterButton(null);
		
	}	
	
		
	@Test
	public void test4(){
		heatClinic().homePage().tabItems("Hot Sauces");
		heatClinic().hotsaucesPage().Buyproduct("Sweet Death Sauce");
		heatClinic().hotsaucesPage().BuyNow();
		heatClinic().hotsaucesPage().verifyTitle("Sweet Death Sauce");
		heatClinic().homePage().tabItems("Hot Sauces");
		heatClinic().hotsaucesPage().Buyproduct("Hoppin' Hot Sauce");
		heatClinic().hotsaucesPage().BuyNow();
		//heatClinic().hotsaucesPage().verifyHopingsauce("Hoppin Hot Sauce");
		

	
	
		
	}	
		
		
	@Test
	public void test5(){
		heatClinic().homePage().tabItems("Merchandise");
		heatClinic().merchandisePage().Buyproduct("Heat Clinic Hand-Drawn (Men's)");
		heatClinic().merchandisePage().productColor("Red");
		heatClinic().merchandisePage().shirtsize("S");
		heatClinic().merchandisePage().Buynow("Buy Now!");
		heatClinic().shoppingcarttab().item();
		//heatClinic().shoppingcarttab().quantity("2");
		//heatClinic().shoppingcarttab().updatequntity();
		heatClinic().shoppingcarttab().checkoutbutton();
		heatClinic().shoppingcarttab().emailbox("rony102@gmail.com");
		
		
		
		
	
		

}}





/*this is just a test
this is just a test*/
