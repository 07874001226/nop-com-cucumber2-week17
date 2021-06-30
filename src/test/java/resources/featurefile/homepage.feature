Feature: Home page Test
  As a user I want to  into nop commerce website


  @Regression,@Smoke,@Sanity

  Scenario: Verify user should navigate to computer page successfully
    Given I am on homepage
    When  I click on computer
    Then I should navigate to computer page successfully

  @Sanity,@Regression
  Scenario: Verify user should navigate to electronics page successfully
    Given I am on homepage
    When  I click on electronics
    Then I should navigate to electronics page successfully

  @Regression
  Scenario: Verify user should navigate to apparel page successfully
    Given I am on homepage
    When  I click on apparel
    Then I should navigate to apparel page successfully

  @Regression
  Scenario: Verify user should navigate to digital downloads page successfully
    Given I am on homepage
    When  I click on digital downloads
    Then I should navigate to digital downloads page successfully

  @Regression
  Scenario: Verify user should navigate to books page successfully
    Given I am on homepage
    When  I click on books
    Then I should navigate to books page successfully

  @Regression
  Scenario: Verify user should navigate to jewelry page successfully
    Given I am on homepage
    When  I click on jewelry
    Then I should navigate to jewelry page successfully

  @Regression
  Scenario: Verify user should navigate to giftcards page successfully
    Given I am on homepage
    When  I click on giftcards
    Then I should navigate to giftcards page successfully



