package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPage;

public class BasketPageStep {
	BasketPage basket =new BasketPage();
	
	
	@And ("user click on add to cart butoon")
	
	
	public void user_click_on_add_to_cart_butoon() {
		basket.clicOnAddToCart();
	}
	
	

	@Then ("validate cart count is {string}")
	
	public void validate_cart_count(String count) {
		
		basket.validateCartCount(count);
	}
	
	@And ("user navigate to checlout page")
	
	public void user_navigate_to_checlout_page() {
		
	}
	
	
	}
