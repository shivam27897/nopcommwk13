package com.nopcommerce13.testsuite;

import com.nopcommerce13.pages.BuildYourOwnPage;
import com.nopcommerce13.pages.ComputerPage;
import com.nopcommerce13.propertyreader.PropertyReader;
import com.nopcommerce13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ComputerPageTestWithDataProvider extends TestBase {

    ComputerPage computer;
    BuildYourOwnPage Byoc;
    @BeforeMethod
    public void inIt() {
        computer  = new ComputerPage();
        Byoc  = new BuildYourOwnPage();
    }
    @Test
    public void dataSet1(){
        computer.clickOnComputer();
        computer.clickOnDesktop();
        Byoc.clickOnByoc();
        Byoc.selectProcessor(1);
        Byoc.selectRam(3);
        Byoc.select400gbHdd();
        Byoc.selectOsVistaraHome();
        Byoc.selectSoftwareMsOff();
    }
    @Test
    public void dataSet2(){
        computer.clickOnComputer();
        computer.clickOnDesktop();
        Byoc.clickOnByoc();
        Byoc.selectProcessor(2);
        Byoc.selectRam(4);
        Byoc.select320gbhdd();
        Byoc.selectOsVistaraPremium();
        Byoc.selectSoftwareAcroRead();
    }
    @Test
    public void dataSet3(){
        computer.clickOnComputer();
        computer.clickOnDesktop();
        Byoc.clickOnByoc();
        Byoc.selectProcessor(2);
        Byoc.selectRam(5);
        Byoc.select320gbhdd();
        Byoc.selectOsVistaraHome();
        Byoc.selectSoftwareTotal();
    }

    @AfterMethod
    public void tearDown(){
        Byoc.clickOnAddCArt();
        String actualMessage = Byoc.verifyOrder();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage,expectedMessage,"order verfied");
        //closeBrowser();
    }

}
