package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Us07StepDefinitions {

    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    @Given("Kullanici Medunna sayfasina gider AG.")
    public void kullaniciMedunnaSayfasinaGiderAG() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanici anasayfada user ikonuna tiklar AG.")
    public void kullaniciAnasayfadaUserIkonunaTiklarAG() {
        medunnaPage.agUserIconu.click();
    }

    @Then("Kullanici Sign In giris butonuna tiklar AG.")
    public void kullaniciSignInGirisButonunaTiklarAG() {
        medunnaPage.agIlkSignIn.click();
    }

    @Then("Kullanici Username textboxina kullanici ismini girer AG.")
    public void kullaniciUsernameTextboxinaKullaniciIsminiGirerAG() {
        medunnaPage.agUsername.sendKeys("CeydaGrbz");
    }

    @Then("Kullanici Password textboxina sifresini girer AG.")
    public void kullaniciPasswordTextboxinaSifresiniGirerAG() {
        medunnaPage.agPassword.sendKeys("2775724a");
    }

    @Then("Kullanici SignIn butonuna tiklar AG.")
    public void kullaniciSignInButonunaTiklarAG() {
        medunnaPage.agSignInButton.click();
    }

    @Then("Kullanici MY PAGES\\(PATIENT) butonuna tiklar AG.")
    public void kullaniciMYPAGESPATIENTButonunaTiklarAG() {
        medunnaPage.agMyPagesButton.click();
    }

    @Then("Kullanici acilan dropdown da Make an Appointment butonuna tiklar AG.")
    public void kullaniciAcilanDropdownDaMakeAnAppointmentButonunaTiklarAG() {
        medunnaPage.agMakeAppointmentDropDown.click();
    }

    @Then("Kullanici Phone textboxina telefon numarasini girer AG.")
    public void kullaniciPhoneTextboxinaTelefonNumarasiniGirerAG() {
        medunnaPage.agPhone.sendKeys("541-617-7171");
    }

    @Then("Kullanici Appointment Date Time textboxina guncel tarihi girer AG.")
    public void kullaniciAppointmentDateTimeTextboxinaGuncelTarihiGirerAG() {
        medunnaPage.agDateBox.clear();
        medunnaPage.agDateBox.sendKeys("25/11/2022");
    }
    @Then("Kullanici Send an Appointment Request butonuna tiklar AG.")
    public void kullaniciSendAnAppointmentRequestButonunaTiklarAG() {
        medunnaPage.agSendAnAppointmentRequest.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici Appointment Registiration Saved! yazisini gorur AG.")
    public void kullaniciAppointmentRegistirationSavedYazisiniGorurAG() {
        medunnaPage.agBasariliYazisi.isDisplayed();
    }

    @Then("Kullanici Appointment Date Time textboxina ileri bir tarih girer AG.")
    public void kullaniciAppointmentDateTimeTextboxinaIleriBirTarihGirerAG() {
        medunnaPage.agDateBox.clear();
        medunnaPage.agDateBox.sendKeys("30/11/2022");
    }
    @Then("Kullanici Appointment Date Time textboxina gecmis bir tarih girer AG.")
    public void kullaniciAppointmentDateTimeTextboxinaGecmisBirTarihGirerAG() {
        medunnaPage.agDateBox.clear();
        medunnaPage.agDateBox.sendKeys("10/11/2022");
    }

    @Then("Kullanici Appointment date can not be past date! yazisini gorur AG.")
    public void kullaniciAppointmentDateCanNotBePastDateYazisiniGorurAG() {
        medunnaPage.agGirilemezUyarisi.isDisplayed();
    }

    @Then("Kullanici Send an Appointment Request butonuna tikladiginda basarili yazisini gormemeli AG.")
    public void kullaniciSendAnAppointmentRequestButonunaTikladigindaBasariliYazisiniGormemeliAG() {
        medunnaPage.agSendAnAppointmentRequest.click();
        Assert.assertFalse(medunnaPage.agBasariliYazisi.isDisplayed());

    }

    @And("Kullanici Appointment Date Time textboxina tarihi gün.ay.yil formatinda girer AG.")
    public void kullaniciAppointmentDateTimeTextboxinaTarihiGünAyYilFormatindaGirerAG() {
        medunnaPage.agDateBox.clear();
        medunnaPage.agDateBox.sendKeys("26/11/2022");
    }

    @Then("Kullanici acilan dropdown da My Appointments butonuna tiklar AG.")
    public void kullaniciAcilanDropdownDaMyAppointmentsButonunaTiklarAG() {
        medunnaPage.agMyAppointmentsButton.click();
    }
    @Then("Kullanici girdigi tarih formatiyla My Appointment deki formatin aynı oldugunu dogrular AG.")
    public void kullaniciGirdigiTarihFormatiylaMyAppointmentDekiFormatinAynıOldugunuDogrularAG() {
        String expectedResult = medunnaPage.agAppointmentPageDate.getText();
        System.out.println("expectedResult = " + expectedResult);
        Assert.assertTrue(medunnaPage.agAppointmentPageDate.isDisplayed());
    }
}
