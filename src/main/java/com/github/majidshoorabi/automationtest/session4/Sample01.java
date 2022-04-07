package com.github.majidshoorabi.automationtest.session4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-07-April
 * @project automationtest
 */

public class Sample01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://trytestingthis.netlify.app/");

        /**
         * example of absolute xpath:
         *   /html/body/dev[3]/div[2]/form/fieldset/input[9]
         *
         *
         * Relational Xpath
         *
         * // * [ @attribute='value']
         * // * [ @name()='value']
         * // * [ text()='value']
         *
         * // : Html page part in all of page
         * * : AnyTag
         *
         *
         * Relational examples:
         *      1.  //*[@id='fname']
         *      2.  //*[@value='option 1']
         *      3.  //*[@class='header']
         *      4.  //*[test()='Option 1']
         *      5.  //label[test()='Option 1']
         *      6.  //*[@id='moption' and @name='option1']
         *      7.  //*[@name='option1' or @value='Option 1']
         *      8.  //*[(@name='option1' or @value='Option 1') and (@type='checkbox')]
         *
         *
         *  Parent and Child:
         *
         *  Example access from child to parent:
         *      //*[@id='uname']/..
         *
         * Example access from parent to child:
         *      1.  //*[@class='login form']/* /* ...
         *      2.  //*[@class='login form']//*[@value='Login']
         *
         *
         * Example of xpath index:
         *      1.  //*[@id='moption'][2]               // index is from all elements that find with this excretion of it's parent
         *      2.  (//*[text()='Option 1'])[1]         //index is from all elements that find with this excretion
         *
         *
         *  Nested xpath:
         *      1.  //tr[td[text()='Actor']]
         *      2.  //tr[.//td[text()='Actor']]
         */

        /**
         * find by xpath on element object
         */
        WebElement element = driver.findElement(By.cssSelector(".svg-search-icon"));
        element.findElement(By.xpath("../.."));
        element.findElement(By.xpath("//*[@value='option']"));

        /**
         *  Syntax:
         *      // tag [ condition ]
         *      // tag [ condition1 and condition2 ]
         *      // tag [ condition1 or condition2 ]
         *      // tag [ ( condition1  or/and  condition2 )  or/and  condition3 ]
         *
         *      // tag [ condition1 ] / ..                                           Parent
         *      // tag [ condition1 ] / tag [ condition2 ]                           Child
         *      // tag [ condition1 ] // tag [ condition2 ]                          Search through children
         *
         *      // tag [ condition ] [ index ]
         *      ( // tag [ condition ] ) [ index ]
         *      // tag [ tag [ condition ] ]
         *      // tag [ .// tag [ condition ] ]
         *
         *
         *
         */

        driver.close();
        driver.quit();

    }
}
