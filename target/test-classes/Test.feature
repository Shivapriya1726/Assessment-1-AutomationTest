Feature: Login, Add Product to Cart, and Checkout on SauceDemo

  Scenario: Successful login, add product to cart, and checkout
    Given User is on the SauceDemo login page
    When User enters valid username and password and login
    And User adds a product to the cart
    Then User proceeds to checkout
    Then user logout


