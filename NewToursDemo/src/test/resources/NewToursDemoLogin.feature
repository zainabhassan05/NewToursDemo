Feature: Login 


Scenario: User is able to login to New Tours 
Given User is on New Tours website
When User enters username
And User enters password
And User clicks sign in
Then User is signed in 