import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner userIn = new Scanner(System.in);
    static ArrayList usersInfo = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        enterInfo();


    }

    static void enterInfo(){

        while (!userIn.equals("end")){
            System.out.println("Enter your first and last name.");
            String usName = userIn.nextLine();
            System.out.println("Enter your email.");
            String usEmail = userIn.nextLine();



        }

        userIn.close();

    }
}