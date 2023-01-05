package murat.Homework;

import murat.utilities.BaseTest;
import org.testng.annotations.Test;

public class hw4 extends BaseTest {
//    Create tests that depend on each other
//    Create beforeClass and set up settings.
//    By creating interdependent tests;
//    First go to Facebook.
//    Then go to Google depending on Facebook,
//    Then go to Amazon depending on Google
//    Close the driver.

@Test
    public void facebookTest(){
    driver.get("https://facebook.com");
}
@Test(dependsOnMethods = {"facebookTest"})
    public void googleTest (){
    driver.get("https://google.com");
}
    @Test(dependsOnMethods = {"googleTest"})
    public void amazonTest (){
        driver.get("https://www.amazon.com");
    }
}
