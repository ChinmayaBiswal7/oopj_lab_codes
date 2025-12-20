package lab3;

import java.util.Scanner;

public class student {

    String name;
    int rollno;
    int cgpa;

    void input(Scanner sc) {
        sc.nextLine();          
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextInt();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of student array: ");
        int n = sc.nextInt();

        student[] arr = new student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            arr[i] = new student();
            arr[i].input(sc);
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + arr[i].name);
            System.out.println("Roll No: " + arr[i].rollno);
            System.out.println("CGPA: " + arr[i].cgpa);
            System.out.println();
        }

        sc.close();   
    }
}

