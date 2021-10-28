package org.example.homework;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class JunitOrderTest {

    @Order(1)
    @Test
    public void test2(){
        System.out.println("test2.......");
    }

    @Order(2)
    @Test
    public void test1(){
        System.out.println("test1.......");
    }

}
