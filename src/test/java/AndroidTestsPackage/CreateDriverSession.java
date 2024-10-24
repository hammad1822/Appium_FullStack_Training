package AndroidTestsPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CreateDriverSession {

    public static AppiumDriver initializerDriver(String platformName) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("newCommandTimeout", 300);
        URL url = new URL("http://localhost:4723");

        switch (platformName) {
            case "Android":
                capabilities.setCapability("deviceName", "0666225172101779");
                capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability("app", System.getProperty("user.dir")+"/app/ApiDemos-debug.apk");
                capabilities.setCapability("noReset", false);
                return new AppiumDriver(url, capabilities);
            case "IOS":
                System.out.println("Write Capabilities for IOS.");
                return new IOSDriver(url, capabilities);
            default:
                throw new Exception("Invalid platform.");
        }
    }
}
