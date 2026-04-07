package pages;

import locators.FramesPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    private WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames() {
        driver.findElement(FramesPageLocators.iframe).click();
        return new NestedFramesPage(driver);
    }
}
