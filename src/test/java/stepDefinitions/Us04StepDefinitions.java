package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;


public class Us04StepDefinitions {
    MedunnaPage obj=new MedunnaPage();

    @Given("Kullanici medunna sayfasina gider US04")
    public void KullanicimedunnasayfasinagiderUS04() {Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @Then("kullanci sign in butonuno tiklar  US04")
    public void kullancisigninbutonunotiklarUS04() {obj.userIcon.click();
        obj.yysign.click();
    }

    @Then("kullanici gecerli usurname girer US04")
    public void kullanicigecerliusurnamegirerUS04()  {obj.yyusurname.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.waitFor(2);
    }
    @Then("kullanicigecerlipasswordgirerUS04")
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

    @Then("kullanici Remember me secenegi dogrular US04")
    public void kullaniciRemembermesecenegidogrularUS04(){
        Assert.assertTrue(obj.yyremember.isDisplayed());
    }
    @Then("kullanici Did you forget  password secenegini dogrular US04")
    public void kullaniciDidyouforgetpasswordseceneginidogrularUS04() {
        Assert.assertTrue(obj.yydidYouForgetPass.isDisplayed());

    }
    @Then("kullanici You dont have an account get Register a new account secenegini dogrularr US04")
    public void kullaniciYoudonthaveanaccountgetRegisteranewaccountseceneginidogrularrUS04() {
        Assert.assertTrue(obj.yyregistirnewAccount.isDisplayed());
    }


    @Then("kullanici hatali giris yapar US04")
    public void kullanicihataligirisyaparUS04() throws IOException {
        obj.yyusurname.sendKeys("team1111");
        obj.yypassword.sendKeys("team89668");
        obj.yysign2.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        ReusableMethods.getScreenshotWebElement("popMessage",obj.yyhataliGirisUyarisi);
        wait.until(ExpectedConditions.visibilityOf(obj.yyhataliGirisUyarisi));
        Assert.assertTrue(obj.yyhataliGirisUyarisi.isDisplayed());
    }
    @Then("kullanici cancel secenegini dogrular US04")
    public void kullanicicancelseceneginidogrularUS04() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yycancel.isDisplayed());
    }
    @And("sayfayi kapatirr US04")
    public void sayfayikapatirrUS04() {
        Driver.quitDriver();

    }

}






