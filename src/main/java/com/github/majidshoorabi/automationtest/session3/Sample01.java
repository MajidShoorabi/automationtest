package com.github.majidshoorabi.automationtest.session3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-07-April
 * @project automationtest
 */

public class Sample01 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://wikipedia.com");

        /**
         * 1 > find by id
         */
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Hello world");

        /**
         * 2 > find by xpath
         *
         * xpath:
         *  1- absolute xpath       /<TAG>/<TAG>/</TAG>
         *  2- relative xpath       //<TAG>[<attribute>='value']
         *
         */
        // absolute xpath
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[3]"));

        // relative xpath
        WebElement element2 = driver.findElement(By.xpath("//input[@type='search']"));
        // driver.findElement(By.xpath("//input[text()='search']"));

        System.out.println(element1);
        System.out.println(element2);

        assert element1.equals(element2);

        /**
         *
         */
//        WebElement element3 = driver.findElement(By.xpath("//*[text()='Italiano']"));
//        element3.click();
//        Thread.sleep(3000);

        /**
         * 3 > find by tag
         */
//        WebElement select = driver.findElement(By.tagName("select"));
//        select.click();
//        Thread.sleep(3000);

        /**
         * 3 > find by link text
         */
//        driver.findElement(By.linkText("Download Wikipedia for Android or iOS")).click();
//        Thread.sleep(3000);

        /**
         * 4 > find by partial link text
         */
//        driver.findElement(By.partialLinkText("Download")).click();
//        Thread.sleep(3000);

        /**
         * 4 > find by class - class must be uniq
         */
//        driver.findElement(By.className("svg-search-icon")).click();
//        Thread.sleep(3000);

        /**
         * 4 > find by css selector
         */
        driver.findElement(By.cssSelector(".svg-search-icon")).click();
        //driver.findElement(By.cssSelector("#htmlTagId")).click();
        Thread.sleep(3000);


        driver.close();
        driver.quit();
    }
}
