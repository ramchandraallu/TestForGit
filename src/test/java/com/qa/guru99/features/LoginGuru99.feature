Feature: Login test for guru 99 Application 


Scenario: Verify login successfull with valid user 
Then Verify Loginpage is displayed
When loginto apllication with "1303" and "Guru99"
Then Verify login is succesfull 