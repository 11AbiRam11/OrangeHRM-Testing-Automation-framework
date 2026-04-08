package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By header = By.tagName("h6");
    private By usernameSearchInput = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By addButton = By.xpath("//button[normalize-space()='Add']");
    private By userRoleDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    private By employeeNameInput = By.xpath("//input[@placeholder='Type for hints...']");
    private By statusDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    private By saveButton = By.xpath("//button[@type='submit']");
    private By recordsCount = By.xpath("//span[@class='oxd-text oxd-text--span']");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getPageHeader() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).getText();
    }

    public void searchUserByUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameSearchInput)).sendKeys(username);
        driver.findElement(searchButton).click();
    }

    public String getRecordsFoundText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(recordsCount)).getText();
    }

    public void clickAddUser() {
        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
    }
}
