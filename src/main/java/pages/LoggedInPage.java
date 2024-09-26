package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoggedInPage extends PageObject {

    @FindBy(xpath = "//*[@class='panel-body']")
    WebElementFacade messageSuccessful;

    public String getMessage() {
        return messageSuccessful.getText();
    }

}
