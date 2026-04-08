package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TimeTest extends BaseClass {

    @Test
    public void testTimePage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }
}
