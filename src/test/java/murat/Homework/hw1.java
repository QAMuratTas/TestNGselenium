package murat.Homework;

import murat.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hw1 extends BaseTest {
//    Test Case3: Negative Password Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username student into Username field.
//    Type password incorrectPassword into Password field.
//    Push Submit button.
//    Verify error message is displayed.
//    Verify error message text is Your password is invalid!

    @Test
    public void testSoftAsser(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement user =driver.findElement(By.name("username"));
        user.sendKeys("student");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123654123");
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        SoftAssert softAssert = new SoftAssert();
        WebElement msg =driver.findElement(By.id("error"));
        softAssert.assertTrue(msg.isDisplayed(),"mesaj görüntülenmedi");
        softAssert.assertTrue(msg.getText().contains("Your username is invalid!"));
    }
}
