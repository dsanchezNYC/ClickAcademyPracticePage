package com.test.practicepage.Tests;

import com.codeborne.selenide.Condition;
import com.test.practicepage.BaseTests.BaseTests;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static com.codeborne.selenide.Condition.name;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class SmokeTests extends BaseTests {

    @Test
    public void test_01_NavigateToProjectPageFromHomePage (){
        System.out.println("[INFO]: 'Navigate To Project Page' test ***START***");
        hp.navigateToPracticePage();
        try{
            $(pp.PracticePageHeader).should(Condition.exist);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Navigate To Project Page' test ***PASSED***");
    }

    @Test
    public void test_02_NavigateToHomePageFromProjectPage (){
        System.out.println("[INFO]: 'Navigate To Home Page' test ***START***");
        pp.navigateToHomePage();
        try{
            $(hp.practiceLink).should(Condition.exist);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Navigate To Home Page' test ***PASSED***");
    }

    @Test
    public void test_03_SelectRadioButton1(){
        System.out.println("[INFO]: 'Select Radio button 1' test ***START***");
        pp.openProjectPage();
        pp.selectRadioButton(1);
        try{
            $(pp.RadioButton1).shouldBe(Condition.focused);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Radio button 1' test ***PASSED***");
    }

    @Test
    public void test_04_SelectRadioButton2(){
        System.out.println("[INFO]: 'Select Radio button 2' test ***START***");
        pp.openProjectPage();
        pp.selectRadioButton(2);
        try{
            $(pp.RadioButton2).shouldBe(Condition.focused);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Radio button 2' test ***PASSED***");
    }

    @Test
    public void test_05_SelectRadioButton3(){
        System.out.println("[INFO]: 'Select Radio button 3' test ***START***");
        pp.openProjectPage();
        pp.selectRadioButton(3);
        try{
            $(pp.RadioButton3).shouldBe(Condition.focused);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Radio button 3' test ***PASSED***");
    }

    @Test
    public void test_06_SelectCheckboxOption1(){
        System.out.println("[INFO]: 'Select Checkbox option 1' test ***START***");
        pp.openProjectPage();
        pp.selectCheckboxOption(1);
        try{
            $(pp.CheckboxOption1).shouldBe(Condition.focused);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Checkbox option 1' test ***PASSED***");
    }

    @Test
    public void test_07_SelectCheckboxOption2(){
        System.out.println("[INFO]: 'Select Checkbox option 2' test ***START***");
        pp.openProjectPage();
        pp.selectCheckboxOption(2);
        try{
            $(pp.CheckboxOption2).shouldBe(Condition.focused);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Checkbox option 2' test ***PASSED***");
    }

    @Test
    public void test_08_SelectCheckboxOption1(){
        System.out.println("[INFO]: 'Select Checkbox option 3' test ***START***");
        pp.openProjectPage();
        pp.selectCheckboxOption(3);
        try{
            $(pp.CheckboxOption3).shouldBe(Condition.focused);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Checkbox option 3' test ***PASSED***");
    }

    @Test
    public void test_09_DropdownOption1(){
        System.out.println("[INFO]: 'Select Dropdown option 1' test ***START***");
        pp.openProjectPage();
        pp.DropdownExample.selectOptionByValue("option1");
        try{
            $(pp.DropdownExample.shouldHave(value("option1")));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Dropdown option 1' test ***PASSED***");
    }

    @Test
    public void test_10_DropdownOption2(){
        System.out.println("[INFO]: 'Select Dropdown option 2' test ***START***");
        pp.openProjectPage();
        pp.DropdownExample.selectOptionByValue("option2");
        try{
            $(pp.DropdownExample.shouldHave(value("option2")));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Dropdown option 2' test ***PASSED***");
    }

    @Test
    public void test_11_DropdownOption3(){
        System.out.println("[INFO]: 'Select Dropdown option 3' test ***START***");
        pp.openProjectPage();
        pp.DropdownExample.selectOptionByValue("option3");
        try{
            $(pp.DropdownExample.shouldHave(value("option3")));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select Dropdown option 3' test ***PASSED***");
    }

    @Test
    public void test_12_SelectCountries(){
        System.out.println("[INFO]: 'Select United States from Select Countries' test ***START***");
        pp.openProjectPage();
        pp.SelectCountries.sendKeys("United States");
        try{
            $(pp.SelectCountries.shouldHave(value("United States")));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Select United States from Select Countries' test ***PASSED***");
    }

    @Test
    public void test_13_SwitchWindow(){
        System.out.println("[INFO]: 'Switch Window' test ***START***");
        pp.openProjectPage();
        pp.OpenWindowButton.click();
        switchTo().window(1);
        hp.navigateToPracticePage();
        try{
            $(pp.PracticePageHeader).should(Condition.exist);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("[INFO]: 'Switch Window' test ***PASSED***");
    }



}
