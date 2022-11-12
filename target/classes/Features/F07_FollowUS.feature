 @smoke
  Feature: Follow Us
    Background:
      Given User Directs to contact us Footer

     Scenario Outline:
       #Passing Xpath for each element allocator in followus
        When User clicks follow us Item "<Elment Allocator>"
       #Passing URL as expected result for each relative URL
        Then User Direct to relevant URL "<URL>"

       Examples:
       |Elment Allocator|  URL|

       #For Facebook
       |//body[1]/div[6]/div[4]/div[1]/div[4]/div[1]/ul[1]/li[1]/a[1] |https://www.facebook.com/nopCommerce|
       #For Twitter
       |//body[1]/div[6]/div[4]/div[1]/div[4]/div[1]/ul[1]/li[2]/a[1]|https://twitter.com/nopCommerce|

       #For YouTube
        |//body[1]/div[6]/div[4]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]|https://www.youtube.com/user/nopCommerce|