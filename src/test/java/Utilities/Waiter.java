package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    public static void pause(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    public static void waitForVisibilityOfElements(WebElement element, int seconds) {
        new WebDriverWait(Driver.getDriver(), 60).until(ExpectedConditions.visibilityOf(element));
    }

}