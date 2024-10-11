package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTest;

public class RegisterPage extends BaseTest {
    public WebDriver driver;

    //contructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //locators
   @FindBy(id="firstname")
    WebElement firstNameField;

    @FindBy(id="lastname")
    WebElement lastNameField;

    @FindBy(id="email_address")
    WebElement emailField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(id="password-confirmation")
    WebElement confirmPasswordField;

    @FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/button")
    WebElement submitButton;

    //Actions methods
    public void setFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

}
