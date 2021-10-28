package org.example.junit5;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class junit5_Demo1Test {

    @Test
    public void test1() throws InterruptedException {
        int result1 = Calculator.add(1,2);
//        Assertions.assertEquals(5,result1); //普通断言遇到断言失败就会停止

        int result2 = Calculator.add(1,5);
//        Assertions.assertEquals(6,result1);

        int result3 = Calculator.add(1,7);
//        Assertions.assertEquals(7,result1);

        assertAll("批量断言！",
                ()-> assertEquals(5,result1),
                ()-> assertEquals(5,result2),
                ()-> assertEquals(5,result3));
    }

    @Test
    public void test2(){
        ArrayList<Executable> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++ ){
            int fianalI = i;
            arrayList.add(() -> assertEquals(5,fianalI));
        }

        assertAll("批量断言！",
                arrayList.stream());
    }
}
