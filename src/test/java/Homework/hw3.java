package Homework;

import murat.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hw3 extends BaseTest {
//    Test Case1: Positive Login Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username student into Username field
//    Type password Password123 into Password field
//    Puch Submit button.
//            Verify new page URL contains practicetestautomation.com/logged-in-successfully/
//    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
//    Verify button Log out is displayed on the new page.

    @Test
    public void testSoftAsser(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement user =driver.findElement(By.name("username"));
        user.sendKeys("student");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password123");
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"),"url uyuşmadı");

        WebElement msg =driver.findElement(By.xpath("//h1[@class='post-title']"));
        softAssert.assertTrue(msg.isDisplayed(),"mesaj görüntülenmedi");
        softAssert.assertTrue(msg.getText().contains("Logged In Successfully"));
        WebElement logout =driver.findElement(By.xpath("//a[.='Log out']"));
        logout.click();
        WebElement homepageControl = driver.findElement(By.xpath("//h2"));
        softAssert.assertTrue(homepageControl.isDisplayed());
        softAssert.assertAll();
    }
}
