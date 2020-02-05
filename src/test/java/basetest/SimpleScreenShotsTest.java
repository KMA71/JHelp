package basetest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.opentest4j.AssertionFailedError;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleScreenShotsTest extends SetUpEnv{

    String testName = "Имя теста";
    @Test
    @DisplayName("Имя теста")
    void getScreen() {
        //some site, for example google.com
        driver.get("https://www.google.com/");

//пример, как можно делать скриншот только при аsert false
//при необходимости ловить ошибки webdriver-a можно заворачивать в try/catch более крупные блоки или весь тест по аналогии
        try {
            assertTrue(true);
        } catch (AssertionFailedError e) {
            Object o = new Object(){};
            e.printStackTrace();
            Loggers.getScreenShot(driver, o);
            throw new AssertionFailedError();
        }

    }

}
