Feature: Discounted filter

  Scenario: As user who is not logged in check if discounted filter works on products

    Given On the main page of the online store
    When I select "Guitars" from "Musical Instruments"
    And I select "Electric Guitars - All Shapes" from "Electric Guitars"
    When I select "Discounted" from "Condition" filter
    Then I see only products that have discount label
