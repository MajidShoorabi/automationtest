package com.github.majidshoorabi.automationtest.session10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

/**
 * @author majid.shoorabi
 * @created 2022-22-April
 * @project automationtest
 */

public class Sample01 {

    public static ChromeDriver driver;

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://trytestingthis.netlify.app/");

        driver.manage().window().maximize();
        Thread.sleep(1000);

        /**
         * Scroll by execute JavaScript command:
         *
         */
//        driver.executeScript("window.scrollBy(0,200)");
//        Thread.sleep(2000);


        /**
         * Scroll to a point by execute JavaScript command:
         *
         */
//        driver.executeScript("window.scrollTo(0,500)");
//        Thread.sleep(2000);


        /**
         * Scroll to visible an element (Scroll to element if could find by driver)
         *
         */
//        driver.get("https://www.imdb.com/chart/top/");
//        WebElement the_handmaiden = driver.findElement(By.linkText("The Handmaiden"));
//        System.out.println(the_handmaiden);
//        driver.executeScript("arguments[0].scrollIntoView();", the_handmaiden);
//
//        Thread.sleep(3000);


        /**
         * Scroll until to find an element
         */
//        driver.get("https://www.imdb.com/chart/top/");
//        boolean result = scrollToFindElement(By.linkText("a_wrong_text"), 1800);
//        System.out.println(result);

        /** solution 2 */
//        driver.get("https://www.imdb.com/chart/top/");
//        String result = scrollToFindElementOrThrowException(By.linkText("a_wrong_text"), 1800);
//        System.out.println(result);

        /**
         * Scroll to end of the page
         * solution 1
         */
//        driver.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        /** solution 2 */
//        driver.executeScript("window.scrollToy(0,document.body.scrollHeight)");

        /**
         * Scroll to start of the page
         */
//        driver.executeScript("window.scrollTo(0,0)");


        /**
         * Scroll Horizontally
         */
//        driver.get("https://datatables.net/examples/basic_init/scroll_x.html");
//        driver.executeScript("document.querySelector(''table td:last-child).scrollIntoView()");


        /*******************************
         * Is displayed
         */
//        driver.get("https://www.imdb.com/chart/top/");
//        WebElement element = driver.findElement(By.linkText("Monty Python and the Holy Grail"));
//        System.out.println(element);
//        boolean displayed = element.isDisplayed();
//        System.out.println(displayed);


        /*******************************
         * Scroll by Using ActionChains
         */
//        WebElement element1 = driver.findElement(By.xpath("//*[@name='message']"));
//        WebElement element2 = driver.findElement(By.id("fname"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element2).clickAndHold().moveToElement(element1).release().perform();
//
//        Thread.sleep(3000);

        /*******************************
         * Scroll by Using Keyboard
         */
//        WebElement htmlTag = driver.findElement(By.tagName("html"));
//        Actions actions = new Actions(driver);
//        actions.sendKeys(htmlTag, Keys.END).perform();
//        Thread.sleep(3000);
//        actions.sendKeys(htmlTag, Keys.HOME).perform();
//        Thread.sleep(3000);


        /*******************************
         * Scroll by Using Keyboard to find element
         */
//        driver.get("https://www.imdb.com/chart/top/");
//        Actions actions = new Actions(driver);
//        scrollToFindElementByScrollThroughKeyboard(By.linkText("a_wrong_text"), actions);

        /**
         * Scroll through driver
         */
        driver.get("https://www.imdb.com/chart/top/");
        WebElement element = driver.findElement(By.linkText("Dances with Wolves "));
        // python code
        // element.location_once_scrolled_into_view
        // java code ???


        driver.close();
        driver.quit();

    }


    /**
     * Scroll page with keyboard to find element
     *
     * @param locator
     * @param actions
     * @return
     * @throws InterruptedException
     */
    public static boolean scrollToFindElementByScrollThroughKeyboard(By locator, Actions actions) throws InterruptedException {
        WebElement htmlTag = driver.findElement(By.tagName("html"));
        for (int i = 0; i < 10; i++) {
            try {
                driver.findElement(locator);
                return true;
            } catch (Exception ex) {
//                actions.sendKeys(htmlTag, Keys.DOWN).perform();
//                // for more scroll
//                actions.sendKeys(htmlTag, Keys.DOWN).perform();
//                actions.sendKeys(htmlTag, Keys.DOWN).perform();
//                actions.sendKeys(htmlTag, Keys.DOWN).perform();
                actions.sendKeys(htmlTag, Keys.PAGE_DOWN).perform();
                Thread.sleep(500);
            }
        }
        return false;
    }

    /**
     * Scroll to element if currently cannot be found or not sure if it is in the page (Assertion)
     *
     * @param locator
     * @param pixel
     * @return
     * @throws InterruptedException
     */
    public static String scrollToFindElementOrThrowException(By locator, int pixel) throws Exception {

        for (int i = 0; i < 10; i++) {
            try {
                driver.findElement(locator);
                return "The element has been found";
            } catch (Exception ex) {
                driver.executeScript(String.format("window.scrollBy(0,%d)", pixel));
                Thread.sleep(500);
            }
        }
        throw new Exception("The element cannot be found");
    }


    /**
     * Scroll to element if currently cannot be found or not sure if it is in the page (True/False)
     *
     * @param locator
     * @param pixel
     * @return
     * @throws InterruptedException
     */
    public static boolean scrollToFindElement(By locator, int pixel) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            try {
                driver.findElement(locator);
                return true;
            } catch (Exception ex) {
                driver.executeScript(String.format("window.scrollBy(0,%d)", pixel));
                Thread.sleep(500);
            }
        }
        return false;
    }
}
