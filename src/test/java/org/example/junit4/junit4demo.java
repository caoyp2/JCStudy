package org.example.junit4;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class junit4demo {

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    @Category(MockTest.class)
    public void test3(){
        System.out.println("test3");
    }

    @Test
    @Category(MockTest.class)
    public void test4(){
        System.out.println("test4");
    }
}
