package murat.tests;

import murat.utilities.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {


    @Test
    public void crossBrowserTest() throws InterruptedException {
        driver.get("https://www.google.com");
Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Google");
    }

}
