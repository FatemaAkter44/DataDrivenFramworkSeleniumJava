package page_object_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ContactUsPage;
import page_objects.HomePage;

public class HomePageTest extends BrowserDriver {
    HomePage homePage=null;
    @BeforeMethod
    public void initializeElements(){
        //we are initializing all the webelement ued in page object classes
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    /*@Test
    public void clickAboutPage(){
        homePage.getpageTitle();
        String actualValue = homePage.getpageTitle();
        String expectedValue = "About Us";
        Assert.assertEquals(actualValue,expectedValue);
    }*/
}
