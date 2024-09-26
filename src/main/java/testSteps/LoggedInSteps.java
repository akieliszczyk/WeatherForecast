package testSteps;

import net.serenitybdd.annotations.Step;
import pages.LoggedInPage;
import pages.SignInPage;

public class LoggedInSteps {

    LoggedInPage loggedInPage;
    SignInPage signInPage;

    @Step("Verify sign in message")
    public boolean verifyMessage(boolean flag) {
        boolean message;
        if (flag) {
            message = loggedInPage.getMessage().equals("Signed in successfully.");
        } else if (!flag){
            message = signInPage.getMessage().equals("Invalid Email or password.");
        } else {
            message = false;
        }
        return message;
    }
}
