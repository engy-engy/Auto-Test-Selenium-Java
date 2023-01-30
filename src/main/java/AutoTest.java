import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutoTest {

    WebDriver driver = new ChromeDriver();


    @Test
    public void AutoTest() throws InterruptedException {

        driver.get("https://grinfer.com/");
        driver.manage().window().maximize();


        String getURI = driver.getCurrentUrl();
        Assert.assertEquals(getURI,"https://grinfer.com/");

        String getTitel = driver.getTitle();
        Assert.assertEquals(getTitel,"Top Online Courses | Grinfer");

        String getPage = driver.getPageSource();
        System.out.println("Page" + getPage);

        Thread.sleep(Duration.ofSeconds(5));
        driver.close();
    }






}
