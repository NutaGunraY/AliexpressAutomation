import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VkAbuse {
    WebDriver driver;

    @After
    public void quiting(){
        //driver.quit();
    }
    @Before
    public void propertySetting(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    @Test
    public void emilMinus() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,500);
        driver.get("https://vk.com/feed");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("+77089668494");
        driver.findElement(By.cssSelector("[placeholder='Пароль']")).sendKeys("Saparbaevn3");
        driver.findElement(By.className("FlatButton__content")).click();

        //Message
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/im']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nim-dialog._im_dialog._im_dialog_635177699.nim-dialog_classic.nim-dialog_recent"))).click();
        Thread.sleep(1000);
        //Writing a message
        for(int i = 0;i<=10;i++) {
            driver.findElement(By.xpath("//div[@id='im_editable0']")).sendKeys("Спам");
            driver.findElement(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']//span[@class='im-send-btn__icon im-send-btn__icon--send']")).click();

        }

        //driver.findElement(By.xpath("//a[@href='/im']")).click();
    }
}
