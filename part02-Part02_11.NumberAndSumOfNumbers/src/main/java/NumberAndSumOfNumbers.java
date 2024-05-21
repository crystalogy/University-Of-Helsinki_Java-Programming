
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Write a program that asks the user for input until the user inputs 0. 
        ///After this, the program prints the average of the numbers. 
        //The number zero does not need to be counted to the average. You may assume that the user inputs at least one number.
        //The average of the numbers can be calculated by dividing the sum of numbers with the amount of the numbers
                     
           
        int sum = 0;
        int numAmount = 0;
                        
        while (true){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
           
            if ( number != 0){
                sum += number;
                numAmount++;
                continue;
            } else {
//                System.out.println("Number of numbers: " + numAmount);
//                System.out.println("Sum of the numbers: " + sum);
                System.out.println("Average of the numbers: " + (sum / numAmount));
                break;
            }
        }
        
        

    }
}
