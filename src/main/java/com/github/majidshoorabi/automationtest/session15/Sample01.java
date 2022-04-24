package com.github.majidshoorabi.automationtest.session15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;


/**
 * @author majid.shoorabi
 * @created 2022-24-April
 * @project automationtest
 */

public class Sample01 {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();

        /**
         * Website permissions
         *
         * 0    >   Ask
         * 1    >   Allow
         * 2    >   Block
         */
        Map<String, Object> prefs = new HashMap<>();
//        prefs.put("profile.default_content_setting_values.geolocation", 1);
//        prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
//        prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
        prefs.put("profile.default_content_setting_values.notifications", 1);

        ChromeOptions options = new ChromeOptions();

        /** Open windows maximized */
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);

//        driver.get("https://whatmylocation.com/");
//        Thread.sleep(2000);


        /**
         * JavaScrip command to show request permission:
         *      Notification.requestPermission();
         *
         */
        driver.get("https://www.play1.automationcamp.ir/index.html");
        driver.executeScript("Notification.requestPermission();");
        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}
