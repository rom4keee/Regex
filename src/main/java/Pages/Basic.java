package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Basic extends PageFactory {
    protected WebDriver driver;
    public Basic (WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }
    public Basic() {

    }
    class CustomConditions {
        public static ExpectedCondition < Boolean > jQueryAJAXsCompleted() {
            return driver -> {
                assert driver != null;
                return (Boolean)((JavascriptExecutor) driver)
                        .executeScript("return (window.jQuery != null) && (jQuery.active == 0);");
            };
        }
    }

    public void waitUntilPageIsLoaded() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(CustomConditions.jQueryAJAXsCompleted());
    }
    public String getPageUrl() {
        waitUntilPageIsLoaded();
        return driver.getCurrentUrl();
    }
}
