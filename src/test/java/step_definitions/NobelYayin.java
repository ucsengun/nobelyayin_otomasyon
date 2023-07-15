package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.NobelYayin_POM;
import utilities.DriverClass;

public class NobelYayin {

    NobelYayin_POM ny = new NobelYayin_POM();

    private JavascriptExecutor jsExecutor;
    //private WebDriver driver;

    @Given("Nobel Yayin websitesine eriş.")
    public void nobelYayinWebsitesineEriş() {
        DriverClass.getDriver().get("https://www.nobelyayin.com/");

    }

    @When("Websayfasını aşağıya doğru kaydır.")
    public void websayfasınıAşağıyaDoğruKaydır() {
        jsExecutor = (JavascriptExecutor) DriverClass.getDriver();

        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");


    }

    @And("Ana sayfanın site haritası kısmında yer alan İnsan Kaynakları butonuna tıkla.")
    public void anaSayfanınSiteHaritasıKısmındaYerAlanButonunaTıkla() {
        ny.clickMethod(ny.getInsanKaynaklariButonu());
    }



    @And("Açılan kayıt formundaki bütün girdileri boş bırak.")
    public void açılanKayıtFormundakiBütünGirdileriBoşBırak() {
        jsExecutor = (JavascriptExecutor) DriverClass.getDriver();

        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @Then("Kayıt formunun alt kısmında yer alan Gönder butonuna tıkla.")
    public void kayıtFormununAltKısmındaYerAlanGönderButonunaTıkla() {
        ny.clickMethod(ny.getGonderButonu());
    }
}
