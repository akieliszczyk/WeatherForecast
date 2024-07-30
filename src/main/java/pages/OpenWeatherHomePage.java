package pages;

import dev.failsafe.internal.util.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OpenWeatherHomePage extends PageObject {

    public void verifyIfHomePageWasOpened()
    {
        Assert.isTrue(logo.isDisplayed(), "Logo is not displayed");

    }

    public void openSignInPage()
    {
        buttonSignIn.click();

    }

    @FindBy(xpath = "//*[@class='user-li']")
    WebElementFacade logo;

    @FindBy(xpath = "//*[@class='user-li']")
    WebElementFacade buttonSignIn;
}
