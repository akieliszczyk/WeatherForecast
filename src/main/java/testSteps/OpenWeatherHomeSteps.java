package testSteps;

import net.serenitybdd.annotations.Step;
import pages.OpenWeatherHomePage;

public class OpenWeatherHomeSteps {

    OpenWeatherHomePage openWeatherHomePage;

    @Step("Verify if main window was opened")
    public void verifyIfMainWindowWasOpened() {
        openWeatherHomePage.verifyIfHomePageWasOpened();
    }

    @Step("Open sign in page")
    public void openSignIn() {
        openWeatherHomePage.clickButtonSignIn();
    }

    @Step("Enter city name in searchbox")
    public void enterCityInSearchbox(String cityName) {
        openWeatherHomePage.enterCityInSearchbox(cityName);
    }

    @Step("Select city from drop down list")
    public void selectCity() {
        openWeatherHomePage.selectCity();
    }

    @Step("Check if city is displayed")
    public boolean isCityDisplayed() {
        return openWeatherHomePage.isCityDisplayed();
    }

    @Step("Check if temperature is displayed")
    public boolean isTemperatureDisplayed() {
        return openWeatherHomePage.isTemperatureDisplayed();
    }

    @Step("Check if date is actual")
    public boolean isDateActual() {
        return openWeatherHomePage.isDateActual();
    }

    @Step("Check if map is displayed")
    public boolean isMapDisplayed() {
        return openWeatherHomePage.isMapDisplayed();
    }
}
