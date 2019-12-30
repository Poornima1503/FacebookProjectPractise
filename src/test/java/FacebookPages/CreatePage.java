package FacebookPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePage {
    @FindBy(xpath = "//div[contains(.,'Create a Page')]")
    static WebElement CreateAPage;

    public static void CreateAPage(){
        Assert.assertEquals(true,CreateAPage.isDisplayed());
    }
}
