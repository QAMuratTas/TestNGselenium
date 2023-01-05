package murat.Homework;

import murat.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hw6 extends BaseTest {
    //Go to URL:
    //https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ‘’Invalid credentials’’ is displayed.

    @Test(
            dataProvider = "data"
    )
    public void testInvalidCredentials (String username,String password) throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement name = driver.findElement(By.name("username"));
        name.sendKeys(username);
        WebElement passw = driver.findElement(By.name("password"));
        passw.sendKeys(password);
        WebElement button =driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
        Thread.sleep(5000);

        WebElement invalidControl =driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));

        Assert.assertEquals(invalidControl.getText(),"Invalid credentials");
    }

    @DataProvider
    public Object [][] data (){
return new Object [][] {
        {"eeeee","1254111"},
        {"aaaaa","2541122"},
        {"qqqqq","1254122"},
        {"username","pasword"}
        } ;

    }






}
