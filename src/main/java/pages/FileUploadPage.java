package pages;

import locators.FileUploadPageLocators;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(FileUploadPageLocators.uploadButton).click();
    }

    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(FileUploadPageLocators.inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles() {
        return driver.findElement(FileUploadPageLocators.uploadedFiles).getText();
    }
}
