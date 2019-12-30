package FacebookPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(linkText = "Forgotten account?")
    static WebElement forgottenAccount;

    @FindBy(linkText = "Create a Page")
    static WebElement CreatePage;

    public static void ForgotAccountLink(){
       forgottenAccount.click();
    }
    public static void CreatePageLink(){
        CreatePage.click();
    }}


