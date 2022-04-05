package com.github.majidshoorabi.automationtest.session2.browseractions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-04-April
 * @project automationtest
 */

public class Sample01 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Wikipedia");

        Thread.sleep(2000);

        // close driver
        driver.close();

        // Teardown section
        // close test session - close all resources such as directories
        driver.quit();
    }
}
