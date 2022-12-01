
Feature: email ve ssn doğrulama
@US001
  Scenario Outline: kayıtlı kişiler oluşturma

    Given kullanıcıhtc connection kurar
    Then kullanıcıhtc kayıtlı kişileri oluşturur "<query>" ve "<columnname>"
    And kullanıcı bilgilerini doğrular

    Examples: test verileri
      | query         |  | ColumnName |
      | SELECT * FROM |  |SSN|
