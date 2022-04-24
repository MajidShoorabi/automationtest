package com.github.majidshoorabi.automationtest.session15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * @author majid.shoorabi
 * @created 2022-23-April
 * @project automationtest
 */

public class Sample01 {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /**
         * 1- Switch to frame
         *
         * You cannot access to this Url from Iran's IPs
         */
//        driver.get("https://www.python.org/dev/peps/");
//        Thread.sleep(1000);
//
//        driver.switchTo().frame("twitter-widget-0");                 // Select by name or id
//        driver.switchTo().frame(0);                                     // Select by index
//        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));    // Select by WebElement
//
//        driver.findElement(By.xpath("//span[@title='Python Package Index']"));
//        Thread.sleep(3000);
//
//        System.out.println("PASS");


        /**
         * 2- Switch to first page
         */
//        driver.switchTo().defaultContent();
//
//        driver.findElement(By.id("about"));
//        Thread.sleep(3000);
//        assert driver.getTitle().contains("About Python");
//        System.out.println("PASS");


        /**
         *
         */
//        driver.get("http://play1.automationcamp.ir/frames.html");
//        Thread.sleep(1000);
//        driver.switchTo().frame("frame1");
//        driver.findElement(By.id("click_me_1")).click();
//        Thread.sleep(1000);

        // it doesn't work ????
        // driver.switchTo().frame("frame2");
        // driver.findElement(By.id("click_me_2")).click();
        // System.out.println("PASS");

        /**
         * 3- Switch to parent frame
         */
//        driver.switchTo().parentFrame();


        /**
         * 4- Find frame of element
         */
        driver.get("https://www.python.org/dev/peps/");
        Thread.sleep(2000);
        By locator = By.xpath("//span[@title='Python Package Index']");
        WebElement frame = get_frame_of_element(locator, driver);

        driver.switchTo().frame(frame);
        driver.findElement(locator).click();
        Thread.sleep(2000);
        System.out.println("PASS");


        driver.close();
        driver.quit();
    }


    public static WebElement get_frame_of_element(By locator, ChromeDriver driver) throws Exception {
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        for (WebElement iframe : iframes) {
            driver.switchTo().frame(iframe);
            try {
                driver.findElement(locator);
                driver.switchTo().defaultContent();
                return iframe;
            } catch (Exception e) {
            }
        }
        throw new Exception("Could not find the element in all frames");
    }
}
