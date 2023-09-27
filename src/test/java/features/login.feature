 @Reg2
 Feature: Login Funtionality


Scenario: login with valid credentials
When user enter "standard_user" and "secret_sauce" deatils
And user click on login btn
Then validte sucessfull login


Scenario: login with  invalid username valid password
When user enter "standard_usbbber" and "secret_saubbbce" deatils
And user click on login btn
Then validate error message

Scenario: login with valid username and invalid password
When user enter "standard_user" and "secret_sabbuce" deatils
And user click on login btn
Then validate error message

Scenario: login with  invalid username valid password
When user enter "standabbrd_user" and "secret_sauce" deatils
And user click on login btn
Then validate error message