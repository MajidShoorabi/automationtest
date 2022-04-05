package com.github.majidshoorabi.automationtest.session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * @author majid.shoorabi
 * @created 2022-05-April
 * @project automationtest
 */

public class Sample05 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://varzesh3.com");
        Thread.sleep(3000);

        /**
         * Execute JavaScript commands
         *
         * window.scrollTo(0, document.body.scrollHeight)   - js command that scroll page to end
         */
        driver.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(100);

        /**
         * Screenshot from screen
         */
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {

            /**
             * extension's file must be png
             */
            FileUtils.copyFile(screenshotFile, new File("screenshots/homePageScreenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.close();
        driver.quit();
    }
}
