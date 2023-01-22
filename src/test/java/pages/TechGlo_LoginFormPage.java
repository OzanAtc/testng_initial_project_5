package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


}
