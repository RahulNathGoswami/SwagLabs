  @Reg2
  Feature: Checkout Funtionality


Scenario: Checkout with valid first name last name and postalcode
When user enter "standard_user" and "secret_sauce" deatils
And user click on login btn
And user click on add to cart butoon
Then validate cart count is "1"
And user navigate to checlout page
