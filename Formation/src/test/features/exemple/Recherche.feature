
@tag
Feature: Recherche Google
  je veux rechercher via google

  @tag1
  Scenario: Recherche Pays
    Given ouvrir nnavigateur
    And ouvrir URL de Google "https://www.google.com/"
    When Saisir le mot "Tunisie"
    And cliquer sur Entrée
    
    Then vérifier le résultat "résultat"


