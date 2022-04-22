package com.github.majidshoorabi.automationtest.session08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author majid.shoorabi
 * @created 2022-17-April
 * @project automationtest
 */

public class Sample01 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.name("q"));

        /**
         * Type
         */
        // searchBox.sendKeys("Selenium");


        /**
         * Enter key
         */
        // searchBox.sendKeys("Selenium", Keys.ENTER);


        /**
         * Press ctrl + a
         */
        // searchBox.sendKeys("Selenium", Keys.ENTER);

        Actions action = new Actions(driver);
        // action.keyDown(Keys.CONTROL).sendKeys("a").perform();

        // Thread.sleep(1000);

        /**
         * solution 2
         */
        // WebElement element = driver.findElement(By.xpath("//body"));
        // element.sendKeys(Keys.chord(Keys.CONTROL, "a"));

        // Thread.sleep(1000);


        /**
         * Pres shift and type keys
         */
        // action.keyDown(Keys.SHIFT).sendKeys("Selenium").perform();
        // Thread.sleep(1000);

        /**
         * Solution 2
         */
        // searchBox.sendKeys(Keys.chord(Keys.SHIFT + "Selenium"));
        // Thread.sleep(1000);


        /**
         * KeyDown and keyUp
         */
        action.keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys(" tutorial").perform();
        Thread.sleep(1000);


        /**
         * Clear search box
         */
        // searchBox.clear();
        // Thread.sleep(2000);


        /**
         * solution 2
         */
        searchBox.click();
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).perform();
        Thread.sleep(2000);


        driver.close();
        driver.quit();
    }
}
