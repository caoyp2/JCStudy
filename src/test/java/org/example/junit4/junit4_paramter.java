package org.example.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class junit4_paramter {

    private String name;
    private String pwd;

    @Parameters
    public static Collection setParam(){
        return Arrays.asList(new Object[][]{
            {"user01","pwd01"},
            {"user02","pwd02"},
            {"user03","pwd03"},
            {"user04","pwd04"}
        });
    }

    @Before
    public void beforeTest(){
        System.out.println("beforetest");
    }

    @After
    public void afterTest(){
        System.out.println("aftertest");
    }

    @Test
    public void test(){
        System.out.println("测试方法1");
        System.out.println("用户名：" + name);
        System.out.println("密码：" + pwd);
    }

    public junit4_paramter(String name, String pwd){
        this.name = name;
        this.pwd = pwd;
    }

}
