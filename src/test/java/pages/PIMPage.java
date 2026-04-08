package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PIMPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By employeeNameInput = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By addButton = By.xpath("//button[normalize-space()='Add']");
    private By firstNameInput = By.name("firstName");
    private By lastNameInput = By.name("lastName");
    private By saveButton = By.xpath("//button[@type='submit']");
    private By successToast = By.xpath("//div[@id='oxd-toaster_1']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchEmployeeByName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(employeeNameInput)).sendKeys(name);
        driver.findElement(searchButton).click();
    }

    public void clickAddEmployee() {
        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
    }

    public void addNewEmployee(String firstName, String lastName) {
        clickAddEmployee();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(saveButton).click();
    }

    public String getPageHeader() {
        return driver.findElement(By.tagName("h6")).getText();
    }
}
