package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInPage extends PageObject {

    @FindBy(xpath = "//*[@class='first-child']")
    WebElementFacade textSignIn;

    @FindBy(xpath = "//*[@class='string email optional form-control']")
    WebElementFacade textboxUsername;

    @FindBy(xpath = "//*[@class='form-control']")
    WebElementFacade textboxPassword;

    @FindBy(xpath = "//*[@value='Submit']")
    WebElementFacade buttonSubmit;

    @FindBy(xpath = "//*[@class='panel-body']")
    WebElementFacade message;

    public void verifyIfSignInPageWasOpened() {
        textSignIn.isDisplayed();
        System.out.println(textSignIn.getText());
    }

    public void enterUsername(String username) {
        textboxUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        textboxPassword.sendKeys(password);
    }

    public void clickSubmit() {
        buttonSubmit.click();
    }

    public String getMessage() {
        return message.getText();
    }
}
