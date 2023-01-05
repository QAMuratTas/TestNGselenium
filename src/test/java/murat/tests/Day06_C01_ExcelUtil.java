package murat.tests;

import murat.utilities.BaseCrossBrowserTest;
import murat.utilities.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.time.Duration;

public class Day06_C01_ExcelUtil  extends BaseCrossBrowserTest {

    @Test
    public void test() throws FileNotFoundException  {

        String path = "C:\\Users\\MURAT\\IdeaProjects\\TestNGSelenium\\src\\test\\java\\murat\\resources\\testdata.xlsx";
        ExcelUtils eu =new ExcelUtils(path,2);
        driver.get("http://crossbrowsertesting.github.io/login-form.html");
        String email =eu.getCellData(1,0);
        String password =eu.getCellData(1,1);
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      WebElement welcome = driver.findElement(By.tagName("//h2[contains(.,'Welcome')"));
      wait.until(ExpectedConditions.visibilityOf(welcome));
        Assert.assertTrue(welcome.getText().contains(email));


    }


}
