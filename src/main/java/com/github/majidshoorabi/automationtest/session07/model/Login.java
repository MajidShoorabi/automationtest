package com.github.majidshoorabi.automationtest.session07.model;

import lombok.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-14-April
 * @project peysaz
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Login {

    private ChromeDriver drive;
    private String username_textBox_id;
    private String password_textBox_id;
    private String login_button_id;


    public Login(ChromeDriver drive) {
        this.drive = drive;
        this.username_textBox_id = "txtUsername";
        this.password_textBox_id = "txtPassword";
        this.login_button_id = "btnLogin";
    }

}
