package com.tiy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DTG2 on 09/28/16.
 */
public class LuckySumTest {
LuckySum luckyRunner = new LuckySum();

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void luckySum13InA() throws Exception {
        System.out.println("13 in A " + luckyRunner.luckySum(13, 1, 2));
        assertEquals(0, luckyRunner.luckySum(13, 1, 2));
    }

    @Test
    public void luckySum13InB() throws Exception {
        System.out.println("13 in B " + luckyRunner.luckySum(1, 13, 2));
        assertEquals(1, luckyRunner.luckySum(1, 13, 2));
    }

    @Test
    public void luckySum13InC() throws Exception {
        System.out.println("13 in C " + luckyRunner.luckySum(1, 2, 13));
        assertEquals(3, luckyRunner.luckySum(1, 2, 13));
    }

    @Test
    public void luckySumNo13() throws Exception {
        System.out.println("No 13 " + luckyRunner.luckySum(1, 2, 3));
        assertEquals(6, luckyRunner.luckySum(1, 2, 3));
    }

}
