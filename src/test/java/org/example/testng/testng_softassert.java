package org.example.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng_softassert {

    @Test
    public void test1(){
        SoftAssert assertion = new SoftAssert(); //使用软断言
        System.out.println(1);
        assertion.assertEquals(1,2);

        System.out.println(2);
        assertion.assertEquals(2,2);

        System.out.println(3);
        assertion.assertEquals(3,2);
        assertion.assertAll();
    }
}
