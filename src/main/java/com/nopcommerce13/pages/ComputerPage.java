package com.nopcommerce13.pages;

import com.nopcommerce13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    WebElement computerPageLink;
    @FindBy(className = "page-title")
    WebElement computerText;
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement desktopText;
    @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
    WebElement desktopLink;
    @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/a")
    WebElement notebookLink;
    @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[3]/a")
    WebElement softwareLink;

    public void clickOnComputer(){
        clickOnElement(computerPageLink);
    }
    public String verifyComputerText() {
        log.info("getting text from : "+computerText.toString());
        return getTextFromElement(computerText);
    }
    public String verifydesktopText() {
        log.info("getting text from : "+desktopText.toString());
        return getTextFromElement(desktopText);
    }
    public void clickOnDesktop(){
        clickOnElement(desktopLink);
    }
    public void clickOnNotebook(){
        clickOnElement(notebookLink);
    }
    public void clickOnSoftware(){
        clickOnElement(softwareLink);
    }
}
