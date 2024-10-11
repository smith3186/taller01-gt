package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;


public class LoginPage extends BaseTest {
    public WebDriver driver;

    //contructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //locators
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    WebElement loginButton;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "email_address")
    WebElement emailadressField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"send2\"]")
    WebElement submitButton;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
    WebElement messagesuccess;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    WebElement messageerror;

    @FindBy(id = "email-error")
    WebElement emailerror;

    @FindBy(id = "pass-error")
    WebElement passerror;

    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a/span")
    WebElement forgotpass;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
    WebElement resetmyPass;


    //Actions methods
    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setEmailAdress(String email) {
        emailadressField.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getMessageSuccess() {
        return messagesuccess.getText();
    }

    public String getMessageError() {
        return messageerror.getText();
    }

    public String getEmailError() {
        return emailerror.getText();
    }

    public String getPassError() {
        return passerror.getText();
    }

    public void clickForgotPass() {
        forgotpass.click();
    }

    public void clickResetMyPass() {
        resetmyPass.click();
    }


}
