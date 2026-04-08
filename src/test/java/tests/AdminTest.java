package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AdminPage;

public class AdminTest extends BaseClass {

    @Test
    public void testAdminPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        // Navigation logic could be added here
    }
}
