package test_scripts;

import Utilities.ConfigReader;
import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGloBasePage;
import pages.TechGlo_FrontEndPage;
import pages.TechGlo_LoginFormPage;

public class TechGloBase {

    WebDriver driver;
    TechGloBasePage techGloBasePage;
    TechGlo_FrontEndPage techGlo_frontEndPage;
    TechGlo_LoginFormPage techGlo_loginFormPage;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        techGloBasePage = new TechGloBasePage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
