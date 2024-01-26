@zenarmor
Feature: Reports
  Background:

    Given user goes to login page
    When user enters his her email
    And user enters his her password
    And user clicks on continue button
    And User clicks on Firewall menu
    And User clicks on My Firewalls

    @TC01
    Scenario: User creates a report
      When User clicks on Report menu
      And User clicks on Filter menu
      And User enables Hide local connections
      And User selects Application Category from Filter dropdown menu
      And User selects Equal from menu
      And User selects Email from menu
      And User clicks on Add button
      And User picks up Volume
      And User selects Last Thirty minutes
      And User selects Top Five
      And User clicks on Reset All Filters
      And User clicks on Download button
      And User selects PDF
      And User closes the browser

    @TC02
    Scenario: User creates a scheduled report
      When User clicks on Settings menu
      And User clicks On Scheduled Reports
      And User clicks On Disabled button
      Then Verfiy Scheduled Reports are enabled
      When User selects Zenconsole from Mail Provider
      #And User enters owner information
      And User enters admin information
      And User selects Volume from Reporting Criteria
      And User selects time from Schedule
      And User selects Friday from Schedule
      And User clicks on Test Connection and Send Email button
      Then User verifies the successfully connected message
      When User clicks Save Button
      And User clicks Continue button
      Then User verifies the successfully saved message
      And User closes the browser

    @TC03
    Scenario: User creates a policy
      When User clicks On Policies menu
      And User clicks on Create New Policy button
      And User enters a policy name
      And User clicks on policy created
      And User enters an IPV4 address
      And User types a description in the box
      And User adds a mac address
      And User adds a time schedule
      And User refreshes the page
      And User closes the browser

    @TC04
    Scenario: User verifies the threats
      When User clicks on Home menu
      And User clicks on Engine
      And User clicks on Restart button
      And User clicks on the number after the detected word
      And User verifies the size of the list
      And User closes the browser


















