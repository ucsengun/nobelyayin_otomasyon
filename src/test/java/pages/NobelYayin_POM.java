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
    @FindBy(xpath = "")
    private WebElement basvurduguPozisyon;
    @FindBy(xpath = "//input[@name='adsoyad']")
    private WebElement adSoyad;
    @FindBy(xpath = "//input[@name='dyeri']")
    private WebElement dogumYeri;
    @FindBy(xpath = "//input[@value='E']")
    private WebElement cinsiyet;
    @FindBy(css = "")
    private WebElement adres;
    @FindBy(css = "td[aria-label='Pazartesi, 10 Temmuz 2023']")
    private WebElement getDepartureDate;
    @FindBy(xpath = "(//strong[text()='Otobüs bileti bul'])[1]")
    private WebElement continueButton;
    @FindBy(xpath = "//img[contains(@alt,'Pamukkale')]")
    private List<WebElement> pamukkaleCompany;
    @FindBy(xpath = "//div[contains(@class,'hover-active')]")
    private List<WebElement> firstAvailableSeat;
    @FindBy(xpath = "//span[text()='Erkek']")
    private WebElement genderButtonForMale;
    @FindBy(id = "accept_and_continue")
    private WebElement acceptAndContinueButton;
    @FindBy(css = "input[name='contact_email']")
    private WebElement emailAddressBeforePayment;
    @FindBy(css = "input[name='contact_phone_number']")
    private WebElement phoneNumberBeforePayment;
    @FindBy(id = "passenger0_firstname")
    private WebElement passengerName;
    @FindBy(id = "passenger0_lastname")
    private WebElement passengerLastname;
    @FindBy (xpath = "(//span[@data-testid='bus-checkmark'])[2]")
    private WebElement nonCitizenCheckbox;
    @FindBy(css = "input[name='passengers[0][passport_no]']")
    private WebElement passportNumber;
    @FindBy(css = "select[name='passengers[0][passport_country_code]']")
    private WebElement countryCodeSelectionButton;
    @FindBy(xpath = "//span[text()='Ödemeye İlerle']")
    private WebElement continueToPaymentButton;
    @FindBy(xpath = "//div[text()='Ödeme yap']")
    private WebElement payButton;
    @FindBy(xpath = "//div[contains(@class,'sold')]")
    private WebElement bookedSeat;
    @FindBy(xpath = "//span[text()='Dolu bir koltuk seçtiniz, lütfen beyaz renkle belirtlen boş koltuklardan birini seçin.']")
    private WebElement warningMessage;
    @FindBy(css = ".navbar-nav.hidden-sm-down>a")
    private List<WebElement> navbarLinkList;

    @FindBy(css = ".searchBoxOld-P2GCKq3V7DvEXIgWsSCP")
    private WebElement urunArama;

    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement cerezlerikabulet;

    @FindBy(xpath = "//a[text()='Kampanyalar']")
    private WebElement kampanyalar;


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

    public WebElement getPassengerName() {
        return passengerName;
    }

    public WebElement getPassengerLastname() {
        return passengerLastname;
    }

    public WebElement getNonCitizenCheckbox() {
        return nonCitizenCheckbox;
    }

    public WebElement getPassportNumber() {
        return passportNumber;
    }

    public WebElement getCountryCodeSelectionButton() {
        return countryCodeSelectionButton;
    }

    public WebElement getContinueToPaymentButton() {
        return continueToPaymentButton;
    }

    public WebElement getPayButton() {
        return payButton;
    }

    public WebElement getOrigin() {
        return origin;
    }

    public WebElement getDestination() {
        return destination;
    }

    public WebElement getDepartureDateButton() {
        return departureDateButton;
    }

    public WebElement getGetDepartureDate() {
        return getDepartureDate;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public List<WebElement> getPamukkaleCompany() {
        return pamukkaleCompany;
    }

    public List<WebElement> getFirstAvailableSeat() {
        return firstAvailableSeat;
    }

    public WebElement getGenderButtonForMale() {
        return genderButtonForMale;
    }

    public WebElement getAcceptAndContinueButton() {
        return acceptAndContinueButton;
    }







}
