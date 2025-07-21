package com.unittest.services;

import com.unittest.CalculatorService;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorServices {


    // test method of add two numbers

    @Test
    public void addTwoNumbersTest() {
        int res=CalculatorService.addTwoNumber(9,9);
        int exp=18;

        Assert.assertEquals(exp,res);
        // actual result


        // expected result
    }

    @Test
    public void sumAnyNumbersTest() {
        int res=CalculatorService.SumAnyTwoNumber(2,4,5,6,3);
        int exp=20;
        Assert.assertEquals(exp,res);
    }


}
