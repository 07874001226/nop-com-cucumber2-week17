Feature: Build Your Own Computer Purchase.

  Background:
    Given I am on homepage

  @Regression,@Smoke,@Sanity
  Scenario: Verify product arrange in alphabetical order
    Given I am on computer page
    When I click on desktopLink
    And I sort product by Z to A
    Then I should arrange product in Z to A order

  @Regression,@Sanity
  Scenario:Verify product added to shopingcart successfully
    Given I am on computer page
    When I click on desktopLink
    And I sort product by A to Z
    And I click on add to cart tab
    Then I should navigate to build your own computer page
    And I select the processor<"1">
    And I select the ram <"5">
    And I Click on hdd
    And I click on Os radio
    And I click on microsoftOffice
    And I click on totalcommender
    Then I verify total ammount
    When I click on add to cart button
    Then I should see the message the product added successfully
    And I click on green pop up button

