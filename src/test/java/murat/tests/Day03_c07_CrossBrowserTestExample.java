package murat.tests;

import murat.utilities.BaseCrossBrowserTest;
import org.testng.annotations.Test;

public class Day03_c07_CrossBrowserTestExample extends BaseCrossBrowserTest {
    // Go to http://amazon.com/
    //Search for 'headset' 'mouse' and 'keyboard' in order with dataProvider
    // Assert that first item contians searched keywords in the item description
    // Go to product page
    // Add first item to cart
    // Click Go to Cart

    @Test
    public void amazonTest(){
        driver.get("https://www.amazon.com");

    }
}
