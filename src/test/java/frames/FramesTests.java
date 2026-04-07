package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void verifyLeftFrameText() {
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();
        nestedFramesPage.switchToTopFrame();
        nestedFramesPage.switchToLeftFrame();
        String leftFrameText = nestedFramesPage.getTextFromLeftFrame();
        nestedFramesPage.switchToMainArea();

        assertEquals(leftFrameText, "LEFT", "Left frame text is incorrect");
    }

    @Test
    public void verifyBottomFrameText() {
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();
        nestedFramesPage.switchToBottomFrame();
        String bottomFrameText = nestedFramesPage.getTextFromBottomFrame();
        System.out.println(bottomFrameText);
        nestedFramesPage.switchToMainArea();

        assertEquals(bottomFrameText, "BOTTOM", "Bottom frame text is incorrect");
    }
}
