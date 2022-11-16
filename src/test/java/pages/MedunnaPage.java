package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {

    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
