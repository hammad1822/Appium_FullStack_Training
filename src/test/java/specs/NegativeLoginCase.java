package specs;

import base.AppFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class NegativeLoginCase {
    @Test
    public void TestingDriverInitialize() throws InterruptedException {

        String username = "standard_user";
        String password = "secret_1234";
        LoginPage loginPage = new LoginPage();

        loginPage.enterUserName(username);
        loginPage.enterPassword(password);

        loginPage.clickLoginButton();

        Thread.sleep(5000);
    }
}
