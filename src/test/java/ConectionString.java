import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ConectionString {

    AppiumDriver driver;

    public void initializer(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", System.getProperty("user.dir") + "karma-check.apk");
    }
}
