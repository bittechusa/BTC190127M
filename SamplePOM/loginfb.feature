Feature: login Validation

Scenario: valid credential
Given open browser
And nevigate to URL
When user type userId and password
And user click on login button
Then user should see his profile page


Scenario Outline: invalid credential
Given open browser
And nevigate to URL
When user type "<userId>" and "<password>"
And user click on login button
Then user should not see his profile page

Examples: 
|userId|password|
|user1|1232|
|user2|3524|
|user3|5346|