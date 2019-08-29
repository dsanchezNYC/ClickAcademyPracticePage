package com.silverline.MavenProject.Pages;

import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public String orgUrl = "https://.salesforce.com";
    public String login = "";
    public String password = "";

    //---Salesforce
    @FindBy(xpath = "//input[@id='username']")
    public SelenideElement slLoginField;

    @FindBy(xpath = "//input[@id='password']")
    public SelenideElement slPasswordField;

    @FindBy(xpath = "//input[@id='Login']")
    public SelenideElement slLoginButton;

    @FindBy(xpath = "//a[@class='switch-to-lightning']")
    public SelenideElement switchToLightningLink;

    @FindBy(css = ".slds-icon-waffle")
    public SelenideElement appLauncherIcon;

    @FindBy(xpath = "//input[@id='thePage:inputForm:continue']")
    public SelenideElement continueButton;

    //---Methods
    public LoginPage loginToSalesforce() {
        System.out.println("[INFO]: Login to Salesforce.");

        open(orgUrl);
        $(slLoginField).waitUntil(enabled, 30000).setValue(login);
        $(slPasswordField).waitUntil(enabled, 30000).setValue(password);
        $(slLoginButton).waitUntil(enabled, 30000).click();

        try{ if(switchToLightningLink.exists()){
            $(switchToLightningLink).waitUntil(enabled, 30000).click();
        }} catch (Exception e){}

        $(appLauncherIcon).waitUntil(enabled, 30000).click();
        return this;
    }

    public LoginPage loginByLink() throws InterruptedException {
        open("https://agloan--sldev.lightning.force.com/?un=" + login + "&pw=" + password);

        Thread.sleep(3000);
        try {
            if (continueButton.exists()) {
                $(continueButton).shouldBe(enabled).click(); }
        }
        catch(Exception e){
        }
        return this;
    }
}
