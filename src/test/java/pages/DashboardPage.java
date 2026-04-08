package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    private By header = By.tagName("h6");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        return driver.findElement(header).getText();
    }

    public AdminPage clickAdmin() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        return new AdminPage(driver);
    }

    public PIMPage clickPIM() {
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        return new PIMPage(driver);
    }

    public LeavePage clickLeave() {
        driver.findElement(By.xpath("//span[text()='Leave']")).click();
        return new LeavePage(driver);
    }

    public TimePage clickTime() {
        driver.findElement(By.xpath("//span[text()='Time']")).click();
        return new TimePage(driver);
    }
}
