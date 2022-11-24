package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.MedunnaPage;
import utilities.ReusableMethods;

public class Us11StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();

    @Then("Kullanici gecerli username {string} girer. US11")
    public void kullaniciGecerliUsernameGirer(String username) {
        medunnaPage.yyusurname.sendKeys(username);
    }

    @Then("Kullanici gecerli password {string} girer. US11")
    public void kullaniciGecerliPasswordGirer(String password) {
        medunnaPage.yypassword.sendKeys(password);
    }

    @Then("Sign in butonuna tiklar. US11")
    public void signInButonunaTiklar() {
        medunnaPage.yysign2.click();
    }

    @Then("My Appointments butonuna tiklar. US11")
    public void myAppointmentsButonunaTiklar() {
        ReusableMethods.jsclick(medunnaPage.myAppointments);
    }

    @Then("Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11")
    public void appointmentsListesindekiIlkSiradakiHastaninEditButonunaTiklar() {
        medunnaPage.appointmentsFirstEdit.click();
    }

    @Then("Save butonuna tiklar. US11")
    public void saveButonunaTiklar() {
       ReusableMethods.jsclick(medunnaPage.createOrEditAppointmentsSave);
    }
}
