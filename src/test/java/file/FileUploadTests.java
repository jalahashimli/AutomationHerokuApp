package file;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\Jala\\Pictures\\Screenshots\\Screenshot 2025-12-25 172546 - Copy.png");
        assertEquals(fileUploadPage.getUploadedFiles(), "Screenshot 2025-12-25 172546 - Copy.png", "Uploaded file is incorrect");
    }
}
