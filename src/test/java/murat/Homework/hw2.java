package murat.Homework;

import murat.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hw2 extends BaseTest {
//    Test Case2: Negative Username Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username incorrectUser into Username field.
//    Type password Password123 into Password field.
//    Puch Submit button.
//    Verify error message is displayed.
//    Verify error message text is Your username is invalid
@Test
public void testSoftAsser(){
    driver.get("https://practicetestautomation.com/practice-test-login/");
    WebElement user =driver.findElement(By.name("username"));
    user.sendKeys("murat");
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Password123");
    WebElement button = driver.findElement(By.id("submit"));
    button.click();
    SoftAssert softAssert = new SoftAssert();
    WebElement msg =driver.findElement(By.id("error"));
    softAssert.assertTrue(msg.isDisplayed(),"mesaj görüntülenmedi");
    softAssert.assertTrue(msg.getText().contains("Your username is invalid!"),"Error");
    softAssert.assertAll();
}

}
