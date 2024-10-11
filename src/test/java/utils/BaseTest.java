package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;
import pages.RegisterPage;

import java.security.ProtectionDomain;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected OrderPage orderPage;
    protected RegisterPage registerPage;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.get(Variables.baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Variables.timeout));

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        orderPage = new OrderPage(driver);
        registerPage = new RegisterPage(driver);

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}
