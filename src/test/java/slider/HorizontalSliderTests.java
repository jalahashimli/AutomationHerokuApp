package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testValueOfSlider() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue(4);
        assertEquals(horizontalSliderPage.getValueOfSlider(), 4, "Value of the slider is different than 4");
    }
}
