import org.junit.Test;

import java.util.Scanner;

public class BinaryCalculator {
    @Test
    public static void Main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number in Decimals to convert to binary: ");
        int number = num.nextInt(); //Entering your number in Decimals
        double tha = 2;
        int[] binary;
        for(int i = 0;;i++){ //An Iteration loop, for calculating amount of numbers;
            if(tha <= number){
                tha = Math.pow(2,2);
                System.out.print(tha + " ");
            }else{
                break;
            }
        }
    }
}
