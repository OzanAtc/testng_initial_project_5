package test_scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGloBasePage;
import pages.TechGlo_FrontEndPage;
import pages.TechGlo_LoginFormPage;

public class TechGlo_LoginFormCardValidation extends TechGloBase{


    @Test(priority = 1, description = "Login Form Card Validation")
    public void loginFormCardValidation() {
        techGlo_frontEndPage.getFrondEndPage();
        techGlo_frontEndPage.clickOnCard(15);
        Assert.assertTrue(techGlo_loginFormPage.headingForLoginForm.isDisplayed());

        for (int i = 0; i < techGlo_loginFormPage.loginFormLabelsForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlo_loginFormPage.loginFormLabelsForUserNameAndPassword.get(i).isDisplayed());
        }

        for (int i = 0; i < techGlo_loginFormPage.loginFormInputBoxForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlo_loginFormPage.loginFormInputBoxForUserNameAndPassword.get(i).isDisplayed());
        }

          Assert.assertTrue(techGlo_loginFormPage.loginButton.isDisplayed());
          Assert.assertTrue(techGlo_loginFormPage.forgetPasswordLink.isDisplayed());
    }
}
