package com.nopcommerce13.pages;

import com.nopcommerce13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "Email")
    WebElement emailfield;
    @FindBy(name = "Password")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMsg;
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutText;


    public void enterEmailField (String email){
        sendTextToElement(emailfield,email);
    }
    public void enterPassword (String pass){
        sendTextToElement(passwordField,pass);
    }
    public void clickOnLoginButton (){
        clickOnElement(loginButton);
    }
    public String verifWelcomText (){
        log.info("getting Text From : "+welcomeText);
        return getTextFromElement(welcomeText);
    }
    public String verifyErroreMsg (){
        log.info("getting Text From : "+errorMsg);
        return getTextFromElement(errorMsg);
    }
    public String verifyLogoutText (){
        log.info("getting Text From : "+logoutText);
        return getTextFromElement(logoutText);
    }
}
