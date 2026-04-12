Feature: search and place the order for product

@OfferPage
Scenario Outline: Search exeperience for product search in both home and offers page
  Given User is on Greencart Landing page
  When user searched with shortname <name> and extracted actual name of product
  Then user searched for <name> shortname in offer page 
  And Validate product name matches with offer page with landing page
  Examples:
|name|
|tom|
|stra|




