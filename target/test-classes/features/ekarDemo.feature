Feature: ekar Demo
  Scenario: As a user, I should be able to locate my location via pin drop
    Given Launch Ekar Demo Apps
    Then I check Pin location is visible
    Then I check My location is correct

  Scenario: As a user, I should upload four images to the app after clicking on the pin drop and I should not be able to proceed to the next step until I have uploaded four images
    Given Launch Ekar Demo Apps
    When I click on Pin Drop
    And I scroll to the Comment box
    And I enter a text in Comment box
    And I click on Next button
    Then I verify "Please choose front Image" message is disabled
    And I click Frontside
    And I click on select a Image from galery
    And I click on Pictures tab
    And I select a Image from gallery
    And I click on Next button
    Then I verify "Please choose back Image" message is disabled
    And I click Backside
    And I click on select a Image from galery
    And I click on Pictures tab
    And I select a Image from gallery
    And I click on Next button
    Then I verify "Please choose left Image" message is disabled
    And I click Leftside
    And I click on select a Image from galery
    And I click on Pictures tab
    And I select a Image from gallery
    And I click on Next button
    Then I verify "Please choose right Image" message is disabled
    And I click Rightside
    And I click on select a Image from galery
    And I click on Pictures tab
    And I select a Image from gallery
    And I click on Next button
    Then I verify "Complaint Accepted" message is disabled
    Then I check Pin location is visible
