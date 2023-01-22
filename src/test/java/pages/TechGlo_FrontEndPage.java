package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TechGlo_FrontEndPage extends TechGloBasePage{

    public TechGlo_FrontEndPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

  @FindBy(css = "div[id^='card']")
    public List<WebElement> cards;


    public void getFrondEndPage() {
        headerDropDown.click();
        headerDropDownOptions.get(0).click();
    }

    public void clickOnCard(int index) {
        cards.get(index).click();
    }

}
