package com.github.majidshoorabi.automationtest.session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author majid.shoorabi
 * @created 2022-05-April
 * @project automationtest
 */

public class Sample06 {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Web Driver Options
         */
        ChromeOptions options = new ChromeOptions();

        /**
         * --incognito > open chrome in incognito mod
         */
//        options.addArguments("--incognito");

        /**
         * --headless > doesn't open chrome virtually but execute it process
         * it's improve performance in CI/CD server
         */
        options.addArguments("--headless");


        /**
         * ChromeDriver options:  ***  https://peter.sh/experiments/chromium-command-line-switches/  ***
         */


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://google.com");
        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}
