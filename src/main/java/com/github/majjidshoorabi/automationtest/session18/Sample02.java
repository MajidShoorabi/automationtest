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

public class Sample02 {
    public static void main(String[] args) throws Exception {

        /**
         * Step 1:   open session
         */
//        ChromeDriver driver = open_session();
//        driver.findElement(By.id("fname")).sendKeys("Majid");
//        driver.findElement(By.id("male")).click();
//        driver.findElement(By.id("lastname")).sendKeys("Shoorabi");   driver.get("https://www.play2.automationcamp.ir/index.html");
//        Thread.sleep(3000);

        /**
         * Step 2: continue with open session
         */
        ChromeDriver driver = continue_session();
        driver.findElement(By.id("lname")).sendKeys("Shoorabi");
        Thread.sleep(3000);
    }


    public static ChromeDriver open_session() {
        String userDir = "/home/majid/automationtest18/";

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-port=8484");
        options.addArguments(String.format("--user-data-dir=%s", userDir));
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }


    public static ChromeDriver continue_session() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:8484");
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }
}
