Feature: Access to facebook page
  Scenario: To Verify 'forgot account link' allows user to reset password
    Given I am a facebook user
    When I access Facebook URL
    And I click on 'forgot account link'
    Then I see 'forgot account' page

  Scenario: To Verify'create a page' link allows user to create a page
    Given I am a facebook user
    When I access Facebook URL
    When I click on the link 'create page'
    Then I am taken to a page to create new page