package com.test.practicepage.Tests;

import com.codeborne.selenide.Condition;
import com.test.practicepage.BaseTests.BaseTests;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class SmokeTests extends BaseTests {

    @Test
    public void test_01_NavigateToProjectPage (){
        System.out.println("[INFO]: 'Navigate To Project Page' test ***START***");
        hp.navigateToPracticePage();
        //$(pp.PracticePageHeader).should(Condition.exist);
        System.out.println("[INFO]: 'Navigate To Project Page' test ***PASSED***");
    }

    @Test
    public void test_02_NavigateToHomePage (){
        System.out.println("[INFO]: 'Navigate To Home Page' test ***START***");
        pp.navigateToHomePage();
        //$(pp.PracticePageHeader).should(Condition.exist);
        System.out.println("[INFO]: 'Navigate To Home Page' test ***PASSED***");
    }
}
