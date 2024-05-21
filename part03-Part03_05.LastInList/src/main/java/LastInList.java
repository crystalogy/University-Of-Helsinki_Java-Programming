
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
    
        while (true) {
            String input = scanner.nextLine();
            list.add(input);
            int last = list.size();
            if (input.equals("")) {
               //String index = list.get(last);

               //last = last - 1;

               System.out.println(list.get(last - 2));
                break;
            }

          //  list.add(input);
            
           // System.out.println(list.get(last - 1));
        }

    }
}
