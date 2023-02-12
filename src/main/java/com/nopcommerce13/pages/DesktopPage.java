package com.nopcommerce13.pages;

import com.nopcommerce13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public DesktopPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktopOption;
    @FindBy(xpath = "//div[@class='product-sorting']")
    WebElement sortOption;
    @FindBy(xpath = "//div[@class='product-page-size']")
    WebElement displayViewOption;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement selectDisplay;
    @FindBy(xpath = "//div[@class='item-grid']")
    WebElement selectItems;


    public void clickOnDesktop() {
       clickOnElement(desktopOption);
    }
    public void clickOnSortOption() {
        clickOnElement(sortOption);
    }
    public void clickOnDisplayviewOption(){
        clickOnElement(displayViewOption);
    }
    public void clickOnSelectdisplay(){
        clickOnElement(selectDisplay);
    }
    public void clickOnselectItem(){
        clickOnElement(selectItems);
    }

}
