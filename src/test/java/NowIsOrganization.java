import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NowIsOrganization {
    private WebDriver driver;
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    @Test
    public void funWithSelenium(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
        List<WebElement> elements = driver.findElements(By.className("inventory_item"));
        WebElement element = driver.findElement(By.className("inventory_item"));
        assertEquals(6,elements.size());
        assertTrue(element.isDisplayed());
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
