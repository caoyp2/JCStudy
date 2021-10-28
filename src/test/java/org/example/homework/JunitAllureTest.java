package org.example.homework;


import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Feature("功能名称")
public class JunitAllureTest {

    @Test
    @Story("子功能1")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("用例名称：子功能1")
    @Description("静态用例描述")
    @Step("静态用例步骤1")
    @Link(name="静态链接", url="https://www.baidu.com")
    public void test1(){

        Allure.description("动态用例描述");
        Allure.link("动态链接", "https://www.baidu.com");
        Allure.step("动态用例步骤1：断言");
        Assertions.assertTrue(1+1==2);
        Allure.step("动态用例步骤2：添加附件");
        // 添加文本展示
        Allure.addAttachment("日志", "这是一个日志信息。。。。");
        // 添加截图展示
        try {
            Allure.addAttachment("add picture", "image/png",
                    new FileInputStream("src/test/java/org/example/homework/test.jpeg"), ".jpeg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
