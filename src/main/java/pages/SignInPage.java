package pages;

import dev.failsafe.internal.util.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInPage extends PageObject {

    public void signInWithValidCredentials(String username, String password) {
        textboxUsername.sendKeys(username);
        textboxPassword.sendKeys(password);
        buttonSubmit.click();
        Assert.isTrue(message.getText().equals("Signed in successfully."), "Error message is incorrect");
    }

    public void signInWithInvalidCredentials(String username, String password) {

        textboxUsername.sendKeys(username);
        textboxPassword.sendKeys(password);
        buttonSubmit.click();
        Assert.isTrue(message.getText().equals("Invalid Email or password."), "Error message is incorrect");
    }


    @FindBy(xpath = "//*[@class='string email optional form-control']")
    WebElementFacade textboxUsername;

    @FindBy(xpath = "//*[@class='form-control']")
    WebElementFacade textboxPassword;

    @FindBy(xpath = "//*[@value='Submit']")
    WebElementFacade buttonSubmit;

    @FindBy(xpath = "//*[@class='panel-body']")
    WebElementFacade message;
}
