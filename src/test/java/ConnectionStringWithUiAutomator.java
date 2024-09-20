import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionStringWithUiAutomator {
    AppiumDriver driver;

    @BeforeTest
    public void initializer() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("0666225172101779")
                .setAutomationName("UiAutomator2")
                .setApp(System.getProperty("user.dir")+"/app/flex-sm-mvp-1-c65ab3-debug.apk");

        URL url = new URL("http://localhost:4723");
        driver = new AndroidDriver(url, options);
        System.out.println("Opening Appium Server using Option Class");
    }

    @Test
    public void sampleTest(){
        System.out.println("This is my first sample test");
    }

    @AfterTest
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
