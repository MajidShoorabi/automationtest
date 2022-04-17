package com.github.majidshoorabi.automationtest.session07.pages;

/**
 * @author majid.shoorabi
 * @created 2022-15-April
 * @project IntelliJ IDEA
 */

public enum Locator {

    USERNAME_TEXT_BOX_ID("txtUsername"),
    PASSWORD_TEXT_BOX_ID("txtPassword"),
    LOGIN_BUTTON_ID("btnLogin"),

    DASHBOARD_LABEL_ID("menu_dashboard_index");


    private String id;

    Locator(String id) {
        this.id = id;
    }
}
