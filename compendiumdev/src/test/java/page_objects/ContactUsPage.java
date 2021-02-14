package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;

public class ContactUsPage {
    @FindBy(how =How.XPATH, using = "//*[@id=\"135container\"]")
    WebElement name;
    @FindBy(how =How.ID, using = "137input")
    WebElement email;
    @FindBy(how =How.ID, using = "139area")
    WebElement message;
    @FindBy(how =How.ID, using = "139errorIcon")
    WebElement attachFile;
    @FindBy(how = How.ID,using = "sendiconDiv")
    WebElement sendButton;
    @FindBy(how =How.XPATH, using = "//*[@id=\"135errorMessage\"]")
    WebElement nameError;
    @FindBy(how =How.ID, using = "137errorMessage")
    WebElement emailError;
    @FindBy(how =How.ID, using = "139errorMessage")
    WebElement messageError;
    @FindBy(how =How.XPATH, using = "//div[@class =\"SuccessMessage\"]")
    WebElement successMessage;
    public void setName(){
        TestLogger.log("sending text to name field.");
        name.sendKeys("Alisha Mustafa");
    }
    public void setEmail(){
        TestLogger.log("sending text to Email field.");
        email.sendKeys("Alisha Mustafa97@gmail.com");
    }
    public void setMessege(){
        TestLogger.log("sending text to message field.");
        message.sendKeys("Alisha Mustafa wants to text you.");
    }
    public void setAttachFile() throws IOException {
        TestLogger.log("Attach a file.");
        attachFile.click();
        Runtime.getRuntime().exec("C:\\Users\\Fatema Akter\\Desktop\\fileUplodeUsingAutoITdataDrivenFrameworkSeleniumJava.exe");
    }
    public void setSendButton(){
        TestLogger.log("click on send button");
        sendButton.click();
    }
    public String returnErrorEmplyName(){
        String messege = nameError.getText();
        return messege;
    }
    public String returnErrorEmplyEmai(){
        String messege = emailError.getText();
        return messege;
    }
    public String returnErrorEmplyMessage(){
        String messege = messageError.getText();
        return messege;
    }
    public String successMessage(){
        String messege = successMessage.getText();
        return messege;
    }







}
