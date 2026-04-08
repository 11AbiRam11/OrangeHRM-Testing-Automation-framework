package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PerformancePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By header = By.tagName("h6");
    private By employeeNameInput = By.xpath("//input[@placeholder='Type for hints...']");

    public PerformancePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getPageHeader() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).getText();
    }
}
