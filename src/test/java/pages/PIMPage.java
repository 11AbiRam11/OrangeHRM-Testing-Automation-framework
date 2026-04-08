package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    private WebDriver driver;

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageHeader() {
        return driver.findElement(By.tagName("h6")).getText();
    }
}
