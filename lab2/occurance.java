package lab2;

import java.util.Scanner;

public class occurance {

    int[] arr;
    int n;

    // method to take input
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        n = sc.nextInt();

        arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find: ");
        int x = sc.nextInt();

        findOccurance(x);

        sc.close();
    }

    // method to count occurance
    void findOccurance(int x) {
        int count = 0;
        for (int i : arr) {   // enhanced for loop
            if (i == x) {
                count++;
            }
        }
        System.out.println("Occurance of " + x + " is: " + count);
    }

    // main method
    public static void main(String[] args) {
        occurance obj = new occurance();
        obj.input();
    }
}
