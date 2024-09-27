Feature: Add to cart Functionality

  Background:
    Given user opens the website
    Then verify user is on website

  Scenario: verify the user can do add to cart

    When user search a product
    Then verify user on searched product
    When user add the product to the cart
    Then user verify the product is added to the cart

#    Scenario: verify user is add product to wishlist
#
#      When user click on computer and the to desktop
#      Then verify user is on desktop
#      When user click on wishlist
#      Then user verify product is on cart






