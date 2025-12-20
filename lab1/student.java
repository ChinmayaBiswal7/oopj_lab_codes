package lab1;

import java.util.*;

public class student {
    public static void main(String[] args) {

        String name;
        int rollno;
        String section;
        String branch;

        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scannerObject.nextLine();

        System.out.print("Enter Roll No: ");
        rollno = scannerObject.nextInt();
        scannerObject.nextLine();   // to clear buffer

        System.out.print("Enter Section: ");
        section = scannerObject.nextLine();

        System.out.print("Enter Branch: ");
        branch = scannerObject.nextLine();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Section : " + section);
        System.out.println("Branch  : " + branch);
    }
}
