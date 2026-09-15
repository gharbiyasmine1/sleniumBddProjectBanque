Feature: Test de login valid

  Background:
    Given acceder a lUrl  "https://parabank.parasoft.com/parabank/index.htm"
       
    @loginvalid 
  Scenario Outline: Login valid
    When entrer le username "yass"
    And entrer le password "Yass1234!"
    And click sur le boutton login 
    Then diriger a lespace client "https://parabank.parasoft.com/parabank/overview.htm"
  