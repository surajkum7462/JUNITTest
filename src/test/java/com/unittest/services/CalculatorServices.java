//package com.unittest.services;
//
//import com.unittest.CalculatorService;
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServices {
//
//    // before class
//    int cnt=0;
//
//    @BeforeClass
//    public static void init()
//    {
//        System.out.println("Before all test cases");
//        System.out.println("Started test : "+new Date());
//    }
//
//    @Before  // execute the method before each test cases
//    public void beforeEach()
//    {
//        cnt=0;
//        System.out.println("Before each test case");
//    }
//
//    // test method of add two numbers
//
//    @Test
//    public void addTwoNumbersTest() {
//        for(int i=1;i<=10;i++)
//        {
//            cnt+=i;
//        }
//        System.out.println("Counter in first test case: "+cnt);
//        System.out.println("Add Two Numbers Test");
//        int res=CalculatorService.addTwoNumber(9,9);
//        int exp=18;
//
//        Assert.assertEquals(exp,res);
//        // actual result
//
//
//        // expected result
//    }
//
//    @Test
//    public void sumAnyNumbersTest() {
//        for(int i=1;i<=5;i++)
//        {
//            cnt+=i;
//        }
//        System.out.println("Counter in second test case: "+cnt);
//        System.out.println("Sum Any Numbers Test");
//        int res=CalculatorService.SumAnyTwoNumber(2,4,5,6,3);
//        int exp=20;
//        Assert.assertEquals(exp,res);
//    }
//
//    // After all test cases
//    @AfterClass
//    public static void cleanup()
//    {
//        System.out.println("Clean up");
//        System.out.println("End test : "+new Date());
//    }
//
//
//}
//package com.unittest.services;
//
//import com.unittest.CalculatorService;
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServices {
//
//    // before class
//    int cnt=0;
//
//    @BeforeClass
//    public static void init()
//    {
//        System.out.println("Before all test cases");
//        System.out.println("Started test : "+new Date());
//    }
//
//    @Before  // execute the method before each test cases
//    public void beforeEach()
//    {
//        cnt=0;
//        System.out.println("Before each test case");
//    }
//
//    // test method of add two numbers
//
//    @Test
//    public void addTwoNumbersTest() {
//        for(int i=1;i<=10;i++)
//        {
//            cnt+=i;
//        }
//        System.out.println("Counter in first test case: "+cnt);
//        System.out.println("Add Two Numbers Test");
//        int res=CalculatorService.addTwoNumber(9,9);
//        int exp=18;
//
//        Assert.assertEquals(exp,res);
//        // actual result
//
//
//        // expected result
//    }
//
//    @Test
//    public void sumAnyNumbersTest() {
//        for(int i=1;i<=5;i++)
//        {
//            cnt+=i;
//        }
//        System.out.println("Counter in second test case: "+cnt);
//        System.out.println("Sum Any Numbers Test");
//        int res=CalculatorService.SumAnyTwoNumber(2,4,5,6,3);
//        int exp=20;
//        Assert.assertEquals(exp,res);
//    }
//
//    // After all test cases
//    @AfterClass
//    public static void cleanup()
//    {
//        System.out.println("Clean up");
//        System.out.println("End test : "+new Date());
//    }
//
//
//}
