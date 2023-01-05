package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import murat.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TeamFrame extends BaseTest {

    @Test
    public void frame() throws InterruptedException {
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
        WebElement adFrame =driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));
        driver.switchTo().frame(adFrame);

        WebElement adQuit= driver.findElement(By.id("cbb"));
        adQuit.click();
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.switchTo().parentFrame();
        WebElement frame = driver.findElement(By.xpath("(//h5)[3]"));
        frame.click();

        WebElement frameButton =driver.findElement(By.xpath("(//li[@id='item-2'])[2]"));
        frameButton.click();
        WebElement text1 =driver.findElement(By.id("framesWrapper"));
        System.out.println(text1.getText());

        WebElement frame2 =driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame2);

        WebElement text2 =driver.findElement(By.id("sampleHeading"));
        System.out.println(text2.getText());

        driver.switchTo().parentFrame();
        WebElement frame3 =driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame3);

        WebElement text3 =driver.findElement(By.id("sampleHeading"));
        System.out.println(text3.getText());

    }


}
