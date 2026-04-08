package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class PIMTest extends BaseClass {

    @Test
    public void testPIMPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }
}
