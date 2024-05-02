package testcases;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.RegistrationPageObjects;
import resources.baseclass;
import resources.commonMethods;
import resources.constant;

public class VerifyLoginTestCases extends baseclass {
	//mahesh line 1
	//mahesh line 2
	
	@Test 
 	public void verifyLoginWithValidData() throws IOException, InterruptedException { 
 		 
 		
 		
        RegistrationPageObjects rpo=new RegistrationPageObjects(driver);
 		rpo.clickOnMyAccount().click();
 		
 		 
 		LoginPageObjects lpo=new LoginPageObjects(driver); 
 		
 		lpo.ClickOnLogin().click();
 		 
 		lpo.enterEmail().sendKeys(email); 
 		commonMethods.handleWait(driver, 12, lpo.enterPassword());  
 		lpo.enterPassword().sendKeys(constant.password); 
 		lpo.clickOnsubmitButton().click();
 		
 		 
 		 commonMethods.handleAssertion(lpo.actualvalid().getText(), constant.expectedlogin);
 	
    /*    SoftAssert sa=new SoftAssert();
 		 
 		 String actual = lpo.actualvalid().getText();
 	     String expected = constant.expectedlogin;
 	     sa.assertEquals(actual, expected);
 		 sa.assertAll();
 		 
 		*/
 		 
 		}
 		 	
	
	@Test 
 	public void verifyLoginwithInValidData() throws IOException, InterruptedException { 
 		 
 		
 		  RegistrationPageObjects rpo=new RegistrationPageObjects(driver);
 	 		rpo.clickOnMyAccount().click();
 	 		
 		 
 		LoginPageObjects lpo=new LoginPageObjects(driver); 
 		lpo.ClickOnLogin().click();
 		 
 		lpo.enterEmail().sendKeys(email); 
 		Thread.sleep(4000);
 		lpo.enterPassword().sendKeys(constant.invalidPassword); 
 		lpo.clickOnsubmitButton().click(); 
 		 
 		 
 	
      /*   SoftAssert sa=new SoftAssert();
 		 
 		 String actual = lpo.invalidactual().getText();
 	     String expected = constant.expectedinvalidlogin;
 	     sa.assertEquals(actual, expected);
 		 sa.assertAll();
 		 
	
	*/
	
 		commonMethods.handleAssertion(lpo.invalidactual().getText(), constant.expectedinvalidlogin);
	
	
	}
	
	
	
	}


