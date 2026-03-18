package pages;

import locators.ContextMenuPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickContextMenu() {
        Actions action = new Actions(driver);
        WebElement box = driver.findElement(ContextMenuPageLocators.box);
        action.contextClick(box).perform();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void alertClickToAccept() {
        driver.switchTo().alert().accept();
    }
}
