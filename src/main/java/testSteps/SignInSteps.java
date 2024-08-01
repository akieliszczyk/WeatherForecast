package testSteps;

import net.serenitybdd.annotations.Step;
import pages.SignInPage;

public class SignInSteps {

    SignInPage signInPage;

    @Step("Verify if Sign in page was opened")
    public void verifyIfSignInPageWasOpened() {
        signInPage.verifyIfSignInPageWasOpened();
    }

    @Step("Enter credentials")
    public void enterCredentials(String username, String password) {
        signInPage.enterUsername(username);
        signInPage.enterPassword(password);
        signInPage.clickSubmit();
    }
}
