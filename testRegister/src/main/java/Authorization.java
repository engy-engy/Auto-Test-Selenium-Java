import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization extends Data{

    private By btnLogin = By.linkText("Log in");
    private By inputEmail = By.id("user_email");
    private By inputPassword = By.id("user_password");
    private By btnLoginFinish = By.xpath("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']");
    private By getErrorText = By.xpath("//div[@class='row']//div[@class='col-xs-10 col-sm-6 center-block flash__message']");

    @Test
    public void authorization(){
        WebDriver driver = new ChromeDriver();
        Data getData = new Data();

        driver.get(getData.URI);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnLoginFinish).click();


    }
    @Test
    public void errorAuthorization(){
        WebDriver driver = new ChromeDriver();
        Data getData = new Data();

        driver.get(getData.URI);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);
        driver.findElement(btnLoginFinish).click();

        String getError = driver.findElement(getErrorText).getText();

        Assert.assertEquals("Invalid email or password.",getError);



    }


}
