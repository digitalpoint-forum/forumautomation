Feature: Digital Point Forum website Validation
@regressiontest
Scenario: Forum website Home Page Validation
Given Google as a  browser
When user type url of the forum website 
Then forum website home page is opened 
And the title of the home page is validated 

@smoketest @regressiontest
Scenario Outline: Verification of forum login page functionality 
Given Open the chorme and launch the application			
When The user Enter the Username <username> and Password <password> 		
And click on login button
Then velidate the login page 

Examples:                      		
|username  |password|		
|nizam@digitalpoint.tech|abcdef*123456|	

@smoketest @regressiontest
Scenario: Successful logout from application 

    When user logs out from application 
    Then user is back on login page window
    And Browser quit by driver		
