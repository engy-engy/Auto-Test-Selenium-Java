package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestCase_2 extends WebElCheckReport{
     @Test
    public void checkBugReport() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        Data data = new Data();

        driver.get(data.URITwoTest);                                        //заходим на сайт
        driver.findElement(inputUserName).sendKeys(data.userNameTwoTest);   //вводим поле username
        driver.findElement(inputPassword).sendKeys(data.passwordTwoTest);   //вводим поле password
        driver.findElement(btnLogin).click();                               //нажимаем кнопку войти
        String text = driver.findElement(textReport).getText().toString();  //получаем текст
        if (text.contains(textInfo)){                                       //проверка текста ошибки
            System.out.println(text);                                       //выводим в консоль
        }
    }
}
