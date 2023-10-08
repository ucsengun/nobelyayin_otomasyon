## Test Senaryoları

## Bu projede, "İnsan Kaynakları" sayfasının kayıt formuyla ilgili bazı hata senaryolarının test edilmesi için aşağıdaki test senaryoları kullanılmıştır:

### Test Senaryosu: İnsan Kaynakları Sayfası Kayıt Formu Boş Bırakma Hata

## Bu senaryo, "İnsan Kaynakları" sayfasındaki kayıt formunun boş bırakılarak gönderilmesini doğrulamayı amaçlar. Formun boş bırakıldığında bir hata mesajı beklenir.

### Test Senaryosu: İnsan Kaynakları Kayıt Formu Tamamen Doldurulduğunda Başarılı Kaydın Doğrulaması

## Bu test senaryosunda, İnsan Kaynakları sayfasındaki kayıt formunun tüm gerekli alanları doğru bir şekilde doldurulduğunda başarılı bir şekilde kaydedildiğinin doğrulanması amaçlanmaktadır.

### Test Senaryosu: İnsan Kaynakları Sayfası Kayıt Formu Geçersiz Ad Hata

## Bu senaryoda, "İnsan Kaynakları" sayfasındaki kayıt formuna geçersiz bir ad girilerek hata mesajının doğrulanması hedeflenir.

### Test Senaryosu: İnsan Kaynakları Sayfası Kayıt Formu Geçersiz Doğum Yeri Hata

## Bu senaryoda, "İnsan Kaynakları" sayfasındaki kayıt formuna geçersiz bir doğum yeri girilerek hata mesajının doğrulanması amaçlanmaktadır.

### Test Senaryosu: İnsan Kaynakları Sayfası Kayıt Formu Geçersiz Telefon Numarası Hata

## Bu senaryoda, "İnsan Kaynakları" sayfasındaki kayıt formuna geçersiz bir telefon numarası girilerek hata mesajının doğrulanması hedeflenir.

### Test Senaryosu: İnsan Kaynakları Sayfası Kayıt Formu Geçersiz Doğum Tarihi Hata

## Bu senaryoda, "İnsan Kaynakları" sayfasındaki kayıt formuna geçersiz bir doğum tarihi girilerek hata mesajının doğrulanması hedeflenir.

## Her bir test senaryosu, belirli bir hatayı doğrulamak için oluşturulmuştur. Detaylı adımlar ve beklenen sonuçlar her bir senaryo için ayrı ayrı belirtilmiştir. Bu test senaryoları, formun doğru çalışmasını sağlamak ve kullanıcı deneyimini geliştirmek için kullanılmaktadır.






# Proje Yapısı

src: Bu, testle ilgili kod ve kaynakların depolandığı kaynak dizinidir.

test: Bu dizin, testle ilgili tüm kod ve kaynakları içerir.

java: Test sınıfları ve yardımcı sınıflar için Java kaynak kodu dizinidir.

feature: Bu dizin, insanlar tarafından okunabilir bir biçimde test senaryolarını tanımladığınız Gherkin özellik dosyalarını içerir.

pages: Sayfa Nesnesi sınıfları burada saklanır. Her sınıf bir web sayfasını temsil eder ve o sayfadaki öğelerle etkileşimde bulunmak için yöntemler içerir.

runners: Test koşucuları burada saklanır. Bu sınıflar Cucumber testlerini yapılandırır ve çalıştırır.

step_definitions: Adım tanımlama sınıfları buraya yerleştirilir. Bu sınıflar, özellik dosyalarında tanımlanan adımları uygulamak için gerçek kodu içerir.

utilities: WebDriver yönetimi ve yapılandırma okuma gibi çeşitli test görevlerine yardımcı olan yardımcı sınıflar burada saklanır.

xml_files: Testlerde kullanılan XML dosyaları varsa buraya yerleştirilebilir.

resources: Bu dizin, testler için gerekli olmayan Java olmayan kaynakları içerir, örneğin TestNG yapılandırma dosyaları (testng.xml), test veri dosyaları (TestData.xlsx) ve daha fazlası.

reports: Bu dizin, test çerçevesi veya araçları tarafından oluşturulan test raporlarını saklamak için kullanılır.

drivers: Tarayıcı otomasyonu için gereken web tarayıcı sürücüsü yürütülebilir dosyalarını (örneğin, chromedriver, geckodriver) içerir.

pom.xml: Bu, bağımlılıkları ve diğer proje ayarlarını belirten Maven projesi yapılandırma dosyasıdır.

README.md: Proje hakkında bilgi veren ve kullanım talimatları sağlayan bir belge dosyasıdır.
