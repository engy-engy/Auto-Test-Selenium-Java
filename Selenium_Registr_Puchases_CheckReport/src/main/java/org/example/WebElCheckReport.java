package org.example;

import org.openqa.selenium.By;

public class WebElCheckReport {
    protected By inputUserName = By.xpath("//div[@class='form_group']//input[@type='text']");
    protected By inputPassword = By.xpath("//div[@class='form_group']//input[@type='password']");
    protected By btnLogin = By.xpath("//div[@class='login-box']//input[@type='submit']");
    protected By textReport = By.xpath("//div[@class='error-message-container error']//h3[@data-test='error']");
    protected String textInfo = "Epic sadface: Username and password do not match any user in this service";
}
