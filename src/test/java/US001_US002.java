import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US001_US002 {
    List<Object>actualData;
    @Given("kullanıcıhtc connection kurar")
    public void kullanıcıhtcConnectionKurar() {
        DatabaseUtility.createConnection();
    }

    @Then("kullanıcıhtc kayıtlı kişileri oluşturur {string} ve {string}")
    public void kullanıcıhtcKayıtlıKişileriOluştururVe(String query, String columnname) {
    actualData=DatabaseUtility.getColumnData(query,columnname);
    }

    @And("kullanıcı bilgilerini doğrular")
    public void kullanıcıBilgileriniDoğrular() {
        assertTrue(actualData.contains("309383"));
        System.out.println(actualData);
    }
}
