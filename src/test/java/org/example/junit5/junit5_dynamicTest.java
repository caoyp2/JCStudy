package org.example.junit5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class junit5_dynamicTest {

    //动态对比多个断言
    @TestFactory
    Collection<DynamicTest> dynamicTestCollection(){
        return Arrays.asList(
            dynamicTest("dynamicTest1", () -> { assertTrue(false);}),
            dynamicTest("dynamicTest1", () -> { assertTrue(true);})
        );
    }

    @Test
    public  void test2() throws IOException {
        List<DynamicTest> dynamicTestList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        ResultList resultList = objectMapper.readValue(new File("result.yaml"), ResultList.class);
        System.out.println(resultList);
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestCollection2() throws IOException {
        List<DynamicTest> dynamicTestList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        ResultList resultList = objectMapper.readValue(new File("result.yaml"), ResultList.class);
        for(ShellResult shellResult : resultList.getResultList()){
            dynamicTestList.add(
                    dynamicTest(shellResult.getCasename(), () -> { assertTrue(shellResult.getCaseresult());}));
        }
        return dynamicTestList;
    }
}
