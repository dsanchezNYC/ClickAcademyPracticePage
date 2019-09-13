package com.test.practicepage.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticePage {

    public String orgUrl = "http://www.qaclickacademy.com/practice.php";

    //---Practice Page Locators
    @FindBy(xpath = "//h1")
    public SelenideElement PracticePageHeader;

    @FindBy(xpath = "//img[@class='logoClass']")
    public SelenideElement Logo;

    @FindBy(xpath = "//input[@value='radio1']")
    public SelenideElement RadioButton1;

    @FindBy(xpath = "//input[@value='radio2']")
    public SelenideElement RadioButton2;

    @FindBy(xpath = "//input[@value='radio3']")
    public SelenideElement RadioButton3;

    @FindBy(xpath = "//input[@id='autocomplete']")
    public SelenideElement SelectCountries;

    @FindBy(xpath = "//select[@id='dropdown-class-example']")
    public SelenideElement DropdownExample;

    @FindBy(xpath = "//input[@value='option1']")
    public SelenideElement Option1;

    @FindBy(xpath = "//input[@value='option2']")
    public SelenideElement Option2;

    @FindBy(xpath = "//input[@value='option3']")
    public SelenideElement Option3;

    //---Methods
    public PracticePage navigateToHomePage(){
        System.out.println("[INFO]: Navigate to Home Page.");
        open(orgUrl);
        $(Logo).waitUntil(enabled,30000).click();
        return this;
    }

    public PracticePage selectRadioButton(){
        System.out.print("[INFO]: Select radio button.");
        return this;
    }

    public PracticePage selectCountries(){
        System.out.print("[INFO]: Select country.");
        return this;
    }


}
