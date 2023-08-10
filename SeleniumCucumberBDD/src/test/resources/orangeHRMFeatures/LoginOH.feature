Feature: Test login Functionality of OrangeHRM

Background:
   Given User is on OrangHRM login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario Outline: Check login is successfull with valid credential
    And User is on login page
    When user enters <username> and <password>  
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
