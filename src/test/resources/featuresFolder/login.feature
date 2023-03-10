
@unit
Feature: My Account Test

Background:
	Given User is on home page
	When User clicks on myaccout link
	
  Scenario: Check dashbaord link1
    Then Verify dashboard link is displayed
