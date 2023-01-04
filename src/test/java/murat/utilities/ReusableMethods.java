package murat.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getScreenShot (WebDriver driver, String name){
    // Screenshot dosya ismi için şu anki tarihi string olarak alıyoruz
        String date = formatCurrentDate("yyyyMMddhhmmss");
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);



    }

    public static String formatCurrentDate (String pattern){
        return new SimpleDateFormat(pattern).format(new Date());
    }
}
