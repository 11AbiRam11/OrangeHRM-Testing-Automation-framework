package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LeaveTest extends BaseClass {

    @Test
    public void testLeavePage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }
}
