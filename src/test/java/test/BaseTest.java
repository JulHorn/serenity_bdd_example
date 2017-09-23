package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Base class for the general test stuff.
 * **/
@RunWith(SerenityRunner.class)
public class BaseTest {

    /**
     * The webDriver which should be used. Needed here even if it is not directly used.
     * **/
    @Managed(driver = "chrome", uniqueSession = false)
    private WebDriver webDriver;
}
