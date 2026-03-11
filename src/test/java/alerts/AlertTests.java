package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
       var alertsPage = homePage.clickJavaScriptAlerts();
       alertsPage.triggerAlert();
       alertsPage.alertClickToAccept();
       assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Results text is incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alertGetText();
        alertsPage.alertClickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text is incorrect");
    }

    @Test
    public void testSetInputInAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!";
        alertsPage.alertSetInput(text);
        alertsPage.alertClickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text is incorrect");
    }
}
