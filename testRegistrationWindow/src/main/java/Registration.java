import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

import static java.sql.DriverManager.getDriver;

public class Registration  {

    private By btnJoinFree = By.linkText("Sign up");
    private By inputFirstName = By.id("user_first_name");
    private By inputLastName = By.xpath("//div[@class='form-group']//input[@class='form-control']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@type='email']");
    private By inputUserName = By.id("user_username");
    private By inputPassword = By.id("user_password");
    private By btnJoinRegistration = By.linkText("Join");
    private By btnCopyEmail = By.cssSelector("#pre_copy");



    @Test
    public void registration() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://unsplash.com/");
        driver.findElement(btnJoinFree).click();
        driver.findElement(inputFirstName).sendKeys("newnew");
        driver.findElement(inputLastName).sendKeys("sendsend");

        driver.switchTo().newWindow(WindowType.TAB).get("https://tempmail.plus/ru/#!");
        driver.findElement(btnCopyEmail).click();

        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(0));

        driver.findElement(inputEmail).sendKeys(Keys.LEFT_CONTROL + "v");
        driver.findElement(inputUserName).sendKeys("tetest");
        driver.findElement(inputPassword).sendKeys("tetest1234");
        driver.findElement(btnJoinRegistration).click();

        Thread.sleep(Duration.ofSeconds(3));

        driver.quit();

    }

}