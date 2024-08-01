package testSteps;

import net.serenitybdd.annotations.Step;
import pages.OpenWeatherHomePage;
import pages.SignInPage;

public class OpenWeatherSteps {

    OpenWeatherHomePage openWeatherHomePage;

    @Step("Verify if main window was opened")
    public void verifyIfMainWindowWasOpened() {
        openWeatherHomePage.verifyIfHomePageWasOpened();
    }

    @Step("Open sign in page")
    public SignInPage openSignIn() {
        openWeatherHomePage.clickButtonSignIn();
        return new SignInPage();
    }
}
