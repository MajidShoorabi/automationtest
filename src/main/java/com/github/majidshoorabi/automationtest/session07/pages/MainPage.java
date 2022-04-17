package com.github.majidshoorabi.automationtest.session07.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author majid.shoorabi
 * @created 2022-15-April
 * @project automationtest
 */


@Getter
@Setter
public class MainPage {

    private ChromeDriver driver;

    public MainPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void checkMainPage(){
        this.driver.findElement(By.id(Locator.DASHBOARD_LABEL_ID.toString()));
    }
}
