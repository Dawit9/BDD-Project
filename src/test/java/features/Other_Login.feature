@OtherLogin @Regrassion
Feature: Validate Techfios Longin functionality using scenario Outline

Background: 
	Given User is on the Techfios login page  

@OtherScenario1 
Scenario Outline: User should be able to login with valued credentials 

	When User enters "<username>" and "<password>"
	
	And User clicks on SignIn button 
	Then User shouold land on Dashboard page
	Examples:  
	|username           | password |
	|demo@techfios.com  | abc123   |
	|demo2@techfios.com | abc123  |
	|demo@techfios.com  | abc1234  |
	|demo2@techfios.com  | abc1234  |
	
	
@OtherScenario2 @Smoke	
Scenario Outline: User should be able to login with valued credentials 

	When User enters "<username>" and "<password>"
	
	And User clicks on SignIn button 
	Then User shouold land on Dashboard page
	Examples:  
	|username           | password |
	|demo@techfios.com  | abc123   |
	|demo2@techfios.com | abc123  |
	|demo@techfios.com  | abc1234  |
	