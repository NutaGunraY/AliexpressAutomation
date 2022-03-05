import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathExercises {
    WebDriver driver;

    @After
    public void quiting() {
        //driver.quit();
    }

    @Before
    public void propertySetting() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void xPath(){
        WebDriverWait wait = new WebDriverWait(driver,100);
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        String name = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText();
        System.out.println(name);

    }
}