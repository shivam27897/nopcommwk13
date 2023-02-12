package com.nopcommerce13.testsuite;

import com.nopcommerce13.pages.BuildYourOwnPage;
import com.nopcommerce13.pages.ComputerPage;
import com.nopcommerce13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    ComputerPage computer;
    BuildYourOwnPage Byoc;

    @BeforeMethod
    public void inIt() {
        computer =new ComputerPage();
        Byoc=new BuildYourOwnPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        computer.clickOnComputer();
        String actualMessage = computer.verifyComputerText();
        String expectedMessage = "Computers";
        Assert.assertEquals(actualMessage,expectedMessage,"Computers verfied");
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computer.clickOnComputer();
        computer.clickOnDesktop();
        String actualMessage = computer.verifydesktopText();
        String expectedMessage = "Desktops";
        Assert.assertEquals(actualMessage,expectedMessage,"Desktops verfied");
    }
    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(){
        computer.clickOnComputer();
        computer.clickOnDesktop();
        Byoc.clickOnByoc();
        Byoc.selectProcessor(1);
        Byoc.selectRam(4);
        Byoc.select400gbHdd();
        Byoc.selectOsVistaraHome();
        Byoc.selectSoftwareMsOff();
        Byoc.clickOnAddCArt();
        String actualMessage = Byoc.verifyOrder();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage,expectedMessage,"order verfied");

    }
}