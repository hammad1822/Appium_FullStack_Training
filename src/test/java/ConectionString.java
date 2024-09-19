import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ConectionString {

    AppiumDriver driver;

    @BeforeTest
    public void initializer() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "0666225172101779");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        //capabilities.setCapability("app", "C:\\Users\\hammad.mahmood\\IdeaProjects\\AppiumProject\\src\\test\\resources\\ApiDemos-debug.apk");
        capabilities.setCapability("app", System.getProperty("user.dir")+"/app/flex-sm-mvp-1-c65ab3-debug.apk");
        // Initialize AndroidDriver
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        System.out.println("Session ID: "+ driver.getSessionId());
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