package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class EndToEndTest extends BaseClass {

    @Test
    public void testFullWorkflow() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }
}
