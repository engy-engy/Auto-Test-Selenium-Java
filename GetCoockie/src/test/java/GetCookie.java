import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class GetCookie {
    WebDriver driver = new ChromeDriver();
    @Test
    public void AutoTest() throws InterruptedException {

        driver.get("https://github.com/engy-engy/");
        driver.manage().window().maximize();

        Cookie getCookie = new Cookie("user_session","zC2hljSSF6YVjkVSNdw72BKT5SRIjkk8VhkYh3H4Y_NE0gD9");

        driver.navigate().refresh();

        Set<Cookie> cookieSet = driver.manage().getCookies();
        System.out.println("Coockie========>" + cookieSet);

        Thread.sleep(Duration.ofSeconds(5));
        driver.close();
    }
}
