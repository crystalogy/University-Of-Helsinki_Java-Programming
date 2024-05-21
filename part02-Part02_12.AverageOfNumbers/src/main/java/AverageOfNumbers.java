
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);              
           
        double sum = 0;
        int numAmount = 0;
        int input;
                        
        while (true){
            System.out.println("Give a number:");
            input = scanner.nextInt();
            
            if ( input == 0){
                double average = sum / numAmount; 
                System.out.println(sum);
                System.out.println(numAmount);
                System.out.println(sum / numAmount);
                System.out.println("Average of the numbers: " + (average)); 
                break;
            } else {
                sum += input;
                numAmount++;
                continue;
            }    
           
        }                
        
                    
    }
}
