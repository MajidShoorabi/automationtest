package com.github.majidshoorabi.session11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-22-April
 * @project automationtest
 */

public class Sample01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://material.angular.io/components/categories");
        driver.manage().window().maximize();

        /**
         * 1- 'By' Class
         */
//        driver.findElement(By.xpath(""));


        WebElement element;
        /**
         * 2- Get Text
         */
//        element = driver.findElement(By.className("mat-button-wrapper"));
//        String text = element.getText();
//        System.out.println(text);

        /**
         * 3-  Get Link, Class, ID, and ... attributes
         */
//        element = driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and text()='Components']/.."));
//        String clazz = element.getAttribute("class");
//        System.out.println(clazz);
//        assert clazz.contains("selected");
//
//        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and text()='CDK']/..")).click();
//        Thread.sleep(500);
//        String clazz1 = element.getAttribute("class");
//        System.out.println(clazz1);
//        assert !clazz1.contains("selected");

        /**
         * 4- Radio Button
         */
//        driver.get("https://material.angular.io/components/slide-toggle/examples");
//        element = driver.findElement(By.id("mat-radio-2"));
//        String clazz = element.getAttribute("class");
//        System.out.println(clazz);
//        assert !clazz.contains("checked");
//
//        WebElement accentRdo = driver.findElement(By.id("mat-radio-3"));
//        String accentClazz = accentRdo.getAttribute("class");
//        assert accentClazz.contains("checked");
//
//        element.click();
//
//        Thread.sleep(1000);
//
//        clazz = element.getAttribute("class");
//        System.out.println(clazz);
//        assert clazz.contains("checked");
//
//        accentClazz = accentRdo.getAttribute("class");
//        assert !accentClazz.contains("checked");


        /**
         * 5- Switch Button
         */
//        driver.get("https://material.angular.io/components/slide-toggle/examples");
//        element = driver.findElement(By.id("mat-slide-toggle-1"));
//        String clazz = element.getAttribute("class");
//        System.out.println(clazz);
//        assert !clazz.contains("checked");
//
//        element.click();
//        Thread.sleep(1000);
//
//        clazz = element.getAttribute("class");
//        System.out.println(clazz);
//        assert clazz.contains("checked");


        /**
         * 6- Checkbox
         */
//        driver.get("https://material.angular.io/components/slide-toggle/examples");
//        element = driver.findElement(By.id("mat-checkbox-2"));
//        String clazz = element.getAttribute("class");
//        System.out.println(clazz);
//        assert !clazz.contains("checked");
//
//        element.click();
//        Thread.sleep(1000);
//
//        clazz = element.getAttribute("class");
//        System.out.println(clazz);
//        assert clazz.contains("checked");

        /**
         * 7- Enabled/Disabled
         */
//        driver.get("https://material.angular.io/components/slide-toggle/examples");
//        element = driver.findElement(By.id("mat-checkbox-2"));
//        element.click();
//        Thread.sleep(1000);
//        WebElement  switchToggled = driver.findElement(By.id("mat-slide-toggle-1"));
//        assert switchToggled.getAttribute("class").contains("disabled");
//        Thread.sleep(1000);


        /**
         * 8- Get value of input
         */
//        driver.get("https://material.angular.io/components/input/examples#input-error-state-matcher");
//        Thread.sleep(1000);
//        element = driver.findElement(By.id("mat-input-1"));
//        element.sendKeys("This is session 11");
//        Thread.sleep(1000);
//        String value = element.getAttribute("value");
//        System.out.println(value);
//        assert value.equals("This is session 11");
//        Thread.sleep(1000);

        /**
         * 9- Input Field Errors
         */
        driver.get("https://material.angular.io/components/input/examples#input-error-state-matcher");
        Thread.sleep(1000);
        WebElement parentElement = driver.findElement(By.xpath("//*[@id='mat-input-1']/ancestor::mat-form-field"));
        element = driver.findElement(By.id("mat-input-1"));

        assert !parentElement.getAttribute("class").contains("dirty");

        element.sendKeys("This is session 11");
        Thread.sleep(1000);
        assert parentElement.getAttribute("class").contains("dirty");


        driver.close();
        driver.quit();
    }
}
