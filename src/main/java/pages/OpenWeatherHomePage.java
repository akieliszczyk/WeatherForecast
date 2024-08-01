package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OpenWeatherHomePage extends PageObject {
    
    @FindBy(xpath = "//*[@class='user-li']")
    WebElementFacade logo;

    @FindBy(xpath = "//*[@class='user-li']")
    WebElementFacade buttonSignIn;

    public boolean verifyIfHomePageWasOpened()
    {
        return logo.isDisplayed();

    }

    public void clickButtonSignIn()
    {
        buttonSignIn.click();
    }


}
