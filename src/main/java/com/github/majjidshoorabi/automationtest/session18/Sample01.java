package com.github.majjidshoorabi.automationtest.session18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author majid.shoorabi
 * @created 2022-24-April
 * @project automationtest
 */

public class Sample01 {
    public static void main(String[] args) throws Exception {

        /**
         * Run google-chrome in debug mode
         *          $ google-chrome --remote-debugging-port=8383 --user-data-dir=/home/majid/automationtest18/
         *
         *
         *  Work with open chrome's session
         */

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("debuggerAddress","localhost:8383");

        ChromeDriver driver = new ChromeDriver(options);

        driver.findElement(By.id("lname")).sendKeys("Shoorabi");

        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
