package com.unittest.services;

import com.unittest.CalculatorService;
import org.junit.jupiter.api.*;

public class CalculatorServiceTestUnit5 {

    // execute the logic before all test cases

    @BeforeAll
    public static void init()
    {
        System.out.println("Init test");
    }


    @BeforeEach
    public void beforeEachTestCases()
    {
        System.out.println("Before each test case");
    }

    @Test
//    @DisplayName("This is Custom Name")
    public void addTwoNumbersTest()
    {
        System.out.println("First Test Cases");
       int actualRes= CalculatorService.addTwoNumber(4,5);
       int expectedRes=9;
       Assertions.assertEquals(expectedRes,actualRes,"Test failed");
        System.out.println("Test passed");
    }

    @AfterEach
    public void afterEachTestCases()
    {
        System.out.println("After each test case");
    }




    @Test
//    @Disabled
    public void addAnyNumbers()
    {
        System.out.println("Second Test Cases");
      int res=CalculatorService.SumAnyTwoNumber(2,2,4,2,1,3);
      int expectedRes=14;
      Assertions.assertEquals(expectedRes,res,"Test failed");
    }

    @AfterAll
    public static void cleanUp()
    {
        System.out.println("Clean up test");
    }

    @Test
    @Tag("fast")
    void fastTest() {
        System.out.println("Fast test executed");
    }

    @Test
    @Tag("slow")
    void slowTest() {
        System.out.println("Slow test executed");
    }
}
