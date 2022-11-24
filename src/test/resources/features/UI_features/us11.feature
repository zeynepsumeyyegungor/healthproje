@US11
  Feature: My Appointments doktor tarafindan düzenlenebilmeli.

    Background: Ortak Adimlar
      Given Kullanici medunna sayfasina gider US04
      Then kullanci sign in butonuno tiklar  US04
      Then Kullanici gecerli username "sumeyyeDoktor" girer. US11
      Then Kullanici gecerli password "sumeyyeDoktor3520." girer. US11
      Then Sign in butonuna tiklar. US11
      Then My Appointments butonuna tiklar. US11

  @US11_TC01
    Scenario: Doktor edit islemi yapar.
    Then Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11
    Then Save butonuna tiklar. US11






