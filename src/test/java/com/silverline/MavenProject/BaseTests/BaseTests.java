package com.silverline.MavenProject.BaseTests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.WebDriverRunner;
import com.silverline.MavenProject.Pages.LoginPage;
import com.silverline.MavenProject.Helpers.BrowsersHelper;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseTests {

    public static LoginPage lp;

    public static String Org;

    @BeforeAll
    public static void setup(){
        //SalesforceSoap.mainTimber();
        //setWebDriver(BrowsersHelper.getChromeLocalWebDriver());
        setWebDriver(BrowsersHelper.getChromeRemoteWebDriver());
        initializePages();
    }

    public static void initializePages() {
        lp = page (LoginPage.class);
    }

    @AfterAll
    public static void end(){
        WebDriverRunner.getWebDriver().quit();
        //SalesforceSoap.main();
    }
}
