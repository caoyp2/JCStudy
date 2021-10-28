package org.example.homework;

import org.example.junit5.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitaddAndDivTest {

    @Test
    public void addTest() throws InterruptedException {

        int result = Calculator.add(10,5);
        assertEquals(15,result);

    }


    @Test
    public void divTest() throws InterruptedException {

        int result = Calculator.div(10,5);
        assertEquals(2,result);

    }
}
