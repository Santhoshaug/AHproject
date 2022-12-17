Feature: MyAccount-Login Feature

  Scenario Outline: Log-in with valid username and password
  Given Open the browser
  When Enter the URL "https://address-health-revamp-git-dev-v2-zysktech.vercel.app/"
  And I enter Username as "<username>" and Password as "<password>"
  And Click on login button
  Then User must successfully login to the web page
  
  Examples:
  | username  | password  | 
  | 7019290364 | test1234 | 
  | 7019290364 | test123 |
