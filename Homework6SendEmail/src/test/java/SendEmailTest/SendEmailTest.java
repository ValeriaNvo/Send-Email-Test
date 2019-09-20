package SendEmailTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendEmailTest {
    static WebDriver driver;


    @BeforeClass
    public static void beforeMethod () {driver = new ChromeDriver();}


    @Test
    public void testMethod () throws InterruptedException {
        driver.get ("https://accounts.ukr.net/");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#id-l")).sendKeys("testemail1");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#id-p")).sendKeys ("testpassword");
        Thread.sleep(700);
        driver.findElement(By.cssSelector("body > div > div > main > form > button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#content > aside > button")).click();
        Thread.sleep(700);
        driver.findElement(By.cssSelector("#screens > div > div.screen__content > section.sendmsg__form > div:nth-child(1) > div.sendmsg__form-label-field.auto.cropped.ui-sortable > input.input")).sendKeys("testemail2@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#screens > div > div.screen__content > section.sendmsg__form > div:nth-child(4) > div.sendmsg__form-label-field.subject > input")).sendKeys("Hello");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#screens > div > div.screen__head > div > button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#\\31 0001 > span.sidebar__list-link-name")).click();
        Thread.sleep(5000);

    }


    @AfterClass
    public static void afterMethod() {

        driver.quit();
    }
}
