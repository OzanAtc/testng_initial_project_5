package test_scripts;

import Utilities.Waiter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TechGlo_LinkAndPasswordTest extends TechGloBase{

    @Test(priority = 1, description = "Validate the message after resetting the password")
    public void messageAfterPasswordReset() {

        techGlo_loginFormPage.forgetPasswordLink.click();
        Waiter.pause(4);
        Assert.assertTrue(techGlo_loginFormPage.resetPasswordHeading.isDisplayed());
        Assert.assertTrue(techGlo_loginFormPage.messageAfterResetPassword.isDisplayed());
        Assert.assertTrue(techGlo_loginFormPage.emailInputBox.isDisplayed());
        Assert.assertTrue(techGlo_loginFormPage.submitButton.isDisplayed());
    }

    @Test(priority = 2, description = "Validate Reset and Password Link on Login Form Card")
    public void validateResetPasswordLink() {

        techGlo_loginFormPage.forgetPasswordLink.click();
        Waiter.pause(4);
        techGlo_loginFormPage.emailInputBox.sendKeys("JohnDoe@gmail.com");
        Waiter.pause(2);
        techGlo_loginFormPage.submitButton.click();
        Assert.assertTrue(techGlo_loginFormPage.resetPasswordLink.isDisplayed());
    }
}
