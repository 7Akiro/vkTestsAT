Feature: Authorization form
  Scenario: Valid authorization
    Given open start page vk.com
    When set phone number and password, and press log in
    Then page Home is open!

