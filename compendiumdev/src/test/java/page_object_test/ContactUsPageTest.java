package page_object_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ContactUsPage;
import page_objects.HomePage;

public class ContactUsPageTest extends BrowserDriver {
    HomePage homePage=null;
    ContactUsPage contactUsPage=null;
    @BeforeMethod
    public void initializeElements(){
        //we are initializing all the webelement ued in page object classes
        homePage = PageFactory.initElements(driver, HomePage.class);
        contactUsPage= PageFactory.initElements(driver, ContactUsPage.class);
    }
    @Test
    public void contactWithValidNameEmailMessage(){
        homePage.clickContact();
        //contactUsPage.setName();
       // contactUsPage.setEmail();
        //contactUsPage.setMessege();
       // contactUsPage.setSendButton();
        //String actualSuccessMessage = contactUsPage.successMessage();
       // Assert.assertEquals(actualSuccessMessage, "Thanks for your question. We'll send you an answer via email to supriti124@mail.com");
        String x = contactUsPage.returnErrorEmplyName();
        String y = "Name is mandatory ";
        Assert.assertEquals(x,y);

    }

}