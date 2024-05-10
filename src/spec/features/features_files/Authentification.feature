
@authentification
Feature: Je souhaite tester la page connexion de l aplication nopcommerce
 

  @authentificationValide
  Scenario:  Je souhaite tester la page connexion avec un cas passant
    Given Je me connect a l application nopcommerce 
    Then Je me rediriger vers le dashbord
    
  @authentificationInValide
   Scenario: Je souhaite tester la page connexion avec un cas non passant 
   Given Je me connect a l application nopcommerce avec  incorrect coordoner
   Then un message d erreur s affiche 
    
 

