package org.example.junit5;

public class Calculator {
    private static int startnum = 0;

    public static int add(int a, int b) throws InterruptedException {
        Thread.sleep(1000);
        startnum = a + b;
        return startnum;
    }

    public static int addnum(int a) throws InterruptedException {
        Thread.sleep(1000);
        startnum = startnum + a;
        return startnum;
    }

    public static synchronized int sysaddnum(int a) throws InterruptedException {
        Thread.sleep(1000);
        startnum = startnum + a;
        return startnum;
    }

    public static int sysadd(int a,int b) throws InterruptedException {
        Thread.sleep(1000);
        startnum = a + b;
        return startnum;
    }

    public static int syssub(int a,int b) throws InterruptedException {
        Thread.sleep(1000);
        startnum = a - b;
        return startnum;
    }

    //乘法
    public static int multip(int a, int b) throws InterruptedException {
        Thread.sleep(1000);
        startnum = a*b;
        return startnum;
    }

    public static int div(int a, int b) throws InterruptedException {
        Thread.sleep(1000);
        startnum = a/b;
        return startnum;
    }
}
