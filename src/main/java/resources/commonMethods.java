package resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	
	
	public static void handleAssertion(String actual, String expected) {
		
		SoftAssert sa=new SoftAssert();
		
		 String actual1 = actual;    // verifyRegisterationWithValidData
	     String expected1 = expected;
	     sa.assertEquals(actual1, expected1);
		 sa.assertAll();
		
								  		 	  		
 		 String fnActual = actual;   //  verifyRegisterationWithInValidData
 		 String fnExpected=expected;
 		 
 		String lnActual = actual;
		String lnExpected=expected;
 		 
		
 	     sa.assertEquals(fnActual, fnExpected);
 	     sa.assertEquals(lnActual, lnExpected);
 	         	 sa.assertAll();
 	         	 
 	         	 
 	         	 	   		 
 	   		 String actualvalid = actual;   //verifyLoginWithValidData
 	   	     String expectedvalid = expected;
 	   	     sa.assertEquals(actualvalid, expectedvalid);
 	   		 sa.assertAll();
 	   		 
 	   		String actualinvalid = actual;    //verifyLoginWithInValidData
 	 	     String expectedinvalid = expected;
 	 	     sa.assertEquals(actualinvalid, expectedinvalid);
 	 		 sa.assertAll();
 	         	 
	}
	
	
	public static void handleWait(WebDriver driver, int time, WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
		
		
	
	
	

}
