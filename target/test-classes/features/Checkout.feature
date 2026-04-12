Feature: Checkout functionality
@CheckoutPage
Scenario Outline: user exeperience in add product and check in checkout page
  Given User is on Greencart Landing page
  When user searched with shortname <name> and extracted actual name of product
  And Added "3" items of the selected prduct to cart
  Then user proceed to checkout and validate the <name> items in cart page
  And verify user has ability enter promo code and place the order
  Examples:
|name|
|Brocolli - 1 Kg|
