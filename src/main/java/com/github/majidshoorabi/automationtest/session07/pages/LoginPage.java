package com.github.majidshoorabi.automationtest.session07.pages;

import lombok.*;
import org.openqa.selenium.By;
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
public class LoginPage {

    private ChromeDriver drive;
    private String username_textBox_id;
    private String password_textBox_id;
    private String login_button_id;


    public LoginPage(ChromeDriver drive) {
        this.drive = drive;
    }

    public void enterUsername(String username) {
        this.drive.findElement(By.id(Locator.USERNAME_TEXT_BOX_ID.toString())).sendKeys(username);
    }

    public void enterPassword(String password) {
        this.drive.findElement(By.id(Locator.PASSWORD_TEXT_BOX_ID.toString())).sendKeys(password);
    }

    public void clickOnLoginButton() {
        this.drive.findElement(By.id(Locator.LOGIN_BUTTON_ID.toString())).click();
    }

}
