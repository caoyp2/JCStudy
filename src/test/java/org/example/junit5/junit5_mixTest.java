package org.example.junit5;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class junit5_mixTest {

    @RepeatedTest(10)
    public void add() throws InterruptedException {
        int result = Calculator.sysadd(2,3);
        assertEquals(5,result);
        System.out.println("线程号： " + Thread.currentThread() + "    result:"  + result);
    }

    @RepeatedTest(10)
    public void sub() throws InterruptedException {
        int result = Calculator.syssub(6,4);
        assertEquals(2,result);
        System.out.println("线程号： " + Thread.currentThread() + "    result:"  + result);
    }
}
