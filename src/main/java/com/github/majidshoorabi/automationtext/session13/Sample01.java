package com.github.majidshoorabi.automationtext.session13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
//        driver.wait(1000);


        /*********************
         * Alert
         *
         * You can't access to this url from Iran's IPs
         */
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        /**
         * 1- Get text
         */
//        driver.findElement(By.xpath("//Button[test()='Click for JS Alert']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        Thread.sleep(3000);


        /**
         * 2- Accept
         */
//        driver.findElement(By.xpath("//Button[test()='Click for JS Confirm']")).click();
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//
//        driver.findElement(By.xpath("//*[text()='You clicked: Ok']"));
//        /** or */
//        String pageSource = driver.getPageSource();
//        assert pageSource.contains("You clicked: Ok");
//        Thread.sleep(3000);


        /**
         * 3- Dismiss
         */
//        driver.findElement(By.xpath("//Button[test()='Click for JS Confirm']")).click();
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//
//        driver.findElement(By.xpath("//*[text()='You clicked: Cancel']"));
//        /** or */
//        String pageSource = driver.getPageSource();
//        assert pageSource.contains("You clicked: Cancel");
//        Thread.sleep(3000);


        /**
         * 4- Send text
         */
//        driver.findElement(By.xpath("//Button[test()='Click for JS Promp']")).click();
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("This is automation text");
//        alert.accept();
//
//        assert driver.getPageSource().contains("This is automation text");
//        Thread.sleep(3000);


        /***************
         * Dialog/Popup
         * * You can close popup by click on below page
         *
         */
//        driver.get("https://material.angular.io/components/dialog/examples");
//
//        WebElement element = driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and text()='CDK']"));
//        Point location = element.getLocation();
//        driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']")).click();
//        /** validation */
//        driver.findElement(By.xpath("//h3[text()='Develop across all platforms']"));
//        driver.findElement(By.xpath("//button//*[text()='Install']"));
//        driver.findElement(By.xpath("//button//*[text()='Cancel']"));
//
//        Actions actions = new Actions(driver);
//        actions.moveByOffset(location.x, location.y).pause(500).click().perform();
//        driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']")).click();

        /***************
         * Snack-bar
         */
//        driver.get("https://material.angular.io/components/snack-bar/examples");
//
//        WebElement element = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
//        element.clear();
//        element.sendKeys("10");
//        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and normalize-space(text())='Pizza party']/ancestor::button")).click();
//
//        /** 1 */
//        driver.findElement(By.xpath("//*[@class='cdk-overlay-container']//*[contains(text(), 'Pizza party')]"));
//
//        /** 2 */
////        driver.findElement(By.xpath("//*[@class='cdk-overlay-container']/following::*[contains(text(), 'Pizza party')]"));
//
//        /** 3 */
////        System.out.println(driver.getPageSource());
//        driver.findElement(By.xpath("//snack-bar-container"));
//        driver.findElement(By.xpath("//snack-bar-container//*[contains(text(), 'Pizza party')]"));
//
//        System.out.println("Test Passed");


        /***************
         * Tooltip
         */
        driver.get("https://material.angular.io/components/tooltip/examples#tooltip-message");

        WebElement inputElement = driver.findElement(By.id("mat-input-2"));
        inputElement.clear();
        inputElement.sendKeys("Test Automation");

        WebElement hoverElement = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-tooltip-trigger mat-raised-button mat-button-base'])[4]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();

        List<WebElement> tooltipElements = driver.findElements(By.xpath("//*[@class='cdk-overlay-container']/descendant::*"));
        check_tooltip_is_visible(tooltipElements,"Test Automation");

        actions.moveToElement(inputElement).perform();
        Thread.sleep(2000);
        tooltipElements = driver.findElements(By.xpath("//*[@class='cdk-overlay-container']/descendant::*"));

        assert tooltipElements.isEmpty();
        System.out.println("Test Passed");
        Thread.sleep(2000);


        driver.close();
        driver.quit();
    }


    public static void check_tooltip_is_visible(List<WebElement> elementList, String checkText) throws Exception {
        for (WebElement el : elementList) {
            try {
                String text = el.getText();
                assert text.equals(checkText);
                return;
            } catch (AssertionError ex) {
            }
        }
        throw new Exception("Tooltip message cannot find");
    }
}
