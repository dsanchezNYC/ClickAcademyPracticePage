package com.test.practicepage.Tests;

import com.codeborne.selenide.Condition;
import com.test.practicepage.BaseTests.BaseTests;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static com.codeborne.selenide.Condition.name;
import static com.codeborne.selenide.Condition.value;
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
        System.out.println("[INFO]: 'Select Radio button 1' test ***START***");
        hp.navigateToPracticePage();
        pp.selectRadioButton(1);
        try{
            $(pp.RadioButton1).shouldBe(Condition.focused);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Radio button 1' test ***PASSED***");
    }

    @Test
    public void test_04_SelectRadioButton2(){
        System.out.println("[INFO]: 'Select Radio button 2' test ***START***");
        hp.navigateToPracticePage();
        pp.selectRadioButton(2);
        try{
            $(pp.RadioButton2).shouldBe(Condition.focused);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Radio button 2' test ***PASSED***");
    }

    @Test
    public void test_05_SelectRadioButton3(){
        System.out.println("[INFO]: 'Select Radio button 3' test ***START***");
        hp.navigateToPracticePage();
        pp.selectRadioButton(3);
        try{
            $(pp.RadioButton3).shouldBe(Condition.focused);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Radio button 3' test ***PASSED***");
    }

    @Test
    public void test_06_SelectCheckboxOption1(){
        System.out.println("[INFO]: 'Select Checkbox option 1' test ***START***");
        hp.navigateToPracticePage();
        pp.selectCheckboxOption(1);
        try{
            $(pp.CheckboxOption1).shouldBe(Condition.focused);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Checkbox option 1' test ***PASSED***");
    }

    @Test
    public void test_07_SelectCheckboxOption2(){
        System.out.println("[INFO]: 'Select Checkbox option 2' test ***START***");
        hp.navigateToPracticePage();
        pp.selectCheckboxOption(2);
        try{
            $(pp.CheckboxOption2).shouldBe(Condition.focused);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Checkbox option 2' test ***PASSED***");
    }

    @Test
    public void test_08_SelectCheckboxOption1(){
        System.out.println("[INFO]: 'Select Checkbox option 3' test ***START***");
        hp.navigateToPracticePage();
        pp.selectCheckboxOption(3);
        try{
            $(pp.CheckboxOption3).shouldBe(Condition.focused);
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Checkbox option 3' test ***PASSED***");
    }

    @Test
    public void test_09_DropdownOption1(){
        System.out.println("[INFO]: 'Select Dropdown option 1' test ***START***");
        hp.navigateToPracticePage();
        pp.DropdownExample.selectOptionByValue("option1");
        try{
            $(pp.DropdownExample.shouldHave(value("option1")));
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Dropdown option 1' test ***PASSED***");
    }

    @Test
    public void test_10_DropdownOption2(){
        System.out.println("[INFO]: 'Select Dropdown option 2' test ***START***");
        hp.navigateToPracticePage();
        pp.DropdownExample.selectOptionByValue("option2");
        try{
            $(pp.DropdownExample.shouldHave(value("option2")));
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Dropdown option 2' test ***PASSED***");
    }

    @Test
    public void test_11_DropdownOption3(){
        System.out.println("[INFO]: 'Select Dropdown option 3' test ***START***");
        hp.navigateToPracticePage();
        pp.DropdownExample.selectOptionByValue("option3");
        try{
            $(pp.DropdownExample.shouldHave(value("option3")));
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select Dropdown option 3' test ***PASSED***");
    }

    @Test
    public void test_12_SelectCountries(){
        System.out.println("[INFO]: 'Select United States from Select Countries' test ***START***");
        hp.navigateToPracticePage();
        pp.SelectCountries.sendKeys("United States");
        sleep(10000);
        try{
            $(pp.SelectCountries.shouldHave(value("United States")));
        }
        catch(Exception e){
        }
        System.out.println("[INFO]: 'Select United States from Select Countries' test ***PASSED***");
    }

}
