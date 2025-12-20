package lab2;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        sc.close();

        int[] arr = new int[n];

        // Input array elements

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        // Check even or odd for each element
        for (int num : arr) {
            checkEvenOdd(num);
        }
    }
   
    public static void checkEvenOdd(int num) {  
        
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
} 