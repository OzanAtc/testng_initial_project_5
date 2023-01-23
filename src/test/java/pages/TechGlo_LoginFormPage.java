package pages;

import Utilities.Driver;
import Utilities.Waiter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test_scripts.TechGloBase;

import java.util.List;

public class TechGlo_LoginFormPage extends TechGlo_FrontEndPage{

    public TechGlo_LoginFormPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="main_heading")
    public WebElement headingForLoginForm;

    @FindBy(css = ".LoginForm_form__b4o6J div>label")
    public List<WebElement> loginFormLabelsForUserNameAndPassword;

    @FindBy(css = ".LoginForm_form__b4o6J div>input")
    public List<WebElement> loginFormInputBoxForUserNameAndPassword;

    @FindBy(id = "login_btn")
    public WebElement loginButton;

    @FindBy(id= "forgot-password")
    public WebElement forgetPasswordLink;

    @FindBy(id = "success_lgn")
    public WebElement afterLoginMessage;

    @FindBy(id = "logout")
    public WebElement logOutButton;

    @FindBy(id= "sub_heading")
    public WebElement resetPasswordHeading;

    @FindBy(css = "div[class^='Forgot'] div>label")
    public WebElement messageAfterResetPassword;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "confirmation_message")
    public WebElement resetPasswordLink;

    @FindBy(id = "error_message")
    public WebElement errorMessage;


  public void loginFormCardLogin() {
      loginFormInputBoxForUserNameAndPassword.get(0).sendKeys("TechGlobal");
      Waiter.pause(4);
      loginFormInputBoxForUserNameAndPassword.get(1).sendKeys("Test1234");
      Waiter.pause(4);
      loginButton.click();
      Waiter.pause(4);
  }


    public void loginFormCardInvalidLogin_WrongUserName() {
        loginFormInputBoxForUserNameAndPassword.get(0).sendKeys("john");
        Waiter.pause(4);
        loginFormInputBoxForUserNameAndPassword.get(1).sendKeys("Test1234");
        Waiter.pause(4);
        loginButton.click();
        Waiter.pause(4);
    }

    public void loginFormCardInvalidLogin_WrongPassword() {
        loginFormInputBoxForUserNameAndPassword.get(0).sendKeys("TechGlobal");
        Waiter.pause(4);
        loginFormInputBoxForUserNameAndPassword.get(1).sendKeys("1234");
        Waiter.pause(4);
        loginButton.click();
        Waiter.pause(4);
    }

    public void loginFormCardInvalidLoginWithCredentials() {
        loginFormInputBoxForUserNameAndPassword.get(0).sendKeys("john");
        Waiter.pause(4);
        loginFormInputBoxForUserNameAndPassword.get(1).sendKeys("1234");
        Waiter.pause(4);
        loginButton.click();
        Waiter.pause(4);
    }

}
