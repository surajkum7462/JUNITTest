package com.unittest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {

    @Test
    public void testAssertExample() {
        System.out.println("Testing some assertions example");
        int actual=12;
        int expected=12;
        // This is overloaded method
//        Assertions.assertEquals(actual, expected);

//        Assertions.assertArrayEquals(new int[]{4,3,2,1,5},new int[]{4,3,2,1,5});
//        String name=new String("rahul");
//        String expec=new String("rahul");
////        Assertions.assertSame(name, expec);
//        Assertions.assertEquals(name,expec);

        String ac = "rahul";
        String exp = "rahul";
        Assertions.assertEquals(ac,exp);
        Assertions.assertSame(ac,exp);


    }
}
