package pages;

import locators.FramesPageLocators;
import locators.NestedFramesPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    private WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToTopFrame() {
        driver.switchTo().frame(driver.findElement(NestedFramesPageLocators.topFrame));
    }

    public void switchToLeftFrame() {
        driver.switchTo().frame(driver.findElement(NestedFramesPageLocators.leftFrame));
    }

    public void switchToBottomFrame() {
        driver.switchTo().frame(driver.findElement(NestedFramesPageLocators.bottomFrame));
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public String getTextFromLeftFrame() {
        WebElement leftFrameBody = driver.findElement(NestedFramesPageLocators.body);
        return leftFrameBody.getText();
    }

    public String getTextFromBottomFrame() {
        WebElement bottomFrameBody = driver.findElement(NestedFramesPageLocators.body);
        return bottomFrameBody.getText();
    }
}
