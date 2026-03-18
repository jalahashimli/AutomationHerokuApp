package context;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
   @Test
    public void verifyAlertTextAfterRightClick() {
       var contextMenuPage = homePage.clickContextMenu();
       contextMenuPage.rightClickContextMenu();
       String text = contextMenuPage.getAlertText();
       assertEquals(text, "You selected a context menu", "Alert text is incorrect");
       contextMenuPage.alertClickToAccept();
   }
}
