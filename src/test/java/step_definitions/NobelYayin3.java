package step_definitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;
import pages.NobelYayin_POM;

public class NobelYayin3 {

    NobelYayin_POM ny = new NobelYayin_POM();

    @And("Açılan kayıt formundaki bütün girdileri yazarken geçersiz ad ile doldur.")
    public void açılanKayıtFormundakiBütünGirdileriYazarkenGeçersizAdIleDoldur() {
        Select select = new Select(ny.getBasvurduguPozisyon());
        select.selectByVisibleText("Redaktör");
        ny.getAdSoyad().sendKeys(" ..?-!*  Smith");
        ny.getDogumYeri().sendKeys("Los Angeles");
        ny.clickMethod(ny.getCinsiyet());
        ny.getAdres().sendKeys("456 Oak Street, Los Angeles");
        ny.getTelefonGsm().sendKeys("555-9876");
        ny.getTelefonSabit().sendKeys("333-4545");
        ny.getMeslek().sendKeys("Öğretmen");
        ny.getDogumTarihi().sendKeys("05/10/1985");
        ny.clickMethod(ny.getMedeniHal());
        ny.getePosta().sendKeys("janesmith@example.com");
        ny.getOkulAdiLise().sendKeys("Liberteryen Lisesi");
        ny.getBolumLise().sendKeys("Anadolu");
        ny.getBaslamaBitisTarihiLise().sendKeys("2006-2010");
        ny.getOkulAdiLisans().sendKeys("ABC Universitesi");
        ny.getBolumLisans().sendKeys("İşletme");
        ny.getBaslamaBitisTarihiLisans().sendKeys("2010-2014");
        ny.getIsyeriAdi().sendKeys("XYZ Şirketi");
        ny.getGorev().sendKeys("Proje Yöneticisi");
        ny.getNetGelir().sendKeys("5000");
        ny.getGirisCikisTarihi().sendKeys("01/01/2015 - 01/01/2020");
        ny.getAyrilikNedeni().sendKeys("Kariyer Değişikliği");
        ny.getDil().sendKeys("İngilizce");
        ny.clickMethod(ny.getOkuma());
        ny.clickMethod(ny.getYazma());
        ny.clickMethod(ny.getKonusma());
        ny.getProgramlamaDilleri().sendKeys("Python, Java");
        ny.getPaketProgramlar().sendKeys("Microsoft Office");
        ny.getVeriTabani().sendKeys("SQL");
        ny.getDiger().sendKeys("ClickUp");
        ny.clickMethod(ny.getVarEhliyet());
        ny.getEhliyetSinifi().sendKeys("B");
        ny.clickMethod(ny.getVarSoforlukDeneyimi());
        ny.clickMethod(ny.getYokSaglikSorunu());
        ny.clickMethod(ny.getYokSeyahatEngeli());
        ny.clickMethod(ny.getYaptiAskerlikDurumu());
        ny.getSigaraKullaniyorMusunuz().sendKeys("Hayır");
        ny.getAlkolKullaniyorMusunuz().sendKeys("Hayır");
        ny.getHassasOldugunuzKonu().sendKeys("Hayır");
        ny.getHobileriniz().sendKeys("Yüzme, Kitap Okuma");
        ny.getOzelYeteneginiz().sendKeys("Piyano Çalmak");
        ny.getReferansAdSoyad().sendKeys("David Johnson");
        ny.getReferansMeslegi().sendKeys("İşveren");
        ny.getReferansAdresi().sendKeys("789 Maple Avenue, Los Angeles");
        ny.getReferansTelefonu().sendKeys("555-2468");
        ny.getCalismakIstediginizDepartman().sendKeys("Herhangi bir departman, Pazarlık yapılabilir");
        ny.getTalepEttiginizUcret().sendKeys("7000 TL");
        ny.getKendiniziNasilTanimlarsiniz().sendKeys("Motivasyonlu, takım oyuncusu, problem çözme becerilerine sahip");
        ny.getAciklama().sendKeys("Sizinle çalışmayı dört gözle bekliyorum.");


    }
}
