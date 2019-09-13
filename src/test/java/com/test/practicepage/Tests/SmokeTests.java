package com.test.practicepage.Tests;

import com.test.practicepage.BaseTests.BaseTests;
import org.junit.jupiter.api.Test;

public class SmokeTests extends BaseTests {

    @Test
    public void test_01_NavigateToProjectPage (){
        System.out.println("[INFO]: 'Navigate To Project Page' test ***START***");
        hp.navigateToPracticePage();
        System.out.println("[INFO]: 'Navigate To Project Page' test ***PASSED***");
    }
}
