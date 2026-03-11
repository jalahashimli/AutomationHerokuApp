package pages;

import locators.LoginPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(LoginPageLocators.usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(LoginPageLocators.passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(LoginPageLocators.loginButton).click();
        return new SecureAreaPage(driver);
    }
}
