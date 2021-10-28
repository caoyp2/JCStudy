package org.example.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.rules.Timeout;
import org.junit.runner.Description;

public class junit4_rule {

    @Rule
    public Timeout timeout = new Timeout(2000);//定义超时后的操作

    @Rule
    public final TestName testName = new TestName(); //定义获取测试用例的名称

    //监听测试用例运行过程中各个生命周期时可以做的事情
    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
            super.succeeded(description);
            String info = description.getClassName() + " " + description.getMethodName();
            System.out.println("succeeded：" + info);
        }

        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);
            String info = description.getClassName() + " " + description.getMethodName();
            System.out.println("failed：" + info);
        }

        @Override
        protected void starting(Description description) {
            super.starting(description);
            String info = description.getClassName() + " " + description.getMethodName();
            System.out.println("starting：" + info);
        }
    };

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("test1");

    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
        System.out.println("接口名称：" + testName);
    }

    @Test
    public void test4(){
        System.out.println("test4");
    }
}
