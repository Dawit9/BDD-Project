@Login @Regrassion
Feature: Validate Techfios Longin functionality 

Background: 
	Given User is on the Techfios login page  

@Scenario1 @Smoke	
Scenario: User should be able to login with valued credentials 
	When User enters username as "demo@techfios.com"    
	When User enters password as "abc123"
	And User clicks on SignIn button 
	Then User shouold land on Dashboard page  
	
@Scenario2	
Scenario: User should be able to login with valued credentials 
	When User enters username as "demo2@techfios.com" 
	When User enters password as "abc123"
	And User clicks on SignIn button 
	Then User shouold land on Dashboard page  
	
@Scenario3		
Scenario: User should be able to login with valued credentials 
	When User enters username from database 
	When User enters password from database
	And User clicks on SignIn button 
	Then User shouold land on Dashboard page  
	
	
@Scenatio4 @Smoke		
Scenario: User should be able to login with valued credentials 
	When User enters username as "demo2@techfios.com" 
	When User enters password as "abc1234"
	And User clicks on SignIn button 
	Then User shouold land on Dashboard page  
	
	
