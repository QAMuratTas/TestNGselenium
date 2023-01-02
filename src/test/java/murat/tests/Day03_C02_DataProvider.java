package murat.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {



    @Test(
            dataProvider = "getData"
    )
    public void test(String name,String mail,String password,int number){
        System.out.println("Username = " + name);
        System.out.println("Pasword = " + password);
        System.out.println("Mail = " + mail);
        System.out.println("Number = " + number);


    }
    @DataProvider
    public Object [][] getData(){
        Object [][] data ={
                {"Eyüp","eyp@cw.com","123",1},
                {"Zehra","zhr@cw.com","abs",2},
                {"Fatma","ftm@cw.com","aaa",3},
                {"Murat","mrt@cw.com","sdsaa",4}
        };
        return  data;

    }


}
