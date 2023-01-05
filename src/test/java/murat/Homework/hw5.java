package murat.Homework;

import org.testng.annotations.*;

public class hw5 {

    @Test
    public void test1() {
        System.out.println("\tFirst test running");
    }

    @Test
    public void test2() {
        System.out.println("\tSecond test running");

    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite runing");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite runing");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tBefore test runing");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tAfter test runing");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\tBefore class runing");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\tAfter class runing");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\tBefore method runing");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\tAfter method runing");
    }
}