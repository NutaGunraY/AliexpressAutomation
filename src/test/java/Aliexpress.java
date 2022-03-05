import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.matcher.FilterableList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Aliexpress {
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
    public void enterL(String login, String password) throws InterruptedException {
        //Entering login and password
        sendXpath("//input[@id='fm-login-id']",login);
        sendXpath("//input[@id='fm-login-password']",password);
        getClick("//button[contains(text(),'Войти')]");
        sleep(1000);
    }
    @Test
    public void aliexpress() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,100);
        //Opening the window with the max size of it
        driver.navigate().to("https://login.aliexpress.ru/");
        driver.manage().window().maximize();

        //Entering login and password
        enterL("vip.saparbaev@bk.ru","78123VipNut");

        //Entering in search bar the name of the product
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='SearchText']"))).sendKeys("PepeFrog");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        sleep(1000);
        //Checking the name
        int size = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("product-snippet_ProductSnippet__name__mdters"))).size();
        int counter=60;
        System.out.println(size);
        if(counter >= size){
            counter =0;
            size =0;
            getClick("//button[normalize-space()='2']");
        }
    }
    //sleep method
    private void sleep(int mil) throws InterruptedException {
        Thread.sleep(mil);
    }
    //Entering something method
    private void sendXpath(String path, String enterence) {
        driver.findElement(By.xpath(path)).sendKeys(enterence);
    }
    //Clicking on something method
    private void getClick(String path) {
        driver.findElement(By.xpath(path)).click();
    }
}
