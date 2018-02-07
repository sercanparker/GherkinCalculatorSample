#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Summation feature of Calculator

	Background:
		Given Create a calculator

	Scenario: MapExample
		Given The board is:
			|Sercan|0|
			|Parker|1|
		
  Scenario Outline: Summation of two positive numbers
    When I enter two positive number as <number1> and <number2>
    Then The number represented on screen is <sum>.
    
  Examples:
    | number1 | number2 | sum |
    |  12   |  5  |  17   |
    |  20   |  5  |  25  |
    |  20   |  15  |  35  |
	
