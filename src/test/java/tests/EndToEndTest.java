package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;

public class EndToEndTest extends BaseClass {

    @Test(description = "Verify accessibility of all sidebar modules")
    public void testAllModulesAccessibility() {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = loginPage.login("Admin", "admin123");

        // 1. Admin
        Assert.assertEquals(dashboardPage.clickAdmin().getPageHeader(), "Admin");
        
        // 2. PIM
        Assert.assertEquals(dashboardPage.clickPIM().getPageHeader(), "PIM");
        
        // 3. Leave
        Assert.assertEquals(dashboardPage.clickLeave().getPageHeader(), "Leave");
        
        // 4. Time
        Assert.assertEquals(dashboardPage.clickTime().getPageHeader(), "Time");
        
        // 5. Recruitment
        Assert.assertEquals(dashboardPage.clickRecruitment().getPageHeader(), "Recruitment");
        
        // 6. My Info
        Assert.assertEquals(dashboardPage.clickMyInfo().getPageHeader(), "PIM"); // My Info also has PIM header usually
        
        // 7. Performance
        Assert.assertEquals(dashboardPage.clickPerformance().getPageHeader(), "Performance");
        
        // 8. Directory
        Assert.assertEquals(dashboardPage.clickDirectory().getPageHeader(), "Directory");
        
        // 9. Claim
        Assert.assertEquals(dashboardPage.clickClaim().getPageHeader(), "Claim");
        
        // 10. Buzz
        Assert.assertEquals(dashboardPage.clickBuzz().getPageHeader(), "Buzz");
    }
}
