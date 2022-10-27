import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {
    protected static WebDriver chromeDriver = new ChromeDriver();
    @BeforeAll
    static void setUp() {
        chromeDriver.get("https://www.epam.com/about/who-we-are/contact");
        chromeDriver.manage().window();
    }
}