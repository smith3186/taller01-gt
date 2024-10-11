package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;
import utils.Variables;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test(groups = {"Regression", "Integration"})
    @Description("TC-Login-01")
    public void loginexitosolT1() {
        homePage.clickLogin();
        loginPage.setEmail("fekey45124@paxnw.com");
        loginPage.setPassword("4c3#x5GtXDGruJG");
        loginPage.clickSubmitButton();
    }

    @Test(groups = {"Functional"})
    @Description("TC-Login-02")
    public void loginfallidoT2() {

    }

    @Test(groups = {"Functional"})
    @Description("TC-Login-03")
    public void logincredencialesblancoT3() {

    }


    @Test(groups = {"Regression"})
    @Description("TC-Login-04")
    public void loginsinemailT4() {

    }

    @Test(groups = {"Functional", "Integration"})
    @Description("TC-Login-05")
    public void loginolvidoclaveT5() {

    }

}


