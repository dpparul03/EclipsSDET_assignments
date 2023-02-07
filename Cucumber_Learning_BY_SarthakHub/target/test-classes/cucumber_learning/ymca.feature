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
@BoookingYMCAGym
Feature: I want to use YMCA Gym Daily
  

  @LookingForAnYMCAGym
  Scenario: Looking for YMCA Gym at my place
    Given I am interested in learning YMCA
    And I went online to find diffrent YMCA
    And I shortlisted 4 YMCA Gym near my place
    When I enquired about one Gym closet to my place they ask me to come and have look
    And I deceided to vissit them
    When I went to vissit the Gymn on 30 Sep
    And I decided to book membership
    But I decided to keep a trainner
    Then I bargained and recveived a discount
    
 