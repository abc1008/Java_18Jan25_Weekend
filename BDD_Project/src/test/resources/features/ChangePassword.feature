Feature: Change Password Feature

  Scenario: Change Password with valid credentials
    Given user navigates to change password page
    And enters valid credentials and hits update button
    Then password should be changed successfully. 
    
   

  Scenario: Change Password with invalid credentials
    Given user navigates to change password page
    And enters invalid password and hits update button
    Then infield error message should be displayed 
