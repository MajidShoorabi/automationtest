package com.github.majidshoorabi.automationtext.session14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author majid.shoorabi
 * @created 2022-23-April
 * @project automationtest
 */

public class Sample01 {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();


        /**
         * 1
         */
////        File userDir = new File("userDir");     // User1
//        File userDir = new File("userDir2");     // User2
//        try {
//            userDir.mkdir();
//        } catch (Exception e) {
//        }
//        options.addArguments("user-data-dir=" + userDir);
//
//
//        ChromeDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//
//        driver.get("https://app.clockify.me/signup");
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(0));
//
////        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("automationtest123@test.com");    // User1
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("automationtest124@test.com");    // User2
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//        for (int i = 0; i < 100; i++) {
//            try{
//                driver.findElement(By.id("sidebar-menu"));
//                break;
//            }catch (Exception e){
//                Thread.sleep(1000);
//            }
//        }

        /**
         * 2
         */
//        File userDir = new File("userDir");     // User1
        File userDir = new File("userDir");     // User2
        try {
            userDir.mkdir();
        } catch (Exception e) {
        }


        options.addArguments("user-data-dir=" + userDir);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://app.clockify.me/tracker");

        for (int i = 0; i < 100; i++) {
            try{
                driver.findElement(By.id("sidebar-menu"));
                break;
            }catch (Exception e){
                Thread.sleep(1000);
            }
        }


        /**
         * 3- Open without cache, but keep provider cache
         */
//        File userDir = new File("userDir");
//        try {
//            userDir.mkdir();
//        } catch (Exception e) {
//        }
//
//
//
//        options.addArguments("--incognito");
//        ChromeDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//
//        driver.get("https://app.clockify.me/tracker");
//        Thread.sleep(4000);

        driver.close();
        driver.quit();
    }
}
