package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Variables;

import java.time.Duration;

public class LoginTest {

    @Test(groups = {"Regression", "Integration"})
    @Description("TC-Login-01")
    public void loginexitosolTest() {


    }

    @Test(groups = {"Functional"})
    @Description("TC-Login-02")
    public void loginfallidoTest2() {

    }

    @Test(groups = {"Functional"})
    @Description("TC-Login-03")
    public void logincredencialesblancoTest3() {

    }


    @Test(groups = {"Regression"})
    @Description("TC-Login-04")
    public void loginsinemailTest4() {

    }

    @Test(groups = {"Functional", "Integration"})
    @Description("TC-Login-05")
    public void loginolvidoclaveTest5() {

    }

}


