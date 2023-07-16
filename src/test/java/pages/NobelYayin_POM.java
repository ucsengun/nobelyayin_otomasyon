package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

import java.util.List;

public class NobelYayin_POM extends MyMethods {
    public NobelYayin_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='https://www.nobelyayin.com/insan-kaynaklari/']")
    private WebElement insanKaynaklariButonu;
    @FindBy(xpath = "//input[@value='Gönder']")
    private WebElement gonderButonu;
    @FindBy(xpath = " ")
    private WebElement basvurduguPozisyon;
    @FindBy(xpath = "//input[@name='adsoyad']")
    private WebElement adSoyad;
    @FindBy(xpath = "//input[@name='dyeri']")
    private WebElement dogumYeri;
    @FindBy(xpath = "//input[@value='E']")
    private WebElement cinsiyet;
    @FindBy(css = " ")
    private WebElement adres;
    @FindBy(css = " ")
    private WebElement telefonGsm;
    @FindBy(xpath = " ")
    private WebElement telefonSabit;
    @FindBy(xpath = " ")
    private WebElement meslek;
    @FindBy(xpath = " ")
    private WebElement dogumTarihi;
    @FindBy(xpath = " ")
    private WebElement medeniHal;
    @FindBy(id = " ")
    private WebElement ePosta;
    @FindBy(css = " ")
    private WebElement okulAdiLise;
    @FindBy(css = " ")
    private WebElement bolumLise;
    @FindBy(id = " ")
    private WebElement baslamaBitisTarihiLise;
    @FindBy(id = "passenger0_lastname")
    private WebElement okulAdiLisans;
    @FindBy (xpath = "(//span[@data-testid='bus-checkmark'])[2]")
    private WebElement bolumLisans;
    @FindBy(css = "input[name='passengers[0][passport_no]']")
    private WebElement baslamaBitisTarihiLisans;
    @FindBy(css = " ")
    private WebElement isyeriAdi;
    @FindBy(xpath = " ")
    private WebElement gorev;
    @FindBy(xpath = " ")
    private WebElement netGelir;
    @FindBy(xpath = " ")
    private WebElement girisCikisTarihi;
    @FindBy(xpath = "//span[text()='Dolu bir koltuk seçtiniz, lütfen beyaz renkle belirtlen boş koltuklardan birini seçin.']")
    private WebElement ayrilikNedeni;
    @FindBy(css = " ")
    private WebElement dil;

    @FindBy(css = ".searchBoxOld-P2GCKq3V7DvEXIgWsSCP")
    private WebElement okuma;

    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement yazma;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement konusma;

    @FindBy(css = " ")
    private WebElement programlamaDilleri;

    @FindBy(css = ".searchBoxOld-P2GCKq3V7DvEXIgWsSCP")
    private WebElement veriTabani;
    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement paketProgramlar;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement diger;

    @FindBy(css = ".searchBoxOld-P2GCKq3V7DvEXIgWsSCP")
    private WebElement varEhliyet;

    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement ehliyetSinifi;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement varSoforlukDeneyimi;

    @FindBy(css = " ")
    private WebElement yokSaglikSorunu;

    @FindBy(css = ".searchBoxOld-P2GCKq3V7DvEXIgWsSCP")
    private WebElement yokSeyahatEngeli;
    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement yaptiAskerlikDurumu;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement sigaraKullaniyorMusunuz;

    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement alkolKullaniyorMusunuz;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement hassasOldugunuzKonu;

    @FindBy(css = " ")
    private WebElement hobileriniz;

    @FindBy(css = ".searchBoxOld-P2GCKq3V7DvEXIgWsSCP")
    private WebElement ozelYeteneginiz;
    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement referansAdSoyad;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement referansMeslegi;

    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement referansAdresi;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement referansTelefonu;

    @FindBy(css = " ")
    private WebElement calismakIstediginizDepartman;

    @FindBy(css = ".searchBoxOld-P2GCKq3V7DvEXIgWsSCP")
    private WebElement talepEttiginizUcret;
    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement kendiniziNasilTanimlarsiniz;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement aciklama;
    public WebElement getInsanKaynaklariButonu() {
        return insanKaynaklariButonu;
    }

    public WebElement getGonderButonu() {
        return gonderButonu;
    }

    public WebElement getBasvurduguPozisyon() {
        return basvurduguPozisyon;
    }

    public WebElement getAdSoyad() {
        return adSoyad;
    }

    public WebElement getDogumYeri() {
        return dogumYeri;
    }


    public WebElement getCinsiyet() {
        return cinsiyet;
    }

    public WebElement getAdres() {
        return adres;
    }

    public WebElement getTelefonGsm() {
        return telefonGsm;
    }

    public WebElement getTelefonSabit() {
        return telefonSabit;
    }

    public WebElement getMeslek() {
        return meslek;
    }

    public WebElement getDogumTarihi() {
        return dogumTarihi;
    }

    public WebElement getMedeniHal() {
        return medeniHal;
    }

    public WebElement getePosta() {
        return ePosta;
    }

    public WebElement getOkulAdiLise() {
        return okulAdiLise;
    }

    public WebElement getBolumLise() {
        return bolumLise;
    }

    public WebElement getBaslamaBitisTarihiLise() {
        return baslamaBitisTarihiLise;
    }

    public WebElement getOkulAdiLisans() {
        return okulAdiLisans;
    }

    public WebElement getBolumLisans() {
        return bolumLisans;
    }

    public WebElement getBaslamaBitisTarihiLisans() {
        return baslamaBitisTarihiLisans;
    }

    public WebElement getIsyeriAdi() {
        return isyeriAdi;
    }

    public WebElement getGorev() {
        return gorev;
    }

    public WebElement getNetGelir() {
        return netGelir;
    }

    public WebElement getGirisCikisTarihi() {
        return girisCikisTarihi;
    }

    public WebElement getDil() {
        return dil;
    }

    public WebElement getOkuma() {
        return okuma;
    }

    public WebElement getYazma() {
        return yazma;
    }

    public WebElement getKonusma() {
        return konusma;
    }

    public WebElement getProgramlamaDilleri() {
        return programlamaDilleri;
    }

    public WebElement getPaketProgramlar() {
        return paketProgramlar;
    }

    public WebElement getVeriTabani() {
        return veriTabani;
    }

    public WebElement getDiger() {
        return diger;
    }

    public WebElement getVarEhliyet() {
        return varEhliyet;
    }

    public WebElement getEhliyetSinifi() {
        return ehliyetSinifi;
    }

    public WebElement getVarSoforlukDeneyimi() {
        return varSoforlukDeneyimi;
    }

    public WebElement getYokSaglikSorunu() {
        return yokSaglikSorunu;
    }

    public WebElement getYokSeyahatEngeli() {
        return yokSeyahatEngeli;
    }

    public WebElement getYaptiAskerlikDurumu() {
        return yaptiAskerlikDurumu;
    }

    public WebElement getSigaraKullaniyorMusunuz() {
        return sigaraKullaniyorMusunuz;
    }

    public WebElement getAlkolKullaniyorMusunuz() {
        return alkolKullaniyorMusunuz;
    }

    public WebElement getHassasOldugunuzKonu() {
        return hassasOldugunuzKonu;
    }

    public WebElement getHobileriniz() {
        return hobileriniz;
    }

    public WebElement getOzelYeteneginiz() {
        return ozelYeteneginiz;
    }

    public WebElement getReferansAdSoyad() {
        return referansAdSoyad;
    }

    public WebElement getReferansMeslegi() {
        return referansMeslegi;
    }

    public WebElement getReferansAdresi() {
        return referansAdresi;
    }

    public WebElement getReferansTelefonu() {
        return referansTelefonu;
    }

    public WebElement getCalismakIstediginizDepartman() {
        return calismakIstediginizDepartman;
    }

    public WebElement getTalepEttiginizUcret() {
        return talepEttiginizUcret;
    }

    public WebElement getKendiniziNasilTanimlarsiniz() {
        return kendiniziNasilTanimlarsiniz;
    }

    public WebElement getAciklama() {
        return aciklama;
    }


}
