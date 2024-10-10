package smokeTests;

import com.github.javafaker.Faker;
import constant.Constant;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import testSteps.OpenWeatherHomeSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchTest {

    @Managed
    WebDriver driver;
    @Steps
    OpenWeatherHomeSteps openWeatherHomeSteps;
    @Steps
    Faker faker;

    @Test
    public void searchCityTest() {
        driver.get(Constant.URL.getUrl());
        openWeatherHomeSteps.verifyIfMainWindowWasOpened();
        openWeatherHomeSteps.enterCityInSearchbox(faker.address().cityName());
        openWeatherHomeSteps.selectCity();
        Assertions.assertTrue(openWeatherHomeSteps.isCityDisplayed());
        Assertions.assertTrue(openWeatherHomeSteps.isTemperatureDisplayed());
        Assertions.assertTrue(openWeatherHomeSteps.isDateActual());
        Assertions.assertTrue(openWeatherHomeSteps.isMapDisplayed());
    }
}
