package lab1;

import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        // Printing as "LastName FirstName"
        System.out.println("Formatted Name: " + lastName + " " + firstName);

        sc.close();
    }
}
