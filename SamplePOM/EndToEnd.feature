Feature: EndToEnd Scenario

@smoke
Scenario: validate mortgage rate for HSBC

Given Open browser
And Nevigate to URL
When User hoverOver on mortgage
And User click on Mortgage rate
And User click on next HSBC Button
Then User should be able to see HSBC Bank Rate Page

@Reg
Scenario: validate Refianace rate for CFBank

Given Open browser
And Nevigate to URL
When User hoverOver on mortgage
And User click on Refiannance rate
And User click on next CFBank Button
Then User should be able to see Quote Option Page