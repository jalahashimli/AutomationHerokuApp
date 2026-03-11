package pages;

import locators.HorizontalSliderLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(Keys key) {
        driver.findElement(HorizontalSliderLocators.horizontalSlider).sendKeys(key);
    }

    public double getValueOfSlider() {
      return Double.parseDouble(driver.findElement(HorizontalSliderLocators.range).getText());
    }

    public void setSliderValue(double targetValue) {
        var slider = driver.findElement(HorizontalSliderLocators.horizontalSlider);

        double currentValue = getValueOfSlider();

        while(currentValue < targetValue) {
           slider.sendKeys(Keys.ARROW_RIGHT);
           currentValue = getValueOfSlider();
       }
    }





}
