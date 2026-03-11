package locators;

import org.openqa.selenium.By;

public class AlertsPageLocators {
    public static By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    public static By results = By.id("result");
    public static By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    public static By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
}
