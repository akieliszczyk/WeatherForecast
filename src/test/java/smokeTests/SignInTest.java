package smokeTests;

import config.BaseTest;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import testSteps.OpenWeatherSteps;
import testSteps.SignInSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class SignInTest extends BaseTest {

    @Managed
    WebDriver driver;

    @Steps
    OpenWeatherSteps openWeatherSteps;
    SignInSteps signInSteps;



    final String url = "https://openweathermap.org/";
    final String validUsername = "kurszewska.anna@gmail.com";
    final String validPassword = "P@ss1234";
    final String invalidUsername = "Ania";
    final String invalidPassword = "Ania@1234";
    final String specCharacters = "@#$%^&*!";

    @Test
    public void testLoginWithInvalidCredentials() {
        driver.get(url);
        openWeatherSteps.verifyIfMainWindowWasOpened();
        openWeatherSteps.openSignIn();
        signInSteps.verifyIfSignInPageWasOpened();
        signInSteps.enterCredentials(invalidUsername, invalidPassword);

    }

    @Test
    public void testLoginWithValidCredentials() {
        driver.get(url);
        openWeatherSteps.openSignIn();
        signInSteps.enterCredentials(validUsername, validPassword);

    }

    @Test
    public void testLoginWithSpecialCharacters() {
        driver.get(url);
        openWeatherSteps.openSignIn();
        signInSteps.enterCredentials(specCharacters, specCharacters);

    }
}
