package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTest;

public class OrderPage extends BaseTest {
    public WebDriver driver;

    //contructor
    public  OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locators


    //Actions methods



}
