package com.test.practicepage.Pages;

import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public String orgUrl = "http://www.qaclickacademy.com/";

    //---Home Page
    @FindBy(xpath = "//a[contains(@href, 'practice.php')]")
    public SelenideElement practiceLink;

    public HomePage navigateToPracticePage(){
        System.out.println("[INFO]: Navigate to Practice Page.");
        open(orgUrl);
        $(practiceLink).waitUntil(enabled,30000).click();
        return this;
    }

}
