package testcases;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.RegistrationPageObjects;

import java.io.IOException; 
//import org.openqa.selenium.By; 
import resources.baseclass;
import resources.commonMethods;
import resources.constant;

public class VerifyResgistrationTestCases extends baseclass {
	
	
	@Test 
 	public void verifyRegisterationWithValidData() throws IOException, InterruptedException { 
 		 
 	
 		
 		RegistrationPageObjects rpo=new RegistrationPageObjects(driver);
 		
 		rpo.clickOnMyAccount().click();
 		rpo.clickOnMyRegister().click(); 
 		rpo.enterFirstName().sendKeys(constant.firstname); 
 		rpo.enterlastName().sendKeys(constant.lastname); 
 		rpo.enteremailid().sendKeys(email); 
 		commonMethods.handleWait(driver, 10, rpo.entertelephoneno()); 
 		rpo.entertelephoneno().sendKeys(constant.phone); 
 		rpo.enterPassword().sendKeys(constant.password); 
 		rpo.enterconfirmpassword().sendKeys(constant.confirmpassword); 
 		rpo.clickoncheckbox().click(); 
 		rpo.clickoncontinue().click(); 
 		
 		 		 		
  		commonMethods.handleAssertion(rpo.actualText().getText(), constant.expectedRegisteration);
 		 
 	} 
 		 
	@Test 
 	public void verifyRegisterationWithInValidData() throws IOException, InterruptedException { 
 		 
 		
 		RegistrationPageObjects rpo=new RegistrationPageObjects(driver);
 		
 		rpo.clickOnMyAccount().click();
 		rpo.clickOnMyRegister().click(); 
 		rpo.clickoncontinue().click(); 
 		
 		
 		 		
 		/* SoftAssert sa=new SoftAssert();
 		 
 		  		
 		 String fnActual = rpo.fnactualText().getText();
 		 String fnExpected=constant.fnexpectedregistration;
 		 
 		String lnActual = rpo.lnactualText().getText();
		String lnExpected=constant.lnexpectedregistration;
 		 
		
 	     sa.assertEquals(fnActual, fnExpected);
 	     sa.assertEquals(lnActual, lnExpected);
 	 
 	 	        
 	      		 sa.assertAll();  */
 		
		
 		
 		commonMethods.handleAssertion(rpo.fnactualText().getText(), constant.fnexpectedregistration);
 		commonMethods.handleAssertion(rpo.lnactualText().getText(), constant.lnexpectedregistration);
 		 
 	} 
 		
 		 
 		 
 	 
 		 
 	} 
 	 
 		 
 	
 	 
 	 


