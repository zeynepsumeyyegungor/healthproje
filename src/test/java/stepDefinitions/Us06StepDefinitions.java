package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Us06StepDefinitions {

    MedunnaPage obj=new MedunnaPage();

    @Given("Kullanici medunna sayfasina gider US04")
    public void KullanicimedunnasayfasinagiderUS04() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @Then("kullanci sign in butonuno tiklar  US04")
    public void kullancisigninbutonunotiklarUS04() {obj.userIcon.click();
        obj.yysign.click();
    }

    @Then("kullanici gecerli usurname girer US04")
    public void kullanicigecerliusurnamegirerUS04()  {obj.yyusurname.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.waitFor(2);
    }
    @Then("kullanici gecerli password girer US04")
    public void kullanicigecerlipasswordgirerUS04() {
        obj.yypassword.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici signinnn butonuna tiklar US04")
    public void kullanicisigninnnbutonunatiklarUS04() throws IOException {
        obj.yysign2.click();
        Assert.assertTrue("succes to message uyarisi goruntulenemedi",Driver.getDriver().getPageSource().contains("success to  message"));
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshotWebElement("succes to message", obj.yyekranresmi);
    }

    @Then("user iconuna tiklar US06")
    public void usericonunatiklarUS06(){
        obj.yymertDemirci.click();
    }
    @Then("kullanci settings butonuna tiklar US06")
    public void kullancisettingsbutonunatiklarUS06() {obj.yyseetings.click();

    }

    @Then("kullanici varolan bilgileri listeler")
    public void kullaniciVarolanBilgileriListeler() {
        ReusableMethods.waitFor(3);
        String valuefirst=  ReusableMethods.getValueWithJs("firstName");
        System.out.println("valueFirst = " + valuefirst);
        String valuelast=  ReusableMethods.getValueWithJs("lastName");
        System.out.println("valueLast = " + valuelast);
        String valueemail=  ReusableMethods.getValueWithJs("Email");
        System.out.println("valueEmail = " + valueemail);

    }
    @When("kullanici {string} bilgileri günceller US06")
    public void kullaniciBilgileriGüncellerUS06(String firstName) {
        obj.yySettingsfirstName.clear();
        firstName= Faker.instance().name().username();
        obj.yySettingsfirstName.sendKeys(firstName);
        obj.yysave.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yyseettingsSaved.isDisplayed());
    }
    @Then("kullanici {string} bilgileri güncellerr US06")
    public void kullaniciBilgileriGüncellerrUS06(String lastName) {
        obj.yySettingslastName.clear();
        lastName=Faker.instance().name().lastName();
        obj.yySettingslastName.sendKeys(lastName);
        obj.yysave.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yyseettingsSaved.isDisplayed());
    }
    @Then("kullanicii {string} bilgileri güncellerr US06")
    public void kullaniciiBilgileriGüncellerrUS06(String Email){
        obj.yySettingsemail.clear();
        Email=Faker.instance().internet().emailAddress();
        obj.yySettingsemail.sendKeys(Email);
        obj.yysave.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yyseettingsSaved.isDisplayed());
    }

    @And("sayfayi kapatirr US04")
    public void sayfayikapatirrUS04() {
        Driver.quitDriver();

    }


}
