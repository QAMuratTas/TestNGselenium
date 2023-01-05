package murat.tests;

import murat.utilities.ExcelUtils;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Day06_C01_ExcelUtil {

    @Test
    public void test() throws FileNotFoundException {

        String path = "C:\\Users\\MURAT\\IdeaProjects\\TestNGSelenium\\src\\test\\java\\murat\\resources\\testdata.xlsx";
        ExcelUtils eu =new ExcelUtils(path,0);

    }


}
