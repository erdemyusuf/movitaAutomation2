@SmokeTest
  Feature: MQA-92 Smoke Test Personel İşlemleri

    Scenario: Personel islemleri ve alt bilesenleri
      Given  Kullanıcı "Movita" Anasayfasına gider
      When  Anasayfada "Giriş Yap" butonuna tıklar
      Then  Kullanıcı,hesabına geçerli kullanici adı ve şifre ile giriş yapar
      Then kullanici personel islemlerine tiklar
      Then kullanici personele tiklar
      Then personel listesi sayfasi olmali
      Then Is atama tiklanir
      Then Is atama sayfası olmali
      Then Servis islemleri tiklanir
      Then Servis Islemleri sayfasi olmali
      Then Birim Listesi tiklanir
      Then Birim Listesi sayfasi olmali
      Then Personel Anket tiklanir
      Then Personel Anket sayfasi olmali
      Then Personel Sikayet Talep tiklanir
      Then Personel Sikayet Talep sayfasi olmali