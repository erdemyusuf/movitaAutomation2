Feature:  Smoke Test Raporlar

  Scenario: Raperlar Filter
    Given user navigates to login page
    When user logins the page
    And click on Raporlar
    And click on Araç Bazlı Rapor
    Then click  on Rapor al

    When click Yakıt Entegrasyonu Raporu
    And tarih gir
    Then click  on Yakıt Entegrasyon Raporu Al

  When click günlük seyahat raporu
  Then click  on Rapor al

    When click aktivite detay raporu
    And arac sec
    Then click  on Rapor al

    When click arac Karne
    And arac sec
    Then click  on Rapor al

    When click filo bazlı raporu
    Then click  on Rapor al


    When click grup bazlı raporu
    Then click  on Rapor al
    When click alarm log raporu
    Then click  sorgula

    When click sofor log raporu
    Then click  on Rapor al








