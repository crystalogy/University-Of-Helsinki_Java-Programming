
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {              
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("First name:");     
            String firstName = scanner.nextLine();        
            if (firstName.isEmpty()){
                break;
            }
         
            System.out.print("Last name: ");            
            String lastName = scanner.nextLine();       
            if (lastName.isEmpty()){
                break;
            }
            
            System.out.println("Identification number: ");
            String identificationNumber = scanner.nextLine();    
            if (identificationNumber.isEmpty()){
                break;
            }         
            System.out.println(firstName + " " + lastName);            
        }
    }
}
