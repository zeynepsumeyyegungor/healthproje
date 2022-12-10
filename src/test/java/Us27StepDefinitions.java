import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Us27StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici medunna sayfasina gider.zsg")
    public void kullaniciMedunnaSayfasinaGiderZsg() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kisi ikonuna tiklar.")
    public void kisiIkonunaTiklar() {medunnaPage.yysign2.click();
    }

    @Then("Sign in butonuna tiklar.")
    public void signInButonunaTiklar() {medunnaPage.yysign2.click();
    }

    @Then("Admin username bilgilerini {string} girer.")
    public void adminUsernameBilgileriniGirer(String username) {
        medunnaPage.yyusurname.sendKeys(username);
    }

    @Then("Admin password bilgilerini {string} girer.")
    public void adminPasswordBilgileriniGirer(String password) {
        medunnaPage.yypassword.sendKeys(password);
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
