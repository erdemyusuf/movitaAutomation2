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
