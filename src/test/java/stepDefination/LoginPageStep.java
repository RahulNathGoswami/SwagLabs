package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStep {

	LoginPage page =new LoginPage();

@When("user enter {string} and {string} deatils")
public void user_enter_and_deatils(String username, String password) {

	page.user_enter_and_deatils(username, password);
	
	
	
}
@And("user click on login btn")
public void user_click_on_login_btn() {
   page.click_on_login_btn(); 
}
@Then("validte sucessfull login")
public void validte_sucessfull_login() {

}

@Then("validate error message")
public void validate_error_message() {
page.validate_error_message();
}
}