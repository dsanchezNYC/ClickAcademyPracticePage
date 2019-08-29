package com.silverline.MavenProject.Tests;

import org.junit.jupiter.api.Test;
import com.silverline.MavenProject.BaseTests.BaseTests;

public class SmokeTests extends BaseTests {

    @Test
    public void test_01_LoginToSalesforce (){
        System.out.println("[INFO]: 'Login To Salesforce' test ***START***");
        lp.loginToSalesforce();
        System.out.println("[PASSED]: 'Login To Salesforce' test ***PASSED***");
    }
}
