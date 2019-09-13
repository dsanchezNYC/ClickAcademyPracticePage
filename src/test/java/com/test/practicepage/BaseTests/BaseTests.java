package com.test.practicepage.BaseTests;

import com.test.practicepage.Pages.HomePage;
import com.test.practicepage.Pages.PracticePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.WebDriverRunner;
import com.test.practicepage.Helpers.BrowsersHelper;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseTests {

    public static HomePage hp;
    public static PracticePage pp;

    @BeforeAll
    public static void setup(){
        setWebDriver(BrowsersHelper.getChromeLocalWebDriver());
        initializePages();
    }

    public static void initializePages() {
        hp = page (HomePage.class);
        pp = page (PracticePage.class);
    }

    @AfterAll
    public static void end(){
        WebDriverRunner.getWebDriver().quit();
    }
}
