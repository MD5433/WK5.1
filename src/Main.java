//Mariah Dungey 02/15/2025
import java.util.Scanner;

public class Main {
    static Scanner userIn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        enterInfo();


    }

    static void enterInfo() {
        while (true) {
            System.out.println("Enter your name, type end to stop");
            String usName = userIn.nextLine();
            if (usName.equals("end")) {
                break;
            }

            System.out.println("Enter your email:");
            String usEmail = userIn.nextLine();

            Person person = new Person(usName, usEmail);
            AddressBook.addContact(person);
//search for a contact code
            System.out.println("Would you like to search for a contact by name? (yes/no)");
            String searchResponse = userIn.nextLine();
            if (searchResponse.equals("yes")) {
                System.out.println("Enter the name of the contact you wish to search for:");
                String search = userIn.nextLine();
                AddressBook.searchContact(search);
            }
        }
        userIn.close();
    }
}
