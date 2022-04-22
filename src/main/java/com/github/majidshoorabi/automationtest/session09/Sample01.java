package com.github.majidshoorabi.automationtest.session09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author majid.shoorabi
 * @created 2022-22-April
 * @project automationtest
 */

public class Sample01 {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://trytestingthis.netlify.app/");

        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        /**
         * Double Click
         */
//         WebElement element = driver.findElement(By.xpath("//button[text()='Double-click me']"));
//         action.doubleClick(element);
//         action.perform();
//         driver.findElement(By.xpath("//*[text()='Your Sample Double Click worked!']"));
//         Thread.sleep(2000);

        /**
         * Right Click
         */
//         WebElement element = driver.findElement(By.id("fname"));
//         action.contextClick(element).perform();
//         Thread.sleep(2000);

        /**
         * Hover mouse
         */
//         WebElement element = driver.findElement(By.xpath("//*[@class='tooltip']"));
//         action.moveToElement(element).perform();
//         Thread.sleep(2000);


        /**
         * click and hold
         */
//         driver.get("https://demos.telerik.com/kendo-ui/circular-gauge/index");
//         /* click on accept cookies */
//         driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//
//         WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'k-button-increase')]"));
//         action.clickAndHold(element).perform();
//         Thread.sleep(2000);

        /**
         * pause and release
         */
//        driver.get("https://demos.telerik.com/kendo-ui/circular-gauge/index");
//        /* click on accept cookies*/
//        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//
//        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'k-button-increase')]"));
//
//        WebElement element2 = driver.findElement(By.xpath("//*[contains(@class, 'k-button-decrease')]"));
//        action.clickAndHold(element).pause(3000).release().clickAndHold(element2).pause(4000).perform();

        /**
         * Drag and Drop
         *
         * solution 1
         *
         * You don't have access to this url from Iran
         */
//        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        WebElement droppable = driver.findElement(By.id("droppable"));
//
//        action.moveToElement(draggable).clickAndHold().moveToElement(droppable).release().perform();
//
//        Thread.sleep(3000);

        /**
         * Drag and Drop
         *
         * solution 2
         *
         * You don't have access to this url from Iran
         */
//        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        WebElement droppable = driver.findElement(By.id("droppable"));
//        action.dragAndDrop(draggable, droppable);


        /**
         * Click on an offset
         */
//        /** Get Coordinates */
//        Point location = driver.findElement(By.xpath("//*[text()='Lets you select only one option']")).getLocation();
//
//        driver.executeScript("scroll(0,500)");
//        Thread.sleep(1000);
//
//        /** Move by offset */
//        driver.findElement(By.id("option")).click();
//        action.moveByOffset(location.x, location.y).pause(1000).click().perform();
//
//        Thread.sleep(3000);


        /**
         * Drag and drop on an offset
         *
         * You don't have access to this url from Iran
         */
//        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        Point draggableLocation = driver.findElement(By.id("draggable")).getLocation();
//        Point droppableLocation = driver.findElement(By.id("droppable")).getLocation();
//
//        System.out.println(draggableLocation);
//        System.out.println(droppableLocation);
//
//        int x = draggableLocation.x - droppableLocation.x;
//        int y = draggableLocation.y - droppableLocation.y;
//
//        action.dragAndDropBy(draggable, x, y).pause(1000).perform();


        /**
         * JavaScript code:
         *
         * دستوری که برای نمایش موقعیت ماوس در کنسول وارد کردیم:
         * document.onmousemove = function(e){
         * var x = e.pageX;
         * var y = e.pageY;
         * e.target.title = "["+x+" , "+y+"]";
         * };
         *
         */


        /**
         * Element rest
         */
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement draggable = driver.findElement(By.id("draggable"));
        Rectangle rect = draggable.getRect();
        System.out.println(rect.x);
        System.out.println(rect.y);
        System.out.println(rect.width);
        System.out.println(rect.height);

        driver.close();
        driver.quit();
    }
}
