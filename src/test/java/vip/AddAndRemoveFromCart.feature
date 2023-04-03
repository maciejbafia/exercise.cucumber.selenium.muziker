Feature: Adding and removing items from cart

  Scenario: As user who is not logged in add items to cart then remove them

    Given As not logged user on the main page of the online store
    When I type in search form name of an item that i want to add
    And I find that item and click on it
    Then I verify that the cart contains the added product
    And I click on the cart and go to the cart page
    And I remove the product from the cart
    Then I verify that the cart is empty
