package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseClass {

    @Test(description = "Verify Dashboard header and side menu count")
    public void testDashboardOverview() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertEquals(dashboardPage.getHeaderText(), "Dashboard", "Dashboard header mismatch");
        Assert.assertTrue(dashboardPage.getSideMenuCount() >= 10, "Side menu items count is lower than expected");
    }

    @Test(description = "Verify essential dashboard widgets are present")
    public void testDashboardWidgets() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isWidgetDisplayed("Time at Work"), "Time at Work widget not found");
        Assert.assertTrue(dashboardPage.isWidgetDisplayed("My Actions"), "My Actions widget not found");
    }
}
