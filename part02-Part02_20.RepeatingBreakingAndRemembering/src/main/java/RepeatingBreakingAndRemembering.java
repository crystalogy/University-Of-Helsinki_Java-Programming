
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num = 0;
        int sum = 0;
        int numInput = 0;
        int even = 0;
        int odd = 0;

        while (num != -1) {
            num = scanner.nextInt();
            int evenMath = num % 2;
            if (num != -1) {
                sum += num;
                numInput++;
            }
            if (evenMath == 0) {
                even++;

            }
            if (evenMath != 0 && num > 0) {
                odd++;
            }
        }

        double average = (double) sum / numInput;

//          for (numInput = 0 ; num != -1; numInput++ ){
//              num = scanner.nextInt();
//              sum += num;
//          }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numInput);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
