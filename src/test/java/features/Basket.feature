 @Reg2
 Feature: Basket Funtionality

Scenario: verify user is able to add the product into basket

When user enter "standard_user" and "secret_sauce" deatils
And user click on login btn
And user click on add to cart butoon
Then validate cart count is "1"
