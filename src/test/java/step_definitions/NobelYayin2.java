package step_definitions;

import io.cucumber.java.en.And;
import pages.NobelYayin_POM;

public class NobelYayin2 {

    NobelYayin_POM ny = new NobelYayin_POM();
    @And("Açılan kayıt formundaki bütün girdileri uygun bir şekilde doldur.")
    public void açılanKayıtFormundakiBütünGirdileriUygunBirŞekildeDoldur() {
        ny.clickMethod(ny.getBasvurduguPozisyon());
        ny.getAdSoyad().sendKeys("abcde");
        ny.getDogumYeri().sendKeys("");
        ny.clickMethod(ny.getCinsiyet());
        ny.getAdres().sendKeys("");
        ny.getTelefonGsm().sendKeys("");
        ny.getTelefonSabit().sendKeys("");
        ny.getMeslek().sendKeys("");
        ny.getDogumTarihi().sendKeys("");
        ny.clickMethod(ny.getMedeniHal());
        ny.getePosta().sendKeys("");
        ny.getOkulAdiLise().sendKeys();
        ny.getBolumLise().sendKeys("");
        ny.getBaslamaBitisTarihiLise().sendKeys("");
        ny.getOkulAdiLisans().sendKeys("");
        ny.getBolumLisans().sendKeys("");
        ny.getBaslamaBitisTarihiLisans().sendKeys("");
        ny.getIsyeriAdi().sendKeys("");
        ny.getGorev().sendKeys("");
        ny.getNetGelir().sendKeys("");
        ny.getGirisCikisTarihi().sendKeys("");
        ny.getDil().sendKeys("");
        ny.getOkuma().sendKeys("");
        ny.getYazma().sendKeys("");
        ny.getKonusma().sendKeys("");
        ny.getProgramlamaDilleri().sendKeys("");
        ny.getPaketProgramlar().sendKeys("");
        ny.getVeriTabani().sendKeys("");
        ny.getDiger().sendKeys("");
        ny.clickMethod(ny.getVarEhliyet());
        ny.getEhliyetSinifi().sendKeys("");
        ny.clickMethod(ny.getVarSoforlukDeneyimi());
        ny.clickMethod(ny.getYokSaglikSorunu());
        ny.clickMethod(ny.getYokSeyahatEngeli());
        ny.clickMethod(ny.getYaptiAskerlikDurumu());
        ny.getSigaraKullaniyorMusunuz().sendKeys("");
        ny.getAlkolKullaniyorMusunuz().sendKeys("");
        ny.getHassasOldugunuzKonu().sendKeys("");
        ny.getHobileriniz().sendKeys("");
        ny.getOzelYeteneginiz().sendKeys("");
        ny.getReferansAdSoyad().sendKeys("");
        ny.getReferansMeslegi().sendKeys("");
        ny.getReferansAdresi().sendKeys("");
        ny.getReferansTelefonu().sendKeys("");
        ny.getCalismakIstediginizDepartman().sendKeys("");
        ny.getTalepEttiginizUcret().sendKeys("");
        ny.getKendiniziNasilTanimlarsiniz().sendKeys("");
        ny.getAciklama().sendKeys("");


    }
}
