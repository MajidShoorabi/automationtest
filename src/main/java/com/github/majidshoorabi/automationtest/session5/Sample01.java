package com.github.majidshoorabi.automationtest.session5;

import io.github.bonigarcia.wdm.WebDriverManager;
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
         * Example some methods:
         *      1.  //*[contains(@id,'lna')]
         *      2.  //*[contains(text,'lna')]
         *      3.  //*[start-with(@id,'lna')]
         *      4.  //*[start-with(@id,'lna')]
         *      5.  //*[start-with(@class, 'lan')]
         *      6.  //tbody//tr[position()=2]           ===              //tboody//tr[3]
         *      7.  //tboody//tr[last()]
         *      8.  //tboody//tr[last()]/td[1]
         *      9.  //tboody//tr[last()-1]
         *      10. //tboody//tr[3-2]
         *      11. //tboody[count(.//tr)=7]
         *      12. //tboody[count(//tr)=7]
         *
         *
         * Ignore case methods:
         *      1.   //*[normalize-space(text())='Option 1']                    just normalize space be at first or end of string
         *      2.   //*[normalize-space(@id='moption')]
         *      3.   //*[translate(@value,"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz") = 'option 1']
         *      4.   //*[normalize-space(translate(@value,"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz") = 'option 1']
         *      5.   //*[string-length(@id)=4]
         *      6.   //*[round(text())='430']
         *      7.   //*[floor(text())='448']
         *      8.   //*[@type='radio'  and  not(@id='male')]
         *      9.   //*[substring-before(text(), ':')='Username']
         *      9.   //*[substring-after(text(), ':')='test']
         *
         *
         *
         *
         *  Syntax:
         *      contains():             // * [ contains(   text(), 'string') ]
         *                              // * [ contains(   text(),  'string')  and  @id='some-id' ]
         *
         *      starts-with():          // * [ starts-with( text(), 'string') ]
         *
         *      position():             // * [ position() = 3 ]
         *
         *      last():                 // * [ last() ]
         *
         *      count():                // tbody [ count( .//tr ) = 7 ]
         *
         *      normalize-space():      // * [ normalize-space ( text() ) ] = 'Option1' ]
         *                              // * [ normalize-space ( @id ) ] = 'Option1' ]
         *
         *      translate():            //  * [ translate ( text(), 'OPTION', 'option') = 'option1' ]
         *
         *      Combine normalize-space() and translate():
         *                              // * [ normalize-space ( translate ( translate (text(), 'OPTION', 'option') ) = 'option1' ]
         *
         *      string-length():        // * [ string-length ( text() ) > 30 ]
         *                              // * [ string-length ( @id ) = 4 ]
         *
         *      round():                // td [ round( text() ) = '54' ]            ===           // td [text() = '53.76' ]
         *
         *      floor():                // td [ floor( text() ) = '53' ]            ===           // td [text() = '53.76' ]
         *
         *      not():                  // * [ type() = 'radio'  and  @id='femail' ]        ===     // * [ type() = 'radio' and not ( @id = 'male' ) ]
         *
         *      substring-before():     // * [ substring-before ( text () , ':' ) = 'Password' ]
         *
         */

        driver.close();
        driver.quit();
    }
}
