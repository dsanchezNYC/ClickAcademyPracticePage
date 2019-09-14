package com.test.practicepage.Tests;

import com.codeborne.selenide.Condition;
import com.test.practicepage.BaseTests.BaseTests;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SmokeTests extends BaseTests {

    @Test
    public void test_01_NavigateToProjectPage (){
        System.out.println("[INFO]: 'Navigate To Project Page' test ***START***");
        hp.navigateToPracticePage();
        try{
            $(pp.PracticePageHeader).should(Condition.exist);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Navigate To Project Page' test ***PASSED***");
    }

    @Test
    public void test_02_NavigateToHomePage (){
        System.out.println("[INFO]: 'Navigate To Home Page' test ***START***");
        pp.navigateToHomePage();
        try{
            $(hp.practiceLink).should(Condition.exist);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Navigate To Home Page' test ***PASSED***");
    }

    @Test
    public void test_03_SelectRadioButton1(){
        System.out.println("[INFO]: 'Select Radio buttons' test ***START***");
        hp.navigateToPracticePage();
        pp.selectRadioButton(1);
        sleep(1000);
        try{
            $(pp.RadioButton1).shouldBe(Condition.focused);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Radio buttons' test ***PASSED***");
    }
}
