import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindImage extends Data{

    WebDriver driver = new ChromeDriver();
    Data getDate = new Data();
    private By btnOpenWindow = By.xpath("//div[@class='TkpKu']//button[@type='button']");
    private By openFile = By.xpath("//div[@class='Y7cLH QzYnR L2Q39']//input[@type='file']");
    private By openFile1 = By.cssSelector(".RdTIh");

    @Test
    public void findImage(){
        driver.get(getDate.URI);
        driver.manage().window().maximize();
        driver.findElement(btnOpenWindow).click();
        driver.findElement(openFile).sendKeys(getDate.pathFile);

    }



}
