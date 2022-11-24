package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {

    //1-49 Mert
    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@data-icon='user']") public WebElement userIcon;
    @FindBy (xpath = "//*[@id='ssn']") public WebElement registrationSSN;
    @FindBy (xpath = "//*[text()='Registration']") public WebElement registrationPage;
    @FindBy (xpath = "//*[text()='Register']") public WebElement RegisterButton;
    @FindBy (xpath = "//*[text()='Your SSN is required.']") public WebElement ssnRequiredWarning;
    @FindBy (xpath = "//*[text()='Your FirstName is required.']") public WebElement firstNameRequiredWarning;
    @FindBy (xpath = "//*[text()='Your LastName is required.']") public WebElement lastNameRequiredWarning;
    @FindBy (xpath = "//*[text()='Your username is required.']") public WebElement userNameRequiredWarning;

    @FindBy (xpath = "//*[@id='firstName']") public WebElement registrationFirstName;
    @FindBy (xpath = "//*[@id='lastName']") public WebElement registrationLastName;
    @FindBy (xpath = "//*[@id='username']") public WebElement registrationUserName;
    @FindBy (xpath = "//*[@id='email']") public WebElement registrationEmail;
    @FindBy (xpath = "//*[@id='firstPassword']") public WebElement registrationFirstPassword;
    @FindBy (xpath = "//*[@id='secondPassword']") public WebElement registrationSecondPassword;
    @FindBy (xpath = "//*[@id='register-submit']") public WebElement registrationRegisterSubmit;
    @FindBy (xpath = "//div[@class='invalid-feedback']") public WebElement ssnInvalidwarning;

    @FindBy (xpath = "//div[@class='Toastify__toast-body']") public WebElement registrationSavedMessage;
    @FindBy (xpath = "//input[@class='is-touched is-dirty av-valid form-control']") public WebElement registrationFirstNameOk;
















    //50-99 Ahmet
    @FindBy (xpath = "(//a[@href='/physician-appointment'])[2]") public WebElement myAppointments;
    @FindBy (xpath = "//input[@id='fromDate']") public WebElement dateSelectFrom;
    @FindBy (xpath = "//input[@id='toDate']") public WebElement dateSelectTo;
    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']") public WebElement appointmentsFirstEdit;
    @FindBy (xpath = "//a[@href='/tests/appointment/309383']") public WebElement showTestResults;












































    //100-149 Aybuke
    @FindBy (xpath = "//*[@class='appointment-btn scrollto']") public WebElement agMakeAnAppointment;
    @FindBy(xpath = "//*[text()='Your FirstName is required.']") public WebElement agFirstNameRequired;
    @FindBy(xpath = "//*[text()='Your LastName is required.']") public  WebElement agLastNameRequired;
    @FindBy(xpath = "//*[text()='Your SSN is required.']") public  WebElement agSsnRequired;
    @FindBy(xpath = "//*[text()='Your email is required.']") public  WebElement agEmailRequired;
    @FindBy(xpath = "//*[text()='Phone number is required.']") public  WebElement agPhoneRequired;
    @FindBy(xpath = "//input[@id='firstName']") public WebElement agFirstName;
    @FindBy(xpath = "//input[@id='lastName']") public WebElement agLastName;
    @FindBy(xpath = "//input[@id='ssn']") public WebElement agSsn;
    @FindBy(xpath = "//input[@id='email']") public WebElement agEmail;
    @FindBy(xpath = "//input[@id='phone']") public WebElement agPhone;
    @FindBy(id = "register-form") public WebElement agRegisterForm;
    @FindBy(xpath = "//*[text()='Send an Appointment Request']") public WebElement agSendAnAppointmentRequest;
    @FindBy(xpath = "//div[@class='Toastify']//span[1]") public WebElement agBasariliYazisi;
    @FindBy(xpath = "//*[@id='account-menu']") public WebElement agUserIconu;
    @FindBy(xpath = "//*[@id='login-item']") public WebElement agIlkSignIn;
    @FindBy(xpath = "//*[@id='username']") public WebElement agUsername;
    @FindBy(xpath = "//*[@id='password']") public WebElement agPassword;
    @FindBy(xpath = "//*[@class='btn btn-primary']") public WebElement agSignInButton;
    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']") public WebElement agMyPagesButton;
    @FindBy(xpath = "(//*[text()='My Appointments'])[1]") public WebElement agMyAppointmentsButton;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div") public WebElement agMyAppointmentsPage;
    @FindBy(xpath = "(//*[text()='Make an Appointment'])[1]") public WebElement agMakeAppointmentDropDown;
    @FindBy(xpath = "//input[@id='appoDate']") public WebElement agDateBox;
    @FindBy(xpath = "//*[text()='Appointment date can not be past date!']") public WebElement agGirilemezUyarisi;
    @FindBy(xpath = "(//*[text()='Ceyda Gürbüz'])[1]") public WebElement agProfilSekmesi;
    @FindBy(xpath = "(//*[text()='26/11/22 03:00'])[1]") public WebElement agAppointmentPageDate;






















    //150-199 Caner

    @FindBy (xpath = "//*[@data-icon='user']") public WebElement userIconMck;
    @FindBy (xpath = "(//*[text()='Sign in'])[1]") public WebElement signInMck;
    @FindBy (xpath = "//*[@name='username']") public WebElement userNameMck;
    @FindBy (xpath = "//*[@name='password']") public WebElement passwordMck;
    @FindBy (xpath = "(//*[text()='Sign in'])[3]") public WebElement signInButtonMck;
    @FindBy (xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']") public WebElement userNameIconMck;
    @FindBy (xpath = "//*[text()='Password']") public WebElement passwordButtonMck;
    @FindBy (xpath = "//*[text()='Sign out']") public WebElement signOutButtonMck;
    @FindBy (xpath = "//*[@name='currentPassword']") public WebElement currentPasswordBoxMck;
    @FindBy (xpath = "//*[@name='newPassword']") public WebElement newPasswordBoxMck;
    @FindBy (xpath = "//*[@name='confirmPassword']") public WebElement confirmPasswordBoxMck;
    @FindBy (xpath = "//*[text()='Save']") public WebElement saveButtonMck;
    @FindBy (xpath = "//*[@class='text-danger form-group']") public WebElement passwordConfirmationBoxMck;
    @FindBy (xpath = "//*[text()='The password and its confirmation do not match!']") public WebElement passwordNotMatchAlertMck;
    @FindBy (xpath = "//*[@style='background-color: rgb(221, 221, 221);']") public WebElement passwordStrength5GreytMck;
    @FindBy (xpath = "(//*[@style='background-color: rgb(0, 255, 0);'])[5]") public WebElement passwordStrength5GreentMck;
    @FindBy (xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[4]") public WebElement passwordStrength4GreentMck;
    @FindBy (xpath = "//*[@style='background-color: rgb(255, 0, 0);']") public WebElement passwordStrength1RedMck;
    @FindBy (xpath = "//*[@class='alert alert-danger fade show']") public WebElement failedToSignInAlerttMck;





























    //200-249 Esra

















































    //250-299 Fatma

















































    //300-349 Yahya

    @FindBy(xpath = "//span[contains(text(),'Sign in')]") public WebElement yysign;
    @FindBy(xpath = "//*[@name='username']") public WebElement yyusurname;
    @FindBy(xpath = "//*[@name='password']") public WebElement yypassword;
    @FindBy(xpath = "//*[@class='btn btn-primary']") public WebElement yysign2;
    @FindBy(xpath = "//span[contains(text(),'Settings')]") public WebElement yyseetings;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']") public WebElement yymertDemirci;
    @FindBy(xpath = "//span[contains(text(),'Remember me')]") public WebElement yyremember;
    @FindBy(xpath = "(//*[@class='alert alert-warning fade show'])[1]") public WebElement yydidYouForgetPass;
    @FindBy(xpath = "(//*[@class='alert alert-warning fade show'])[2]") public WebElement yyregistirnewAccount;
    @FindBy(xpath = "//html") public WebElement yyekranresmi;
    @FindBy(xpath = "//*[@id='firstName']") public WebElement yySettingsfirstName;
    @FindBy(xpath = "//*[@id='lastName']") public WebElement yySettingslastName;
    @FindBy(xpath = "//*[@id='email']") public WebElement yySettingsemail;
    @FindBy(xpath = "//button[@type='submit']") public WebElement yysave;
    @FindBy(xpath = "//strong[contains(text(),'Settings saved!')]") public WebElement yyseettingsSaved;
    @FindBy(xpath ="//*[contains(text(),'Authentication information not correct.')]") public WebElement yyhataliGirisUyarisi;
    @FindBy(xpath = "//span[contains(text(),'Cancel')]") public WebElement yycancel;































    //350-399 Zeynep
   @FindBy (xpath = "//button[@id=\"save-entity\"]")  public WebElement createOrEditAppointmentsSave;
















































    //400-449 Musa





















}
