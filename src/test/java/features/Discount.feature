Feature: Discount btn from main page

  Scenario: As user who is not logged checking if every item i discount page has a discount

    Given While on the main page of the online store
    When I select "Discounts" from main page
    Then I see only products that have discount label
