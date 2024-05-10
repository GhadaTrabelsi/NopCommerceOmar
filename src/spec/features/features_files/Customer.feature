@customer 
Feature: Je souhaite tester le module Customer

  Background: 
    Given Je me connect a l application nopcommerce 
    And Je m acceder a l espace customer

  @AddCustomer
  Scenario: Je souhaite ajouter un client
    And Je clique sur le botton add new
    And Je saisie l email
    And Je saisie le password
    And Je select le role
    And Je clique sur le buton save
    Then un message  d ajout s affiche

  @searshExistedCustomer
  Scenario: Je souhaite chercher un customer
    When Je saisie l email a chercher 
    And Je clique sur le boutton searsh
    Then le costomer s affiche dans le tableu

  @searshNotExistedCustomer
  Scenario: Je sohaite verifier si customer n existe pas
    When Je saisie un email non existant
    And Je clique sur le boutton searsh
    Then un tableau s affiche vide

  @editCustomer
  Scenario: Je souahait modifer les informations d un costomer
    When Je saisie l email
    And Je clique sur le boutton searsh
    And Je clique sur le boutton edit
    And Je modifer les informations souhaiter
    And Je clique sur le boutton save
    Then un message de mise a jour sera afiicher

  @DeleteCustomer
  Scenario: Je souhaite chercher un customer
    When Je saisie l email
    And Je clique sur le boutton searsh
    And Je clique sur le boutton edit
    And Je clique sur le boutton delete
    And Je clique sur alert delete
    Then un message delete customer s affiche
