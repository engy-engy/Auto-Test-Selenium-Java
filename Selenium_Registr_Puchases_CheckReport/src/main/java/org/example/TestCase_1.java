package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

    public class TestCase_1 extends WebElCheckPurchases {
        @Test
        public void checkPurchases() throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            Data getData = new Data();

            driver.manage().window().maximize();
            driver.get(getData.URI);                                            //заходим на сайт

            driver.findElement(inputUserName).sendKeys(getData.userName);       //вводим username
            driver.findElement(inputPassword).sendKeys(getData.password);       //вводим пароль

            driver.findElement(btnLogin).click();                               //нажимаем кнопку логин
            driver.findElement(addProduct).click();                             //добавляем первый продукт
            driver.findElement(btnBasket).click();                              //нажимаем на корзину
            driver.findElement(btnCheckout).click();                            //нажимаем кнопку чекаут

            driver.findElement(inputFirstName).sendKeys(getData.checkoutText);  //вводим test в поле firstname
            driver.findElement(inputLastName).sendKeys(getData.checkoutText);   //вводим test в поле lastname
            driver.findElement(inputZipCode).sendKeys(getData.checkoutText);    //вводим test в поле zipcode

            driver.findElement(inputContinue).click();                          //нажимаем кнопку continue
            driver.findElement(btnFinish).click();                              //нажимаем кнопку finish
        }
    }