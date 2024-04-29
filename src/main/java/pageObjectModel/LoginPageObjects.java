package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	
	public WebDriver driver;  // This dirver is null--this dont have any scope  
	  
 	// we will store locators here -- 
  
 	// driver.fidElemet(By.xpath"").click(); 
	
    private By login = By.xpath("//a[text()='Login']");
 	private By email = By.xpath("//input[@name='email']"); 
 	private By password = By.xpath("//input[@name='passwo']"); 
 	private By submitButton = By.xpath("//input[@type='submit']"); 
 	private By actual = By.xpath("//h2[text()='My Account']");
 	private By invalidactual = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
 	 
 	 
 	 
 	public LoginPageObjects(WebDriver driver2) { 
 		 
 		this.driver=driver2; 
 	} 
  
 	public WebElement ClickOnLogin() { 
 		return driver.findElement(login); 
 	} 
 	
	public WebElement enterEmail() { 
 		return driver.findElement(email); 
 	} 
  
 	public WebElement enterPassword() { 
 		return driver.findElement(password); 
 	} 
  
 	public WebElement clickOnsubmitButton() { 
 		return driver.findElement(submitButton); 
 	} 
  
 	public WebElement actualvalid() { 
 		return driver.findElement(actual); 
 	} 
 	
 	public WebElement invalidactual() { 
 		return driver.findElement(invalidactual); 
 	} 

 	
 	

}
