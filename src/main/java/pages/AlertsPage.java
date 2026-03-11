package pages;

import locators.AlertsPageLocators;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(AlertsPageLocators.triggerAlertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(AlertsPageLocators.triggerConfirmButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(AlertsPageLocators.triggerPromptButton).click();
    }

    public void alertClickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alertClickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String alertGetText() {
        return driver.switchTo().alert().getText();
    }

    public void alertSetInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(AlertsPageLocators.results).getText();
    }
}
