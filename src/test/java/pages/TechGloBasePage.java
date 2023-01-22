package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TechGloBasePage {

    public TechGloBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="dropdown-button")
    public WebElement headerDropDown;

    @FindBy(css = "#dropdown-menu a")
    public List<WebElement> headerDropDownOptions;



}
