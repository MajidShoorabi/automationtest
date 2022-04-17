package com.github.majidshoorabi.automationtest.session07.tests;

import com.github.majidshoorabi.automationtest.session07.pages.LoginPage;
import com.github.majidshoorabi.automationtest.session07.pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-15-April
 * @project automationtest
 */

@Getter
@Setter
public class LoginTest {

    private LoginPage loginPage;
    private MainPage mainPage;

    public static void main(String[] args) throws InterruptedException {

        LoginTest loginTest = new LoginTest();
    }

    public LoginTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        synchronized (driver)
        {
            driver.wait(3000);
        }

        this.loginPage = new LoginPage(driver);
        this.mainPage = new MainPage(driver);

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

        mainPage.checkMainPage();
        Thread.sleep(1000);

    }
}
