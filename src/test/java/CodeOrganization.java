import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CodeOrganization {
WebDriver driver;
    //This method will run once before all of the tests in our class
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
    public void locators(){
        driver.get("https://www.saucedemo.com/");
        WebElement element;
        element = driver.findElement(By.id("user-name"));
        driver.findElement(By.className("form_group"));
        driver.findElement(By.tagName("input"));
        driver.findElement(By.cssSelector("#user-name"));
        driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        driver.quit();
    }
    /*public void typesOfLocators(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver.get("https://www.saucedemo.com/");
        WebElement element;
        //ID
        element=driver.findElement(By.id("user-name"));
        //Name
        //driver.findElement(By.name("name of locator"));
        //Class name
    }*/
    /*public void countElements(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","resources/chromedirver");
        //driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
        driver.get("https://www.saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        assertTrue(element.isDisplayed());
        driver.quit();

    }*/










    /*//Sign in Link bz ID
    driver.findElement(By.id("sign-in"));
    //Sign In Button by Name
    driver.findElement(By.name("commit"));
    //Home Link by Class Name
    driver.findElement(By.className("nav-item"));
    //Home Link by Tag Name
    driver.findElement(By.tagName("a"));
    //Sign In Link by CSS
    driver.findElement(By.cssSelector("a[data-test=sign-in]"));
    //Sign in Link By XPath
    driver.findElement(By.xpath("//a[@data-test='sign-in']"));
    //Sign In Link by Link Text
    driver.findElement(By.linkText("Sign in"));
    //Sign In Link by Partial Link Text
    driver.findElement(By.partialLinkText("Sign"));*/
}
