package murat.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day04_C03_ParallelTestDataProvider {


    @Test(dataProvider = "getData")
    public void test(String name, String surname){
        System.out.println(name + " " + surname);
        System.out.println("Thread id :"+Thread.currentThread().getId());
    }



    @DataProvider(parallel = true)
    public Object[][] getData(){

        return new Object[][]{
                {"yusuf", "celik"},
                {"can", "efe"},
                {"merve", "aslan"}
        };

    }
}