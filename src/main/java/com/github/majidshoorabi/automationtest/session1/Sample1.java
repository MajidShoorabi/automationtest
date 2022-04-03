package com.github.majidshoorabi.automationtest.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-03-April
 * @project automationtest
 */

public class Sample1 {

    public static final String projectPath;
    public static final String chromedriverPath;

    static {
        projectPath = System.getProperty("user.dir");
        chromedriverPath = projectPath.concat("/src/main/resources/chromedriver");
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",chromedriverPath);
        WebDriver browser = new ChromeDriver();

        browser.get("https://google.com");

        WebElement searchBox = browser.findElement(By.name("q"));
        searchBox.sendKeys("Keep it simple stupid");

        searchBox.sendKeys(Keys.RETURN);

        browser.close();
    }
}
