package smokeTests;

import com.github.javafaker.Faker;
import constant.Constant;
import constant.LoginData;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import testSteps.LoggedInSteps;
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
    LoggedInSteps loggedInSteps;

    @Steps
    Faker faker;

    @Test
    public void testLoginWithFakerCredentials() {
        driver.get(Constant.URL.getUrl());
        openWeatherSteps.verifyIfMainWindowWasOpened();
        openWeatherSteps.openSignIn();
        signInSteps.enterCredentials(faker.internet().emailAddress(), faker.internet().password());
        driver.quit();
    }

    @ParameterizedTest
    @MethodSource({"userData"})
    public void testLogin(String username, String password, boolean flag ) {
        driver.get(Constant.URL.getUrl());
        openWeatherSteps.openSignIn();
        signInSteps.enterCredentials(username, password);
        Assertions.assertTrue(loggedInSteps.verifyMessage(flag));
        driver.quit();
    }

    public static Object[][] userData() {
        return new Object[][] {
                {LoginData.VALID_USER_DATA.getUsername(), LoginData.VALID_USER_DATA.getPassword(), LoginData.VALID_USER_DATA.isFlag()},
                {LoginData.INVALID_USER_DATA.getUsername(), LoginData.INVALID_USER_DATA.getPassword(), LoginData.INVALID_USER_DATA.isFlag()},
                {LoginData.SPECIAL_CHARACTERS.getUsername(), LoginData.SPECIAL_CHARACTERS.getPassword(), LoginData.SPECIAL_CHARACTERS.isFlag()}
        };
    }
}