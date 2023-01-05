package murat.Homework;

import murat.utilities.BaseTestReport;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exercise extends BaseTestReport {



    @Test(
            dataProvider = "getData"
    )
    public void testDemoqaFree(String name,String lName,String email,String number,String date) throws InterruptedException {
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
        WebElement adFrame =driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));
        driver.switchTo().frame(adFrame);

        WebElement adQuit= driver.findElement(By.id("cbb"));
        adQuit.click();
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.switchTo().parentFrame();
        WebElement form = driver.findElement(By.xpath("(//h5)[2]"));
        form.click();
        driver.findElement(By.xpath("(//span[@class='text'])[10]")).click();
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys(name+Keys.TAB+lName+Keys.TAB+email);
        WebElement radioButton = driver.findElement(By.id("gender-radio-1"));
        radioButton.click();
        driver.findElement(By.id("userNumber")).sendKeys(number+Keys.TAB+date+Keys.TAB+"iyi gidyor");








    }

    @DataProvider
    public Object [][] getData(){
        Object [][] data ={
                {"Eyüp","Taş","eyp@cw.com","536222222","13 jun 2013"},
                {"Zehra","Taş","zhr@cw.com","53682222","13 jun 2013"},
                {"Fatma","Taş","ftm@cw.com","53682222","24 jan 1989"},
                {"Murat","Taş","mrt@cw.com","53625222","23 jul 1982"}
        };
        return  data;

}

}
