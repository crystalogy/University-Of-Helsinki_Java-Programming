
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              
        double sum = 0;
        int numOfInputs = 0;
                       
        while (true){
            
            int input = scanner.nextInt();
            double avg = sum / numOfInputs;
                                              
            if (input > 0){
                sum += input;
                numOfInputs++;
                continue;
            } else if (input < 0){
                continue;
            } else if (input <= 0 && sum <= 0){
                System.out.println("Cannot calculate the average");
                break;
            } else  { 
                System.out.println(avg);
                break;
            }
           
        }
        

    }
}
