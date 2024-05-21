
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int output = 0;      
        
        while (true){
            
            System.out.println("Give a number:");
            int number = scanner.nextInt();
    
            if (number < 0){
                output = output + 1;
                continue;
            } else if (number > 0){
                continue;
            } else {
                System.out.println("Number of negative numbers: " + output);
                break;
            }
        }

    }
}
