package AndroidTestsPackage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class AndroidFindElements {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializerDriver("Android");
        WebElement webElement= driver.findElement(AppiumBy.className("android.widget.EditText"));
        System.out.println("Phone number.");
        webElement.sendKeys("2016663333");  // Send phone number to the EditText field
        System.out.println(webElement.getText());

        webElement = driver.findElement(AppiumBy.className("android.widget.Button"));
        System.out.println(webElement.getText());
        webElement.click(); // Click the button

//        WebElement editText = driver.findElement(AppiumBy.className("android.widget.EditText"));
//        System.out.println(editText.getText());
//        System.out.println("Entering phone number...");
//        editText.sendKeys("2016663333");  // Send phone number to the EditText field
//
//        // Find the Button element and click it
//        WebElement button = driver.findElement(AppiumBy.className("android.widget.Button"));
//        System.out.println(button.getText());
//        System.out.println("Clicking the button...");
//        button.click();  // Click the button
    }
}
