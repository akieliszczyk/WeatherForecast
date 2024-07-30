package smokeTests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

@ExtendWith(SerenityJUnit5Extension.class)
public class SignInTest extends PageObject {

    @Managed
    WebDriver driver;

    @Steps
    HomePage homePage;

    String url = "https://openweathermap.org/";
    String validUsername = "kurszewska.anna@gmail.com";
    String validPassword = "P@ss1234";
    String invalidUsername = "Ania";
    String invalidPassword = "Ania@1234";
    String specCharacters = "@#$%^&*!";

    @Test
    public void testLoginWithInvalidCredentials() {
        driver.get(url);
        homePage.verifyIfMainWindowWasOpened();
        homePage.signInWithInvalidCredentials(invalidUsername, invalidPassword);

    }

    @Test
    public void testLoginWithValidCredentials() {
        driver.get(url);
        homePage.verifyIfMainWindowWasOpened();
        homePage.signInWithValidCredentials(validUsername, validPassword);

    }

    @Test
    public void testLoginWithSpecialCharacters() {
        driver.get(url);
        homePage.verifyIfMainWindowWasOpened();
        homePage.signInWithSpecialCharacters(specCharacters);

    }
}
