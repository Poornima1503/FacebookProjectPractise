package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigFileReader;

public class CucumberHooks {
    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        ConfigFileReader cfr = new ConfigFileReader();

        System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}


