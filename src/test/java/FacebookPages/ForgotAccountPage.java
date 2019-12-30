package FacebookPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotAccountPage {
    @FindBy(xpath  = "//div[contains(.,'Find Your Account')]")
    static WebElement findYourAccount;

    public static void findYourAccount(){
        Assert.assertEquals(true,findYourAccount.isDisplayed());
        System.out.println("I am in Find your account page");
}}
