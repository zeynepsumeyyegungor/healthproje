Feature: US01 Registration islemleri

  Background: Ortak adimlar
    Given Kullanici Medunna sayfasina gider
    Then Kullanici user icon simgesine tiklar
    And Kullanici register butonuna tiklar
    And Kullanici Registration sayfasinin acildigini dogrular

  @US1-TC1
  Scenario: TC01 Kullanici gecerli SSN sartini sagladiginda uyari almamali

    And Kullanici registration formunu doldurur ve register submit butonuna tiklar
    And Kullanici Registration saved yazisinin gorundugunu dogrular
    And Kullanici sayfayi kapatir

  @US1-TC2
  Scenario: TC02 Kullanici gecersiz SSN girdiginde uyari almali

    And Kullanici SSN kismina gecersiz bir SSN girer
    And Kullanici gecersiz SSN girdiginde "Your SSN is invalid" uyarisi aldigini dogrular
    And Kullanici sayfayi kapatir

  @US1-TC3
  Scenario: TC03 Kullanici SSN girmediginde uyari almali

    And Kullanici SSN kismini bos birakir
    And Kullanici SSN alanini bos biraktiginda "Your SSN is required" uyarisi aldigini dogrular
    And Kullanici sayfayi kapatir

  @US1-TC4
  Scenario: TC04 Kullanici First Name alanini bos biraktiginda uyari almali
    And Kullanici First Name alanini bos birakir
    And Kullanici "Your FirstName is required." uyarisi aldigini dogrular.
    And Kullanici sayfayi kapatir

  @US1-TC5
  Scenario: TC05 Kullanici Last Name alanini bos biraktiginda uyari almali
    And Kullanici Last Name alanini bos birakir
    And Kullanici last name alanini bos biraktiginda "Your LastName is required." uyarisi aldigini dogrular.
    And Kullanici sayfayi kapatir









