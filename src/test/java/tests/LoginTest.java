package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Variables;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Variables.baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Variables.timeout));
        driver.manage().window().maximize();

        System.out.println("Setup completed");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

        System.out.println("tearDown completed");
    }


    @Test(priority = 1)
    @Description("TC-Login-01")
    public void loginexitosolTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin();
        loginPage.setEmail("fekey45124@paxnw.com");
        loginPage.setPassword("4c3#x5GtXDGruJG");
        loginPage.clickSubmitButton();
        loginPage.getMessageSuccess();

        System.out.println("login successful completed");

    }

    @Test(priority = 2)
    @Description("TC-Login-02")
    public void loginfallidoTest2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin();
        loginPage.setEmail("smith31@gmail.com");
        loginPage.setPassword("12134");
        loginPage.clickSubmitButton();
        loginPage.getMessageError();

        System.out.println("login fail completed");

    }

    @Test(priority = 3)
    @Description("TC-Login-03")
    public void logincredencialesblancoTest3() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin();
        loginPage.setEmail("");
    }


    @Test(priority = 4)
    @Description("TC-Login-04")
    public void loginsinemailTest4() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin();
        loginPage.setEmail("");
    }


    @Test(priority = 5)
    @Description("TC-Login-05")
    public void loginolvidoclaveTest5() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin();
        loginPage.setEmail("");
    }

}


