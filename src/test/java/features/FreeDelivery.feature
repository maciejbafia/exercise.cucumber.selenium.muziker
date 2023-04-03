Feature: Free delivery after adding to cart

  Scenario: As user who is not logged in check if free delivery works after adding to cart

    Given As not logged in, on the main page of the online store
    When I type in name of an item that i want to add
    And I find that item and click on it
    Then I verify that the cart contains the added product and price is enough for free delivery
    And I click continue to cart
    Then I verify if Shipping is free


