package com.test.practicepage.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.test.practicepage.BaseTests.BaseTests.pp;

public class PracticePage {

    public String orgUrl = "http://www.qaclickacademy.com/practice.php";

    //---Practice Page Locators
    @FindBy(xpath = "//h1")
    public SelenideElement PracticePageHeader;

    @FindBy(xpath = "//img[@class='logoClass']")
    public SelenideElement Logo;

    //--Radios
    @FindBy(xpath = "//input[@value='radio1']")
    public SelenideElement RadioButton1;

    @FindBy(xpath = "//input[@value='radio2']")
    public SelenideElement RadioButton2;

    @FindBy(xpath = "//input[@value='radio3']")
    public SelenideElement RadioButton3;

    //--Select Countries
    @FindBy(xpath = "//input[@id='autocomplete']")
    public SelenideElement SelectCountries;

    //--Dropdown
    @FindBy(xpath = "//select[@id='dropdown-class-example']")
    public SelenideElement DropdownExample;

    //--Checkbox Options
    @FindBy(xpath = "//input[@value='option1']")
    public SelenideElement CheckboxOption1;

    @FindBy(xpath = "//input[@value='option2']")
    public SelenideElement CheckboxOption2;

    @FindBy(xpath = "//input[@value='option3']")
    public SelenideElement CheckboxOption3;

    //--Switch Window
    @FindBy(xpath = "//button[@id='openwindow']")
    public SelenideElement OpenWindowButton;

    //--Open Tab
    @FindBy(xpath = "//a[@id='opentab']")
    public SelenideElement OpenTabButton;

    //--Enter Your Name
    @FindBy(xpath = "//input[@id='name']")
    public SelenideElement EnterYourNameBox;

    @FindBy(xpath = "//input[@id='alertbtn']")
    public SelenideElement AlertButton;

    @FindBy(xpath = "//input[@id='confirmbtn']")
    public SelenideElement ConfirmButton;

    //--Web Table Example
    @FindBy(xpath = "//*[@id=\"product\"]/tbody/tr[1]/th[1]")
    public SelenideElement InstructorsHeader;

    @FindBy(xpath = "//*[@id=\"product\"]/tbody/tr[1]/th[2]")
    public SelenideElement CourseHeader;

    @FindBy(xpath = "//*[@id=\"product\"]/tbody/tr[1]/th[3]")
    public SelenideElement PriceHeader;

    //TBD: Add additional table row locators

    //--Element Displayed Example
    @FindBy(xpath = "//input[@id='hide-textbox']")
    public SelenideElement HideButton;

    @FindBy(xpath = "//input[@id='show-textbox']")
    public SelenideElement ShowButton;

    @FindBy(xpath = "//input[@id='displayed-text']")
    public SelenideElement DisplayedTextBox;

    //--Mouse Hover Exmaple
    @FindBy(xpath = "//button[@id='mousehover']")
    public SelenideElement MouseHoverButton;

    //TBD: Add iFrame locators

    //---Methods
    public PracticePage navigateToProjectPage(){
        open(orgUrl);
        return this;
    }

    public PracticePage navigateToHomePage(){
        open(orgUrl);
        $(Logo).waitUntil(enabled,30000).click();
        return this;
    }

    public PracticePage selectRadioButton(int x){
        if(x == 1){
            pp.RadioButton1.click();
        } else if(x == 2) {
            pp.RadioButton2.click();
        } else if(x == 3){
            pp.RadioButton3.click();
        }
        return this;
    }

    public PracticePage selectCheckboxOption(int x){
        if(x == 1){
            pp.CheckboxOption1.click();
        } else if(x == 2) {
            pp.CheckboxOption2.click();
        } else if(x == 3){
            pp.CheckboxOption3.click();
        }
        return this;
    }

//    public PracticePage selectCountries(){
//        return this;
//    }


}
