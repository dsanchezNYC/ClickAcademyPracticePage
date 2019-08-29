package com.silverline.MavenProject.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.net.MalformedURLException;

public class BrowsersHelper {

    private static String remoteURL = "http://marina67:rDnzuyq1edYevNDxbgNL@hub.browserstack.com/wd/hub";

    public static WebDriver getChromeRemoteWebDriver () {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");

        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("browser", "chrome");
        capability.setCapability("browser_version", "72.0");
        capability.setCapability("os", "Windows");
        capability.setCapability("os_version", "7");
        capability.setCapability("build", "Test");
        capability.setCapability("acceptSslCerts", "true");
        capability.setCapability("browserstack.debug", "true");
        capability.setCapability("resolution", "1280x1024");
        capability.setCapability("browserstack.video", "false");
        capability.setCapability(ChromeOptions.CAPABILITY, options);
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(
                    new URL(remoteURL),	capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.setFileDetector(new LocalFileDetector());
        driver.manage().window().maximize();
        return driver;
    }


    public static WebDriver getChromeLocalWebDriver () {
        System.setProperty("webdriver.chrome.driver", "D:// PLEASE ADD THE PATH TO YOUR WEB DRIVER '.exe' FILE");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
