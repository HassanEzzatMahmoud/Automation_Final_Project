@smoke
  Feature: Hover on element
    Scenario:User Hovers on product list to view sublist
      When User hovers on "Apparel" item, and clicks subitem "Clothing"
      Then ActualResult equals Expected "clothing"


