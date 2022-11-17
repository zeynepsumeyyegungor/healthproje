Feature: US01 Registration islemleri
  @US1-TC1
  Scenario: TC01 Kullanici gecerli SSN sartini sagladiginda uyari almamali
    Given Kullanici Medunna sayfasina gider
    Then Kullanici user icon simgesine tiklar
    And Kullanici register butonuna tiklar
    And Kullanici registration formunu doldurur ve register submit butonuna tiklar
    And Kullanici Registration saved yazisinin gorundugunu dogrular
    And Kullanici sayfayi kapatir


