
@tag
Feature: Authentification
en tant que administrateur je veux authentifier

  @tag1
  Scenario: Authentification valide
    Given ouvrir navigateur
    And ouvrir URL
    When SAISIR USERNAME
    And saisir mo de passe
    And cliquer sur le bouton login
    Then vérifier le nom du profil
  

  