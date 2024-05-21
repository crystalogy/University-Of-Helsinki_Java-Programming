

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){    
            
        String input = scanner.nextLine();
        
        if (input.isEmpty()){
            break;
        } else {
                items.add(new Item(input));
            }
        }
        
        String printList = items.toString();
        
        System.out.println("Name: " + printList);        
    }
}
