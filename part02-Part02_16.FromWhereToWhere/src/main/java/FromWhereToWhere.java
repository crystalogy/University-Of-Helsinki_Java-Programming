
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int stop = scanner.nextInt();
        System.out.println("Where from?");
        int start = scanner.nextInt();
        
        while (stop < start){

            break;
        }
        while (stop > start) {
           
            System.out.println(start);
            start++;
        }
        while (stop == start) {
            System.out.println(start);
            break;
        }
    }
}
//Write a program which prints the integers from 1 to a number given by the user.
