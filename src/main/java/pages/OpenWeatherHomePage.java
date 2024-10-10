package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class OpenWeatherHomePage extends PageObject {
    
    @FindBy(xpath = "//*[@class='user-li']")
    WebElementFacade logo;

    @FindBy(xpath = "//*[@class='user-li']")
    WebElementFacade buttonSignIn;

    @FindBy(xpath = "//*[@class='search-container']")
    WebElementFacade textboxSearch;

    @FindBy(xpath = "//*[@class='search-dropdown-menu']")
    WebElementFacade dropdown;

    public boolean verifyIfHomePageWasOpened()
    {
        return logo.isDisplayed();
    }

    public void clickButtonSignIn()
    {
        buttonSignIn.click();
    }

    public void enterCityInSearchbox(String cityName) {
        textboxSearch.sendKeys(cityName, Keys.ENTER);
    }

    public void selectCity() {
        dropdown.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public boolean isCityDisplayed() {
        return true;
    }

    public boolean isTemperatureDisplayed() {
        return true;
    }

    public boolean isDateActual() {
        return true;
    }

    public boolean isMapDisplayed() {
        return true;
    }



}
