package com.github.majidshoorabi.automationtest.session15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-24-April
 * @project automationtest
 */

public class Sample01 {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.play2.automationcamp.ir/index.html");

        /**
         * CSS selector
         */
        driver.findElement(By.cssSelector("input[id='fname']")).sendKeys("Automation Test");
        Thread.sleep(2000);

        /**
         * 1- select by id:
         *        tag#id_value                 input#fname    *#fname
         *
         * 2- select by class:
         *        tag.class_value             input.clazz     *.clazz
         *
         * 3- combination
         *        tag#id_value[AttrName='AttrValue']
         *
         *  4- and
         *        tag#id_value[Attr1Name='Attr1Value'][Attr2Name='Attr2Value']
         *
         * 5- or ,
         *        tag1.class_value,tag2.class_value
         *
         * 6- Sub-string Match                  <input type="checkbox" id="moption"></>
         *        ^  starts with                input[id^='mop']
         *        $  ends with                  input[id$='tion']
         *        *  partial text               input[id*='opt']
         *
         * can be combined as well:
         *          input[id*='opt'][type$='box']
         *
         *
         * 7- Child/Descendant
         *        >  Direct child                           tag#id_value>tag#id_value
         *           Descendant (child and sub-child)       tag#id_value tag#id_value
         *        +  Next-sibling (Adjacent)                tag#id_value+tag#id_value
         *
         * 8- Pseudo Class-Child
         *        First child                               tag#id_value:first-child
         *        Last child                                tag#id_value:last-child
         *        Select by index                           tag#id_value:nth-child(index)
         *        Select by index from end                  tag#id_value:nth-last-child(index)
         *        First child of its type                   tag#id_value>tag#id_value:first-ot-type
         *        Last child of its type                    tag#id_value>tag#id_value:last-ot-type
         *        Nth child of its type                     tag#id_value>tag#id_value:nth-ot-type(index)
         *
         *  other examples:
         *          <tag>:checked
         *          <tag>:disabled
         *          <tag>:enabled
         *          <tag>:empty
         *          <tag>:hover
         *          <tag>:only-of-type
         *          <tag>:only-child
         *          <tag>::placeholder
         *          <tag>:invalid
         *          <tag>:valid
         *          <tag>:link
         *          <tag>:visited
         *
         *
         */


        driver.close();
        driver.quit();
    }
}