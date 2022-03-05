import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;


public class HelloSeleniumTest {
    @Test
    public void firstTest()
        {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.quit(); //close

        }
    }


    /*public void variablesChallenge(){
                Scanner num = new Scanner(System.in);
                // write your code here
                double kilo=0.45359237;
                System.out.println("How much pounds will u enter: ");
                int pound = 100;
                System.out.println("This is the final outcome kilos: " + pound * kilo);
        /*@Test
        public void comparison(){
        double num1 =10;
        double num2 = 5.5;
        Assert.assertTrue("The second number is higher than the first", num1>num2);
            /*String word1 = "SosatJaVc";
            String word2 = "SOSATJAVC";
            Assert.assertTrue("The same",word1.toLowerCase()==word2.toLowerCase());*/

