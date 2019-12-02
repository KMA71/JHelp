package basetest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SetUpEnv {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebDriverWait longWait;

    @BeforeEach
    void setup() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        longWait = new WebDriverWait(driver, 60);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }


}
