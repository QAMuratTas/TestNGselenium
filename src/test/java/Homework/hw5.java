package Homework;

import org.testng.annotations.*;

public class hw5 {

    @Test
    public void test1() {
        System.out.println("****First test running");
    }

    @Test
    public void test2() {
        System.out.println("****Second test running");

    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("*-> Before suite runing");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("*->After suite runing");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("**->Before test runing");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("**->After test runing");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("***->Before class runing");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("***->After class runing");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("****->Before method runing");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("****->After method runing");
    }
}