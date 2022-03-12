Feature: WebOrder Page Food
  Background:
    Given the user is on weborder homepage
    When the user select "Office" options
    And the user is on the groupOrderPage
    And the user sends invitees note "Test"
    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
  Scenario: Validation of Food order For Office
#   Given the user is on weborder homepage
#    When the user select "Office" options
#    And the user is on the groupOrderPage
#    And the user sends invitees note "Test"
#    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
    Then the user validates the "2012 EMPIRE BLVD" address
    * the user validates "View Group Order" text
    * the user validates total participants is 1

  Scenario: Validation of Food order For Office
#    Given the user is on weborder homepage
#    When the user select "Office" options
#    And the user is on the groupOrderPage
#    And the user sends invitees note "Test"
#    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
    And the user select "My House" options
    Then the user validates the "2112 EMPIRE BLVD" address
    * the user validates "View Group Order" text
    * the user validates total participants is 1