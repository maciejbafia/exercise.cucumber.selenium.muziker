Feature: Adding and removing items from cart

  Scenario: As user who is not logged in add items to cart then remove them

    Given I am not logged in, on the main page of the online store
    When I select "Guitars" from "Musical Instruments"
    And I select "Electric Guitars - All Shapes" from "Electric Guitars"
    And I add the product to the cart
    Then I verify that the cart contains the added product
    And I click on the cart and go to the cart page
    And I remove the product from the cart
    Then I verify that the cart is empty
    And I close the application
