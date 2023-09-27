package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base2;

public class LoginPage extends Base2 {

	

	
	public void user_enter_and_deatils(String username, String pass) {

	WebElement userName =	driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys(username);
		
	WebElement password=	driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys(pass);
}
	 public void click_on_login_btn() {
		 
	WebElement btn=	  driver.findElement(By.xpath("//input[@type='submit']"));
		 
	clickOnElement(btn);
	 }
	
	
	public void validate_error_message() {
		
	WebElement errorMessage=	driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		Assert.assertTrue(errorMessage.isDisplayed());
	}
	
}