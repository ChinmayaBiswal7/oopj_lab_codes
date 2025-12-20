package lab2;

import java.util.Scanner;

public class largest {

    // instance variables
    int num1, num2, num3;

    // method to take input
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        System.out.println("Enter third number:");
        num3 = sc.nextInt();

        sc.close();
    }

    // method to find largest number
    void findLargest() {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } 
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } 
        else {
            System.out.println(num3 + " is the largest number.");
        }
    }

    // main method
    public static void main(String[] args) {

        // object creation
        largest obj = new largest();

        obj.getInput();      // method call
        obj.findLargest();  // method call
    }
}
