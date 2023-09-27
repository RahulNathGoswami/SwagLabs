package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base2;

public class BasketPage extends Base2 {

	public void clicOnAddToCart() {
		
		
	WebElement addToCartBtn=	driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"]"));
	
	clickOnElement(addToCartBtn);
	
	
	}
	
	
	public void validateCartCount(String count) {
		
	WebElement cartCount=	driver.findElement(By.xpath("//span[@class=\"fa-layers-counter shopping_cart_badge\"]"));
	  String cartValue=cartCount.getText();
	  
	 	  Assert.assertEquals(count, cartValue);
	  
	}
       public void user_navigate_to_checlout_page() {
		
    	   
    	WebElement checkOutbtn =   driver.findElement(By.xpath("//a[@class=\"btn_action checkout_button\"]"));
    	 clickOnElement(checkOutbtn);
	}
	
}
