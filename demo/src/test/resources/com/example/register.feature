Feature: Register client

  Background:
    Given acceder la page dacceuil "https://parabank.parasoft.com/parabank/index.htm"
       
    @register
  Scenario Outline: register nouveau client 
    When je click sur lUrl register
    And saisir le firstname "<firstname>"
    And saisir le lastname "<lastname>"
    And saisir le address "<adress>"
    And saisir la city "<city>"
    And saisir le state "<state>"
    And saisir le zipCode "<zipCode>"
    And saisir le phone "<phone>"
    And saisir le ssn "<ssn>"
    And saisir le username "<username>"
    And saisir le password "<password>"
    And saisir le confirm "<confirm>"
    And click sur le boutton register 
    Then acceder a la page dacceuil "https://parabank.parasoft.com/parabank/register.htm"
  