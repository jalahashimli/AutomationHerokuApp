package pages;

import locators.KeyPressesPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(KeyPressesPageLocators.inputField).sendKeys(text);
    }

    public void enterPi() {
        enterText(Keys.chord(Keys.ALT, "p" + "=3.14"));
    }

    public String getResult() {
        return driver.findElement(KeyPressesPageLocators.resultText).getText();
    }
}
