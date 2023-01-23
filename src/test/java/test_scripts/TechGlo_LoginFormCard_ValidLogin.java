package test_scripts;

import Utilities.Waiter;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlo_FrontEndPage;
import pages.TechGlo_LoginFormPage;

public class TechGlo_LoginFormCard_ValidLogin extends TechGloBase{


    @Test(priority = 1, description = "Validate Login Form Card Valid Login")
    public void loginFormValidLogin() {

        techGlo_loginFormPage.loginFormCardLogin();
        Assert.assertTrue(techGlo_loginFormPage.afterLoginMessage.isDisplayed());
        Assert.assertTrue(techGlo_loginFormPage.logOutButton.isDisplayed());

    }

   @Test(priority = 2, description = "Validate Login Form Card Valid Login / Logout ")
    public void loginFormValidLoginAndLogOut() {

        techGlo_loginFormPage.loginFormCardLogin();
        techGlo_loginFormPage.logOutButton.click();
        Waiter.pause(2);
        Assert.assertEquals(driver.getCurrentUrl(), "https://techglobal-training.netlify.app/frontend/login-form");
   }




}
