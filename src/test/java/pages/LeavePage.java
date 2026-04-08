package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
    private WebDriver driver;

    public LeavePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageHeader() {
        return driver.findElement(By.tagName("h6")).getText();
    }
}
