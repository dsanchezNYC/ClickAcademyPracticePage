package com.test.practicepage.BaseTests;

import com.test.practicepage.Pages.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.WebDriverRunner;
import com.test.practicepage.Helpers.BrowsersHelper;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseTests {

    public static HomePage hp;

    @BeforeAll
    public static void setup(){
        setWebDriver(BrowsersHelper.getChromeLocalWebDriver());
        initializePages();
    }

    public static void initializePages() {
        hp = page (HomePage.class);
    }

    @AfterAll
    public static void end(){
        WebDriverRunner.getWebDriver().quit();
    }
}
