package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimePage {
    private WebDriver driver;

    public TimePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageHeader() {
        return driver.findElement(By.tagName("h6")).getText();
    }
}
