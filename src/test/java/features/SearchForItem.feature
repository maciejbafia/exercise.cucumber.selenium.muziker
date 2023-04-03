Feature: Search form

  Scenario: As user who is not logged in i can find item that is listed in app

    Given I am not logged in, on the main page of the online store
    When I type in search form name of an item that i want to find
    Then I verify that i found what i was looking for