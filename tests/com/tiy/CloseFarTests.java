package com.tiy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by DTG2 on 09/21/16.
 */
public class CloseFarTests {

//   Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
//   while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes
//   the absolute value of a number.
//
//    closeFar(1, 2, 10) → true
//    closeFar(1, 2, 3) → false
//    closeFar(4, 1, 3) → true

    CloseFar closeFar = new CloseFar();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
    public void allFar() throws Exception {
        System.out.println(closeFar.closeFar(1, 5, 10));
        assertFalse(closeFar.closeFar(1, 5, 10));
    }

    @Test
    public void allClose() throws Exception {
        System.out.println(closeFar.closeFar(1, 2, 3));
        assertFalse(closeFar.closeFar(1, 2, 3));
    }

    @Test
    public void bandCCloseTogetherFarFromA() throws Exception {
        System.out.println(closeFar.closeFar(1, 5, 6));
        assertFalse(closeFar.closeFar(1, 5, 6));
    }

    @Test
    public void aAndBCloseTogetherFarFromC() throws Exception {
        System.out.println(closeFar.closeFar(1, 2, 6));
        assertTrue(closeFar.closeFar(1, 2, 6));
    }

    @Test
    public void aAndCCloseTogetherFarFromB() throws Exception {
        System.out.println(closeFar.closeFar(1, 7, 2));
        assertTrue(closeFar.closeFar(1, 7, 2));
    }

}
