package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTest;

public class HomePage extends BaseTest {
    public WebDriver driver;

    //contructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //locators
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
    WebElement registerButton;


    //Actions methods
    public void clickLogin() {
        loginButton.click();
    }

    public void clickRegister() {
        loginButton.click();
    }


}

