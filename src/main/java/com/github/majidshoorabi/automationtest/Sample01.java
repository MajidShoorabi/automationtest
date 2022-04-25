package com.github.majidshoorabi.automationtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author majid.shoorabi
 * @created 2022-25-April
 * @project automationtest
 */

public class Sample01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        driver.close();
        driver.quit();
    }
}
