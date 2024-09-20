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
        capabilities.setCapability("onReset", false);
        //Handle timeout
//        capabilities.setCapability("newCommandTimeout", 120);
//        // To automatically start the emulator device
//        capabilities.setCapability("avd","Pixel_7_Pro_API_33");
//        capabilities.setCapability("avdLaunchTimeout", 300000);
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
        //Code to quit driver only.
        if (driver != null) {
            driver.quit();
        }

        //code to quit driver and emulator both after the test execution
//        String cmdString = "adb -s emulator-5554 emu kill";
//        if (null != driver) {
//            try {
//                Runtime.getRuntime().exec("CMD /C " + cmdString);
//                driver.quit();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}