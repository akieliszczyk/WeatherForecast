package config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    WebDriver driver;

    @BeforeEach
    public void openPage() {
     //   TODO open url
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}
