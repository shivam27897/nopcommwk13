package com.nopcommerce13.testsuite;


import com.nopcommerce13.pages.HomePage;
import com.nopcommerce13.pages.LoginPage;
import com.nopcommerce13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLogin();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.verifWelcomText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test
    public void verifyErrorWithInValidCredentials(){
        homePage.clickOnLogin();
        loginPage.enterEmailField("abcd@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickOnLoginButton();
        String actual=loginPage.verifyErroreMsg();
        String expected= "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual,expected,"error message with inavalid credentials");
    }
    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLogin();
        loginPage.enterEmailField("tom12345@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickOnLoginButton();
        String actual = loginPage.verifyLogoutText();
        String expected = "Log out";
        Assert.assertEquals(actual, expected, "Log out");
    }
    @Test
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLogin();
        loginPage.enterEmailField("tom12345@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogout();
        String actual = homePage.loginLinkText();
        String expected = "Log in";
        Assert.assertEquals(actual, expected, "Log in");
    }

}