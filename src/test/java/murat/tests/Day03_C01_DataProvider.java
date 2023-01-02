package murat.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C01_DataProvider {


    @Test(dataProvider = "dataProvider")
    public void test01(String name){
        //verileri dataProvider methodundan alarak calisacak olan test

        System.out.println(name);
    }


    @DataProvider
    public Object[][] dataProvider(){
        // verileri teste saglayacak olan method
        Object[][] data = {
                {"Karl"},
                {"Ortis"},
                {"Clarusway"}
        };

        return data;
    }
}