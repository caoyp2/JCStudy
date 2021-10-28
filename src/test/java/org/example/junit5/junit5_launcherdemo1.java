package org.example.junit5;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectMethod;

public class junit5_launcherdemo1 {

    public static void main(String[] args) {

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                    //selectPackage("org.lw.testcase.junit5") //指定包执行
                        //selectClass(junit5_ATest.class) //指定具体某个类运行
                        selectMethod("org.lw.testcase.junit5.junit5_ATest#test1")//指定某个方法运行
                ).filters(

                ).build();
        Launcher launcher = LauncherFactory.create();

        TestExecutionListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);

        launcher.execute(request);
    }
}
