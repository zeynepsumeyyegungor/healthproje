@US27
Feature: Admin mesaj kismini goruntuler,editler.

  Background: Ortak adimlar
    Given Kullanici medunna sayfasina gider.zsg
    Then Kisi ikonuna tiklar.
    Then Sign in butonuna tiklar.
    Then Admin username bilgilerini girer.
    Then Admin password bilgilerini girer.
    Then Sign in butonuna tiklar.
    Then Items&Titles butonuna tiklar.
    Then Messages butonuna tiklar.
    Then Create a new message box'a tiklar.
