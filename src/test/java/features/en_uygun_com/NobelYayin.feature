Feature: Nobel Yayin Feature
#  Scenario: Login
#    Given Nobel Yayin login
  Scenario:
    Given Nobel Yayin websitesine eriş.
    When Websayfasını aşağıya doğru kaydır.
    And Ana sayfanın site haritası kısmında yer alan İnsan Kaynakları butonuna tıkla.
    And Açılan kayıt formundaki bütün girdileri boş bırak.
    Then Kayıt formunun alt kısmında yer alan Gönder butonuna tıkla.

#  "https://www.nobelyayin.com/" websitesine eriş.
#  Websayfasını aşağıya doğru kaydır.
#  Ana sayfanın site haritası kısmında yer alan "İnsan Kaynakları" butonuna tıkla.
#  Açılan sayfanın nobel yayın websitesinin İnsan Kaynakları sayfasıyla ilgili sayfasının yüklendiğini kontrol et.
#  Açılan kayıt formundaki bütün girdileri test verilerine göre doldur.
#  Kayıt formunun alt kısmında yer alan 'Gönder' butonuna tıkla.
