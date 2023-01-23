package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TechGlo_InvalidLoginCredentials extends TechGloBase{

    @Test(priority = 1, description = "Validate Invalid Login with Wrong Username on Login Form Card")
    public void validateInvalidLogin_WrongUserName() {

        techGlo_loginFormPage.loginFormCardInvalidLogin_WrongUserName();
        Assert.assertTrue(techGlo_loginFormPage.errorMessage.isDisplayed());
        Assert.assertEquals(techGlo_loginFormPage.errorMessage.getText(), "Invalid Username entered!");
    }

   @Test(priority = 2, description = "Validate Invalid Login with Wrong Password on Login Form Card")
    public void validateInvalidLoginWrongPassword() {

      techGlo_loginFormPage.loginFormCardInvalidLogin_WrongPassword();
       Assert.assertTrue(techGlo_loginFormPage.errorMessage.isDisplayed());
       Assert.assertEquals(techGlo_loginFormPage.errorMessage.getText(), "Invalid Password entered!");
   }

    @Test(priority = 3, description = "Validate Invalid Login With Both Wrong Credentials")
    public void validateBothWrongCredentials() {
        techGlo_loginFormPage.loginFormCardInvalidLoginWithCredentials();
        Assert.assertEquals(techGlo_loginFormPage.errorMessage.getText(), "Invalid Username entered!");

    }
}
