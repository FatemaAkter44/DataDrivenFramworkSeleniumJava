package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {
    WebDriver driver= null;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cssmenu\"]/ul/li[5]/a")
    WebElement about;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cssmenu\"]/ul/li[6]/a")
    WebElement contact;
    public void clickContact(){
     contact.click();
     TestLogger.log("Clicked on Contact button");
     //return getpageTitle();

    }
    public void clickAbout(){
        about.click();
        TestLogger.log("Clicked on Contact button");
        driver.getTitle();
        //getpageTitle();
        //return getpageTitle();
    }
    /*public String getpageTitle(){
        String pageTitale= driver.getTitle();
        TestLogger.log("page title"+pageTitale);
        return pageTitale;
    }*/


}
