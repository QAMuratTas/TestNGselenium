package murat.Homework;

import murat.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hw7 extends BaseTest {
          /*
Open the site http://opencart.abstracta.us/
Using the Search function do it with Data Provider for Mac, iPad and Samsung
     */


    @Test(
            dataProvider = "productMethod"
    )
    public void opencart(String product) {
        driver.get("http://opencart.abstracta.us");
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys(product + Keys.ENTER);



    }
    @DataProvider(name="productMethod")
    public Object[][] data () {
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}

        };


    }
}