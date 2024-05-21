
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        //Scanner scan = new Scanner(System.in);
        int times = 0;
        while (times < number) {
            times++;
            System.out.println(times);
        }

    }
}
