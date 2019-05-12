Feature: login Validation

Background:
Given open browser
|chrome|ie|
|firefox||safar\\\\\\\\\\\\

And nevigate to URL
@smoke
Scenario: valid credential

When user type userId and password
And user click on login button
Then user should see his profile page


@reg
Scenario Outline: invalid credential

When user type "<userId>" and "<password>"
And user click on login button
Then user should not see his profile page

Examples: 
|userId|password|
|user1|1232|
|user2|3524|
|user3|5346|