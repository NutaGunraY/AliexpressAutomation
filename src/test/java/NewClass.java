import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class NewClass {
    private WebDriver driver;
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    /*@Test
    public void theHighestNumber(){
        int a=738,b=1932,c=500;
        if(a>b && a>c){
            System.out.println(a);
        }if(b>a && b>c){
            System.out.println(b);
        }if(c>a && c>b){
            System.out.println(c);
        }
    }*/
    /*public double calculateTheInterest(double balance, int rate){
        return balance * rate /100;
    }
    @Test
    public void methodExercise2(){
        double balance = 10000;
        double interest;
        if(balance <=100){
            interest = calculateTheInterest(balance,3);
        }else if(balance <=1000){
            interest = calculateTheInterest(balance, 5);
        }else{
            interest = calculateTheInterest(balance, 7);
        }
        System.out.println(interest);
    }*/
    /*public void calculateThePerimeter(int length, int width){
        if(length == width){
            System.out.println("The rectangle is a square");
        }else
        System.out.println((length+width)*2);
    }
    @Test
    public void methodExercise1(){
        calculateThePerimeter(10,20);
        calculateThePerimeter(5,5);
        calculateThePerimeter(2,9);
    }*/
    /*public void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }
    public int calculateHighScorePosition(int highScorePosition){
        if(highScorePosition >= 1000){
            return 1;
        }else if(highScorePosition >=500 && highScorePosition <1000){
            return 2;
        }else if(highScorePosition >=100 && highScorePosition <500){
            return 3;
        }else{
            return 4;
        }

    }
    @Test
    public void methodChallenge(){
        String playerName = "Nursultan";
        int highSCorePosition = calculateHighScorePosition(400);;
        displayHighScorePosition(playerName, highSCorePosition);
    }*/
}
