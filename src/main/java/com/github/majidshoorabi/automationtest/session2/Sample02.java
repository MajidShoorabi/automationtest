package com.github.majidshoorabi.automationtest.session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-04-April
 * @project automationtest
 */

public class Sample02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        /**
         * Browser Action 1 > Open browser
         */
        driver.get("https://google.com");
        Thread.sleep(1000);

//        /**
//         * Browser Action 2 > Get page title
//         */
//        String title = driver.getTitle();
//        System.out.println("PageTitle: " + title);
//
//        /**
//         * Open new Url
//         */
//        driver.get("https://Wikipedia.com");
//        Thread.sleep(1000);
//
//        /**
//         * Browser Action 3 > Back
//         */
//        driver.navigate().back();
//        Thread.sleep(1000);
//
//        /**
//         * Browser Action 4 > Forward
//         */
//        driver.navigate().forward();
//        Thread.sleep(1000);

        /**
         * Browser Action 5 > Refresh
         */
        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.close();
        driver.quit();
    }
}
