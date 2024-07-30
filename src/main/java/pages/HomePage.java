package pages;

import net.serenitybdd.annotations.Step;

public class HomePage {


    OpenWeatherHomePage openWeatherHomePage;
    SignInPage signInPage;

    @Step("Verify if main window was opened")
    public void verifyIfMainWindowWasOpened() {
        openWeatherHomePage.verifyIfHomePageWasOpened();
    }

    @Step("Sign in with valid credentials")
    public void signInWithValidCredentials(String username, String password) {
        openWeatherHomePage.openSignInPage();
        signInPage.signInWithValidCredentials(username, password);
    }

    @Step("Sign in with invalid credentials")
    public void signInWithInvalidCredentials(String username, String password) {
        openWeatherHomePage.openSignInPage();
        signInPage.signInWithInvalidCredentials(username, password);
    }

    @Step("Try to sign in with special characters")
    public void signInWithSpecialCharacters(String specCharacters) {
        openWeatherHomePage.openSignInPage();
        signInPage.signInWithInvalidCredentials(specCharacters, specCharacters);
    }
}
