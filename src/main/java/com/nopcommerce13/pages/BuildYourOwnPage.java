package com.nopcommerce13.pages;

import com.nopcommerce13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public BuildYourOwnPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//h2[@class='product-title']//a[text()='Build your own computer']")
    WebElement byocLink;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement Processor;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement Ram;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd400gb;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd320gb;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osVistaraHome;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osVistaraPremium;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMsOff;
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcroRead;
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotCom;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addCart;
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement shoppingCart;


    public void clickOnByoc(){
        Reporter.log("Click on Build ur own " + byocLink.toString());
        clickOnElement(byocLink);
    }
    public void selectProcessor(int value){
        selectByValueFromDropDown(Processor, String.valueOf(value));
    }
    public void selectRam(int value){
        selectByValueFromDropDown(Ram, String.valueOf(value));
    }
    public void select400gbHdd(){
        Reporter.log("Clicking on Hdd " + hdd400gb.toString());
        clickOnElement(hdd400gb);
    }
    public void select320gbhdd(){
        clickOnElement(hdd320gb);
    }
    public void selectOsVistaraHome(){
        Reporter.log("Clicking on Os " + osVistaraHome.toString());
        clickOnElement(osVistaraHome);
    }
    public void selectOsVistaraPremium(){
        Reporter.log("Clicking on Os " + osVistaraPremium.toString());
        clickOnElement(osVistaraPremium);
    }
    public void selectSoftwareMsOff(){
        Reporter.log("clicking on Software " + softwareMsOff.toString());
        clickOnElement(softwareMsOff);
    }
    public void selectSoftwareAcroRead(){
        Reporter.log("clicking on Software " + softwareAcroRead.toString());
        clickOnElement(softwareAcroRead);
    }
    public void selectSoftwareTotal(){
        Reporter.log("clicking on Software " + softwareTotCom.toString());
        clickOnElement(softwareTotCom);
    }
    public void clickOnAddCArt(){
        Reporter.log("Clocking on AddCart" + addCart.toString());
        clickOnElement(addCart);
    }
    public String verifyOrder(){
        return getTextFromElement(shoppingCart);
    }
}

