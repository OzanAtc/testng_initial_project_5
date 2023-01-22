package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    private Driver(){
    }

    public static WebDriver getDriver() {
        if(driver == null) {

            String browser = ConfigReader.getProperty("browser");

            switch (browser.toLowerCase()) {
                case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                case "firefox":
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();

                case "safari":
                WebDriverManager.chromedriver().setup();
                driver = new SafariDriver();
            }

                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
            }
                return driver;
        }


    public static void quitDriver() {
        if(driver != null)
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
    }
}
