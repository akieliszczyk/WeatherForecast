package smokeTests;

import com.github.javafaker.Faker;
import model.Constant;
import model.ProgramData;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import provider.UserDataProvider;
import testSteps.OpenWeatherSteps;
import testSteps.SignInSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class SignInTest {

    @Managed
    WebDriver driver;
    @Steps
    OpenWeatherSteps openWeatherSteps;
    @Steps
    SignInSteps signInSteps;
    @Steps
    Constant constant;
    @Steps
    Faker faker;
    ProgramData programData;

    @Test
    public void testLoginWithInvalidCredentials() {
        driver.get(constant.getUrl());
        openWeatherSteps.verifyIfMainWindowWasOpened();
        openWeatherSteps.openSignIn();
        signInSteps.enterCredentials(faker.internet().emailAddress(), faker.internet().password());
        driver.quit();
    }

    @Test
    public void testLoginWithValidCredentials() {
        driver.get(constant.getUrl());
        openWeatherSteps.openSignIn();
        signInSteps.enterCredentials(constant.getValidUsername(), constant.getValidPassword());
        driver.quit();
    }

    @Test
    public void testLoginWithSpecialCharacters() {
        driver.get(constant.getUrl());
        programData = UserDataProvider.specialCharactersData();
        openWeatherSteps.openSignIn();
        signInSteps.enterCredentials(programData.getInvalidUsername(), programData.getInvalidPassword());
        driver.quit();
    }
}
