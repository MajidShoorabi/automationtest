package com.github.majidshoorabi.automationtest.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-03-April
 * @project automationtest
 */

public class Sample2 {

    public static final String projectPath;
    public static final String chromedriverPath;
    public static final String webPageBaseUrl;

    static {
        projectPath = System.getProperty("user.dir");
        chromedriverPath = projectPath.concat("/src/main/resources/chromedriver");
        webPageBaseUrl = new StringBuilder("file://").append(projectPath)
                .append("/src/main/resources/website/testautomation-playground.herokuapp.com").toString();
    }


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", chromedriverPath);
        WebDriver browser = new ChromeDriver();

        browser.get(webPageBaseUrl.concat("/forms.html"));


        browser.findElement(By.id("check_python")).click();
        String check_validate = browser.findElement(By.id("check_validate")).getText();
        assert check_validate.equals("PYTHON");


        String sampleText = "Hello automation world!";
        browser.findElement(By.id("notes")).sendKeys(sampleText);
        Object area_notes_validate = browser.findElement(By.id("area_notes_validate")).getText();
        assert area_notes_validate.equals(sampleText);


        browser.close();
    }
}
