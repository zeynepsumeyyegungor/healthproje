package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class US27StepDefinition {
    @Given("Kullanici medunna sayfasina gider.zsg")
    public void kullaniciMedunnaSayfasinaGiderZsg() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kisi ikonuna tiklar.")
    public void kisiIkonunaTiklar() {
    }

    @Then("Sign in butonuna tiklar.")
    public void signInButonunaTiklar() {
    }

    @Then("Admin username bilgilerini girer.")
    public void adminUsernameBilgileriniGirer() {
    }

    @Then("Admin password bilgilerini girer.")
    public void adminPasswordBilgileriniGirer() {
    }

    @Then("Items&Titles butonuna tiklar.")
    public void itemsTitlesButonunaTiklar() {
    }

    @Then("Messages butonuna tiklar.")
    public void messagesButonunaTiklar() {
    }

    @Then("Create a new message box'a tiklar.")
    public void createANewMessageBoxATiklar() {
    }
}
