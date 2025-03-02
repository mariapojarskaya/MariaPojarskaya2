package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static java.lang.System.setProperty;

public class TestBase {

    private long time;
    public static final String token = "@#$%^&*(!@";

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        setProperty("webdriver.chrome.driver", "src/chromedriver");

    }

    //src\main\resources\chromedriver.exee
    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        System.out.println(System.currentTimeMillis());
    }
}
