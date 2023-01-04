package murat.utilities;

import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getScreenShot (WebDriver driver, String name){


    }

    public static String formatCurrentDate (String pattern){
        return new SimpleDateFormat(pattern).format(new Date());
    }
}
