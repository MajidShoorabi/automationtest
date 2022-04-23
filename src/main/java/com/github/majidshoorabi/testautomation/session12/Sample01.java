package com.github.majidshoorabi.testautomation.session12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

/**
 * @author majid.shoorabi
 * @created 2022-22-April
 * @project automationtest
 */

public class Sample01 {

    public static ChromeDriver driver;

    public static void main(String[] args) throws Exception {

        /**
         * 1- Sleep
         */
//        System.out.println(Instant.now().getEpochSecond());
//        Thread.sleep(3000);
//        System.out.println(Instant.now().getEpochSecond());


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        /**
         * 2- Implicitly wait (the maximum time to wait, in milliseconds)
         */
//        driver.get("https://material.angular.io/components/categories");
//        driver.wait(3000);
//        driver.findElement(By.xpath("//*[text()='a_wrong_text']"));


        /**
         * 3- Wait until element has an attribute
         */
//        driver.get("https://www.play1.automationcamp.ir/expected_conditions.html");
//        WebElement trigger = driver.findElement(By.id("enabled_trigger"));
//        driver.executeScript("arguments[0].scrollIntoView();", trigger);
//        Thread.sleep(3000);
//        trigger.click();
//        wait_until_element_has_an_attribute(By.id("enabled_target"), "class", "success", 5, false);


        /**
         * 4- Wait until element has an attribute
         */
//        driver.get("https://www.play1.automationcamp.ir/expected_conditions.html");
//        WebElement trigger = driver.findElement(By.id("enabled_trigger"));
//        driver.executeScript("arguments[0].scrollIntoView();", trigger);
//        wait_until_element_has_an_attribute(By.id("enabled_target"), "class", "danger", 5, false);
//        wait_until_element_has_not_an_attribute(By.id("enabled_target"), "class", "success", 5, false);
//        Thread.sleep(3000);
//        trigger.click();
//        wait_until_element_has_an_attribute(By.id("enabled_target"), "class", "success", 5, false);
//        wait_until_element_has_not_an_attribute(By.id("enabled_target"), "class", "danger", 5, false);
//        System.out.println("Test case passed");


        /**
         * 5- Wait until element is enabled
         */
//        driver.get("https://www.play1.automationcamp.ir/expected_conditions.html");
//        WebElement enabled_trigger = driver.findElement(By.id("enabled_trigger"));
//        driver.executeScript("arguments[0].scrollIntoView();", enabled_trigger);
//        enabled_trigger.click();
//        wait_until_element_is_enabled(By.id("enabled_target"), 5);
//        System.out.println("Element is enabled now!");


        /**
         * 6- Wait until element is not enabled
         */
//        driver.get("https://www.play1.automationcamp.ir/expected_conditions.html");
//        WebElement enabled_trigger = driver.findElement(By.id("enabled_trigger"));
//        driver.executeScript("arguments[0].scrollIntoView();", enabled_trigger);
//        enabled_trigger.click();
//        wait_until_element_is_not_enabled(By.id("enabled_target"), 5);
//        System.out.println("Element is disabled now!");

        /**
         * 5- Wait until element is visible
         */
//        driver.get("https://www.play1.automationcamp.ir/expected_conditions.html");
//        WebElement trigger = driver.findElement(By.id("visibility_trigger"));
//        driver.executeScript("arguments[0].scrollIntoView();", trigger);
//        System.out.println(driver.findElement(By.id("visibility_target")).isDisplayed());
//        trigger.click();
//        wait_until_element_is_visible(By.id("visibility_target"),5);
//        System.out.println(driver.findElement(By.id("visibility_target")).isDisplayed());


        /**
         * 6- Wait until element is invisible
         */
//        driver.get("https://www.play1.automationcamp.ir/expected_conditions.html");
//        WebElement trigger = driver.findElement(By.id("visibility_trigger"));
//        driver.executeScript("arguments[0].scrollIntoView();", trigger);
//        System.out.println(driver.findElement(By.id("visibility_target")).isDisplayed());
//        trigger.click();
//        wait_until_element_is_not_visible(By.id("visibility_target"), 5);
//        System.out.println(driver.findElement(By.id("visibility_target")).isDisplayed());


        /**
         * 5- WebDriverWait until/until not Excepted Condition
         */
//        driver.get("https://www.play1.automationcamp.ir/expected_conditions.html");
//        WebElement enabled_trigger = driver.findElement(By.id("enabled_trigger"));
//        driver.executeScript("arguments[0].scrollIntoView();", enabled_trigger);
//        enabled_trigger.click();
//        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement enabled_target = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("enabled_target")));
//        System.out.println(enabled_target);


        /**
         * 8- Wait until page loaded
         */
//        driver.get("https://archive.org/details/audio_bookspoetry");
//        wait_until_page_is_load(10);


        driver.close();
        driver.quit();
    }


    public static void wait_until_page_is_load(int timeout) throws InterruptedException {
        for (int i = 0; i < timeout * 2; i++) {
            try {
                String state = (String) driver.executeScript("return document.readyState");
                assert state.equals("complete");
                System.out.println("State is: " + state);
                return;
            } catch (AssertionError | Exception ex) {
                Thread.sleep(500);
            }
        }
    }


    public static void wait_until_element_is_visible(By locator, int timeout) throws Exception {
        for (int i = 0; i < timeout * 5; i++) {
            try {
                WebElement element = driver.findElement(locator);
                assert element.isDisplayed();
                System.out.println("Test is PASSED");
                return;
            } catch (AssertionError | Exception e) {
                Thread.sleep(200);
            }
        }
    }


    public static void wait_until_element_is_not_visible(By locator, int timeout) throws Exception {
        for (int i = 0; i < timeout * 5; i++) {
            try {
                WebElement element = driver.findElement(locator);
                assert !element.isDisplayed();
                System.out.println("Test is PASSED");
                return;
            } catch (AssertionError | Exception e) {
                Thread.sleep(200);
            }
        }
    }


    public static void wait_until_element_is_not_enabled(By locator, int timeout) throws InterruptedException {
        for (int i = 0; i < 2 * timeout; i++) {
            try {
                WebElement element = driver.findElement(locator);
                assert !element.isEnabled();
                return;
            } catch (AssertionError | Exception e) {
                Thread.sleep(500);
            }
        }
    }



    public static void wait_until_element_is_enabled(By locator, int timeout) throws InterruptedException {
        for (int i = 0; i < 2 * timeout; i++) {
            try {
                WebElement element = driver.findElement(locator);
                assert element.isEnabled();
                return;
            } catch (AssertionError | Exception e) {
                Thread.sleep(500);
            }
        }
    }


    public static void wait_until_element_has_not_an_attribute(By locator, String attributeName, String attributeValue,
                                                               int timeout, boolean exact) throws Exception {
        for (int i = 0; i < timeout * 5; i++) {
            try {
                WebElement element = driver.findElement(locator);
                if (exact) {
                    assert !element.getAttribute(attributeName).equals(attributeValue);
                } else {
                    assert !element.getAttribute(attributeName).contains(attributeValue);
                }
                System.out.println("Element attribute not in or not equals: " + attributeValue);
                return;
            } catch (AssertionError | Exception e) {
                Thread.sleep(200);
            }
        }
        throw new Exception("Element attribute in or not equals: " + attributeValue);
    }


    public static void wait_until_element_has_an_attribute(By locator, String attributeName, String attributeValue,
                                                           int timeout, boolean exact) throws Exception {
        for (int i = 0; i < timeout * 5; i++) {
            try {
                WebElement element = driver.findElement(locator);
                if (exact) {
                    assert element.getAttribute(attributeName).equals(attributeValue);
                } else {
                    assert element.getAttribute(attributeName).contains(attributeValue);
                }
                System.out.println("Element attribute met: " + attributeName);
                return;
            } catch (AssertionError | Exception e) {
                Thread.sleep(200);
            }
        }
        throw new Exception("Element attribute is not: " + attributeName);
    }


}
