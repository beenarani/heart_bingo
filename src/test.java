import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {

        String url = "https://www.heartbingo.co.uk";

        //1.1 - Launch the webdriver
        WebDriver driver = new ChromeDriver();

        //1.2 Get Url
        driver.get(url);

        //1.3 - Accept the cookies
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        //1.4 - Verify the Live casino Text
        String expectedText = "Online Bingo Site";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedText, actualText);
        System.out.println(actualText);
    }
}
