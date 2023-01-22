package test_scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGloBasePage;
import pages.TechGlo_FrontEndPage;
import pages.TechGlo_LoginFormPage;

public class TechGlo_LoginFormCardValidation extends TechGloBase{

    @BeforeMethod
    public void setPage() {
        techGlo_frontEndPage = new TechGlo_FrontEndPage();
        techGlo_loginFormPage= new TechGlo_LoginFormPage();
    }

    @Test(priority = 1, description = "Login Form Card Validation")
    public void loginFormCardValidation() {
        techGlo_frontEndPage.getFrondEndPage();
        techGlo_frontEndPage.clickOnCard(16);
        Assert.assertTrue(techGlo_loginFormPage.headingForLoginForm.isDisplayed());

        for (int i = 0; i < techGlo_loginFormPage.loginFormLabelsForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlo_loginFormPage.loginFormLabelsForUserNameAndPassword.get(i).isDisplayed());
        }

        for (int i = 0; i < techGlo_loginFormPage.loginFormInputBoxForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlo_loginFormPage.loginFormInputBoxForUserNameAndPassword.get(i).isDisplayed());
        }


    }
}
