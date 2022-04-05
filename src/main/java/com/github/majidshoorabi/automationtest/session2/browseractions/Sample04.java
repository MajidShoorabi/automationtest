package com.github.majidshoorabi.automationtest.session2.browseractions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-05-April
 * @project automationtest
 */

public class Sample04 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://google.com");
        Thread.sleep(1000);

        /**
         * Browser Action 13 > Window size
         */
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        System.out.println(size.width);
        System.out.println(size.height);

        /**
         * Browser Action 14 > set windows size
         */
        driver.manage().window().setSize(new Dimension(800,600));
        Dimension newSize = driver.manage().window().getSize();

        assert newSize.width == 800;

        Thread.sleep(1000);

        /**
         * Browser Action 15 > Get window position
         */
        Point position = driver.manage().window().getPosition();
        System.out.println(position);
        System.out.println(position.x);
        System.out.println(position.y);


        /**
         * Browser Action 16 > Change window position
         */
        driver.manage().window().setPosition(new Point(500,500));
        assert driver.manage().window().getPosition().x == 500;

        Thread.sleep(2000);

        /**
         * Browser Action 17 > Minimize window
         */
        driver.manage().window().minimize();
        Thread.sleep(3000);

        /**
         * Browser Action 18 > Maximize window
         */
        driver.manage().window().maximize();
        Thread.sleep(3000);

        /**
         * Browser Action 18 > Full screen window
         */
        driver.manage().window().fullscreen();
        Thread.sleep(3000);


        driver.close();
        driver.quit();
    }
}
