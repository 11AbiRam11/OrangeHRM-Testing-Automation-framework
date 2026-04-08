package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By header = By.tagName("h6");
    private By sideMenuItems = By.className("oxd-main-menu-item");
    private By dashboardWidgets = By.className("orangehrm-dashboard-widget-name");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private void clickSidebarLink(String linkText) {
        By locator = By.xpath("//span[text()='" + linkText + "']/parent::a");
        
        // Correctly use BaseClass to wait for spinner
        BaseClass base = new BaseClass();
        base.driver = this.driver;
        base.waitForLoading();
        
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public int getSideMenuCount() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sideMenuItems));
        return driver.findElements(sideMenuItems).size();
    }

    public boolean isWidgetDisplayed(String widgetName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardWidgets));
        return driver.findElements(dashboardWidgets).stream()
                .anyMatch(w -> w.getText().contains(widgetName));
    }

    public String getHeaderText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).getText();
    }

    public AdminPage clickAdmin() {
        clickSidebarLink("Admin");
        return new AdminPage(driver);
    }

    public PIMPage clickPIM() {
        clickSidebarLink("PIM");
        return new PIMPage(driver);
    }

    public LeavePage clickLeave() {
        clickSidebarLink("Leave");
        return new LeavePage(driver);
    }

    public TimePage clickTime() {
        clickSidebarLink("Time");
        return new TimePage(driver);
    }

    public RecruitmentPage clickRecruitment() {
        clickSidebarLink("Recruitment");
        return new RecruitmentPage(driver);
    }

    public MyInfoPage clickMyInfo() {
        clickSidebarLink("My Info");
        return new MyInfoPage(driver);
    }

    public PerformancePage clickPerformance() {
        clickSidebarLink("Performance");
        return new PerformancePage(driver);
    }

    public DirectoryPage clickDirectory() {
        clickSidebarLink("Directory");
        return new DirectoryPage(driver);
    }

    public ClaimPage clickClaim() {
        clickSidebarLink("Claim");
        return new ClaimPage(driver);
    }

    public BuzzPage clickBuzz() {
        clickSidebarLink("Buzz");
        return new BuzzPage(driver);
    }
}
