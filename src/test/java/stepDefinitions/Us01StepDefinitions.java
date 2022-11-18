package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us01StepDefinitions {
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici Medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici user icon simgesine tiklar")
    public void kullanici_user_icon_simgesine_tiklar() {
        loginPage.userIcon.click();
    }

    @Then("Kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        loginPage.RegisterButton.click();
    }

    @Then("Kullanici registration formunu doldurur ve register submit butonuna tiklar")
    public void kullanici_registration_formunu_doldurur_ve_register_submit_butonuna_tiklar() {
        loginPage.registrationSSN.click();
        actions.sendKeys(faker.number().digits(3)).sendKeys("-")
                .sendKeys(faker.number().digits(2)).sendKeys("-")
                .sendKeys(faker.number().digits(3)).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().username()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys("abcd").sendKeys(Keys.TAB).sendKeys("abcd").sendKeys(Keys.TAB, Keys.ENTER).perform();
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Registration saved yazisinin gorundugunu dogrular")
    public void kullanici_registration_saved_yazisinin_gorundugunu_dogrular() {
        Assert.assertTrue(loginPage.registrationSavedMessage.isDisplayed());
    }

    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @And("Kullanici Registration sayfasinin acildigini dogrular")
    public void kullaniciRegistrationSayfasininAcildiginiDogrular() {
        assert loginPage.registrationPage.isDisplayed();
    }

    @And("Kullanici SSN kismina gecersiz bir SSN girer")
    public void kullaniciSSNKisminaGecersizBirSSNGirer() {
        loginPage.registrationSSN.sendKeys("125-25-222");
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstName.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici gecersiz SSN girdiginde {string} uyarisi aldigini dogrular")
    public void kullaniciGecersizSSNGirdigindeUyarisiAldiginiDogrular(String arg0) {
        Assert.assertTrue(loginPage.registrationSSNwarning.isDisplayed());
    }

    @And("Kullanici SSN kismini bos birakir")
    public void kullaniciSSNKisminiBosBirakir() {
        loginPage.registrationSSN.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstName.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici SSN alanini bos biraktiginda {string} uyarisi aldigini dogrular")
    public void kullaniciSSNAlaniniBosBiraktigindaUyarisiAldiginiDogrular(String arg1) {
        assert loginPage.ssnRequiredWarning.isDisplayed();
    }

    @And("Kullanici First Name alanini bos birakir")
    public void kullaniciFirstNameAlaniniBosBirakir() {
        loginPage.registrationFirstName.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationLastName.click();
        ReusableMethods.waitFor(1);
    }


    @And("Kullanici {string} uyarisi aldigini dogrular.")
    public void kullaniciUyarisiAldiginiDogrular(String arg2) {
        assert loginPage.firstNameRequiredWarning.isDisplayed();
    }

    @And("Kullanici Last Name alanini bos birakir")
    public void kullaniciLastNameAlaniniBosBirakir() {
        loginPage.registrationLastName.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationUserName.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici last name alanini bos biraktiginda {string} uyarisi aldigini dogrular.")
    public void kullaniciLastNameAlaniniBosBiraktigindaUyarisiAldiginiDogrular(String arg0) {
        assert loginPage.lastNameRequiredWarning.isDisplayed();
    }

    @And("Kullanici Username alanini bos biraktiginda Your username is required. uyarisi aldigini dogrular")
    public void kullaniciUsernameAlaniniBosBiraktigindaYourUsernameIsRequiredUyarisiAldiginiDogrular() {
        loginPage.registrationUserName.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationEmail.click();
        ReusableMethods.waitFor(1);
        assert loginPage.userNameRequiredWarning.isDisplayed();
    }
}

