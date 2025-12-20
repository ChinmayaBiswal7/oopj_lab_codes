package lab1;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // sorts in ascending order

        System.out.println("Sorted array in ascending order:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
