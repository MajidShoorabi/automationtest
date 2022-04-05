package com.github.majidshoorabi.automationtest.session2.browseractions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * @author majid.shoorabi
 * @created 2022-04-April
 * @project automationtest
 */

public class Sample03 {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Window Handel
         * هر صفحه چه یک پنجره باشد یا یک تب یک هندل میباشد.
         * اگر یک پنچره یک تب داشته باشد فقط یک هندل دارد.
         * اما اگر سه تب داشته باشد سه هندل دارد.
         *
         *
         * مدل مدیریت این هندل ها به ترتیب باز شدن صفحه ها میباشد که به هر کدام یک اندکس میده که ممکن است تبها در یک پنجره یا در پنجرههای مختلف باشند.
         * شماره ایندکس ها از ۱ است.
         *
         */
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://google.com");
        Thread.sleep(1000);

        /**
         * Open a new window an switch on it.
         * Open yahoo.com in new window
         */
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://varzesh3.com");

        Thread.sleep(1000);

        /**
         * Browser Action 8 > Current window
         */
        String varzesh3Handle = driver.getWindowHandle();
        System.out.println("Yahoo handle: " + varzesh3Handle);

        /**
         * Browser Action 9 > All handles
         */
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Varzesh3 handle: " + windowHandles);

        /**
         * Browser Action 10 > Switch
         */
        String[] array = windowHandles.toArray(new String[windowHandles.size()]);
        driver.switchTo().window(array[0]);

        /**
         * Browser Action 11 > Close tab
         */
        driver.close();
        Thread.sleep(1000);

        /**
         * Browser Action 12 > Quit session, close chrome session that opened by selenium
         *
         * By default driver quite automatically at end of code and teardown - if don't close session is possible that session hang up exception occurred
         */
        driver.quit();
    }
}
