package com.nopcommerce13.testbase;

import com.nopcommerce13.propertyreader.PropertyReader;
import com.nopcommerce13.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
      //  closeBrowser();
    }
}
