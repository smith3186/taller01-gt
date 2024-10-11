package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;
import utils.Variables;

public class LoginTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test(groups = {"Regression", "Integration"}, priority = 1)
    @Description("TC-Login-01")
    public void loginexitosolT1() throws InterruptedException {
        homePage.clickLogin();
        loginPage.setEmail("fekey45124@paxnw.com");
        loginPage.setPassword("4c3#x5GtXDGruJG");
        loginPage.clickSubmitButton();
        loginPage.getMessageSuccess();

    }

    @Test(groups = {"Functional"}, priority = 2)
    @Description("TC-Login-02")
    public void loginfallidoT2() {
        homePage.clickLogin();
        loginPage.setEmail("fekey@paxnw.com");
        loginPage.setPassword("4c3#x5GtXDGruJG");
        loginPage.clickSubmitButton();
        loginPage.getMessageError();

    }

    @Test(groups = {"Functional"}, priority = 3)
    @Description("TC-Login-03")
    public void logincredencialesblancoT3() {
        homePage.clickLogin();
        loginPage.setEmail("");
        loginPage.setPassword("");
        loginPage.clickSubmitButton();
        loginPage.getEmailError();
        loginPage.getPassError();

    }


    @Test(groups = {"Regression"}, priority = 4)
    @Description("TC-Login-04")
    public void loginsinemailT4() {
        homePage.clickLogin();
        loginPage.setEmail("");
        loginPage.setPassword("4c3#x5GtXDGruJG");
        loginPage.clickSubmitButton();
        loginPage.getEmailError();

    }

    @Test(groups = {"Functional", "Integration"},priority = 5)
    @Description("TC-Login-05")
    public void loginolvidoclaveT5() {
        homePage.clickLogin();
        loginPage.setEmail("fekey45124@paxnw.com");
        loginPage.setPassword("4c3#x5GtXDG");
        loginPage.clickSubmitButton();
        loginPage.getMessageError();
        loginPage.clickForgotPass();
        loginPage.setEmailAdress("fekey45124@paxnw.com");
        loginPage.clickResetMyPass();
    }

}


