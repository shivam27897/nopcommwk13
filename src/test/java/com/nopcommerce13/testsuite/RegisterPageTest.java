package com.nopcommerce13.testsuite;

import com.nopcommerce13.pages.HomePage;
import com.nopcommerce13.pages.RegisterPage;
import com.nopcommerce13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test
    public void userNavigateToRegisterPageSuccessFully(){
        homePage.clickOnLogin();
        homePage.clickOnRegister();
        String actualMessage= registerPage.verifyRegisterText();
        String expectedMessage = "Register";
        Assert.assertEquals(actualMessage,expectedMessage,"Register verfied");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnLogin();
        homePage.clickOnRegister();
        registerPage.clickOnRegisterButton();

        String actualMessage1=registerPage.verifyfirstNameError();
        String expedctedMessage1 = "First name is required.";
        Assert.assertEquals(actualMessage1,expedctedMessage1,"Error verified");

        String actualMessage2=registerPage.verifyLastNameError();
        String expedctedMessage2 = "Last name is required.";
        Assert.assertEquals(actualMessage2,expedctedMessage2,"Error verified");

        String actualMessage3=registerPage.verifyemailErrorr();
        String expedctedMessage3 = "Email is required.";
        Assert.assertEquals(actualMessage3,expedctedMessage3,"Error verified");

        String actualMessage4=registerPage.verifyPasswordErrorr();
        String expedctedMessage4 = "Password is required.";
        Assert.assertEquals(actualMessage4,expedctedMessage4,"Error verified");

        String actualMessage5=registerPage.verifyConfirmPasswordErrorr();
        String expedctedMessage5 = "Password is required.";
        Assert.assertEquals(actualMessage5,expedctedMessage5,"Error verified");
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnLogin();
        homePage.clickOnRegister();
        registerPage.clicckOnGenderCheckbox();
        registerPage.enterFirstname("Alex");
        registerPage.enterLastname("coles");
        registerPage.selectDay(27);
        registerPage.selectMonth(8);
        registerPage.selectYear(1997);
        registerPage.enterEmail("zxc34vy@gmail.com");
        registerPage.enterPassword("123456777");
        registerPage.enterConfirmPassword("123456777");
        registerPage.clickOnRegisterButton();
        String actualMessage= registerPage.verifyRegisterCompleted();
        String expectedMessage = "Your registration completed";
        Assert.assertEquals(actualMessage,expectedMessage,"Registration complete verfied");
    }
}