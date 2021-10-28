package org.example.junit5;

import org.junit.jupiter.api.RepeatedTest;

/**
 * 测试并发场景
 */
public class junit5_bingfaTest {

    @RepeatedTest(10)
    public void test1() throws InterruptedException {

        int result = Calculator.addnum(1);
        System.out.println("线程号： " + Thread.currentThread() + "    result:"  + result);
    }

    @RepeatedTest(10)
    public void test2() throws InterruptedException {

        int result = Calculator.sysaddnum(1);
        System.out.println("线程号： " + Thread.currentThread() + "    result:"  + result);
    }
}
