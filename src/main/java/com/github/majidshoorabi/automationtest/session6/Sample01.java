package com.github.majidshoorabi.automationtest.session6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-14-April
 * @project peysaz
 */

public class Sample01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://trytestingthis.netlify.app/");


        /**
         * Access to elements:
         * Example parent:
         *      1.  //*[@id='abc']/parent::*[@id='def']
         *      2.  //*[@id='uname']/parent::*
         *      3.  //*[@id='uname']/parent::div[@class='login form']
         *
         *
         * Example ancestor:
         *      1.  //*[@id='abc']/ancestor::*[@id='def']
         *      2.  //td[text()='Singer']/ancestor::table
         *      3.  //td[text()='Singer']/ancestor::table[@style='with:100%']
         *
         *
         *  Example ancestor-or-self:
         *      1.  //*[@id='abc']/ancestor-or-self::*[@id='def']
         *      2.  //*[@name='uname']/ancestor-or-self::*[@id='uname ']
         *
         *
         *  Example child:
         *      1.  //*[@id='abc']/child::*[@id='def']
         *      2.  //tbody/tr[3]/child::*[text()='Singer']
         *      3.  //tbody/tr[3]/child::*
         *
         *
         *  Example descendant:
         *      1.  //*[@id='abc']/descendant::*[@id='def']
         *      2.  //table/descendant::*[text()='Singer']
         *
         *
         *  Example descendant-or-self:
         *
         *
         *  Example following:
         *      1.  //*[@id='abc']/following::*[@id='def']
         *      2.  //select[@id='option1']/following::*[@value='option 1']
         *
         * Example following-sibling:
         *      1.  //*[@id='abc']/following-sibling::*[@id='def']
         *      2.  //*[@id='abc123']/following-sibling::*[@value='option 2']
         *
         * Example preceding:
         *      1.  //*[@id='abc']/preceding::*[@id='def']
         *      2.  //select[@id='optionx']/preceding::*[@value='option 2']
         *
         * Example preceding:
         *      1.  //*[@id='abc']/preceding-sibling::*[@id='def']
         *      2.  //*[@id='abcd123']/preceding-sibling::*[@value='option 2']
         *
         */

        driver.close();
        driver.quit();
    }
}
