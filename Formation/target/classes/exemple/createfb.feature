
@tag
Feature: créer un nouveau compte facebook
 je veux créer un nouveau compte facebook

  @tag1
  Scenario: un nouveau compte facebook
    Given ouvrir navigateurrr
    And  ouvrir url de la page facebook "https://www.facebook.com/"
    
    When cliquer sur le bouton créer un nouveau compte
    And taper le nom "sara"
    And taper le prénom "ben zineb"
    And taper adresse mail valide "sarabenzineb@gmail123456.com"
    And copier coller adresse mail pour confirmation "sarabenzineb@gmail123456.com"
    And taper le mot de passe "compte12"
    And faire entrer la valeur de la date de naissance"25"
    And faire entrer le mois de naissance "Janvier"
    And faire entrer année de naissance "1991"
    And choisir le genre 
    And cliquer sur le bouton sinscrire
    
 
    Then création dun nouveau compte facebook
  

 
   
