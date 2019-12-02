package basetest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleScreenShotsTest extends SetUpEnv{

    String testName = "Имя теста";
    @Test
    @DisplayName("Имя теста")
    void getScreen() {
        //some site, for example google.com
        driver.get("https://www.google.com/");

        try {
            Files.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).toPath(), new File(".\\src\\test\\screenshots\\"
                    + (System.currentTimeMillis()) + "_" + testName + ".png").toPath());
        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("Со скриншотом что-то не задалось...");
            System.out.println(e.getMessage());
        }
    }

}
