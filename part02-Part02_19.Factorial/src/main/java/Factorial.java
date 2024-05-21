
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int input = scanner.nextInt();
        
        int total = 1;
        
        for (int start = 1; start <= input; start++){
            total = total * start;
        }
        
        System.out.println("Factorial: " + total);

    }
}
