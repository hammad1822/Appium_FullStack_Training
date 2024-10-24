package AndroidGestures;

import AndroidTestsPackage.CreateDriverSession;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class GesturesAndroid {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializerDriver("Android");
        //longClickGestureByID(driver);
        longClickGestureByCoordinates(driver);
    }

    public static void longClickGestureByID(AppiumDriver driver){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement longClick = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        // Java
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) longClick).getId(),
                "duration", 1000
        ));
    }

    //Locate element by X and Y coordinates are not recommended as the mobile screen size may vary device to device
    public static void longClickGestureByCoordinates(AppiumDriver driver){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement longClickByCoordinates = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        // Java
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "x", 160,
                "y", 444,
                "duration", 1000
        ));
    }
}
