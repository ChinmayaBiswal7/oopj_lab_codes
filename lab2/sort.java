package lab2;

import java.util.Scanner;

public class sort {

    int[] arr;
    int n;

    // method to take input
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    // method to sort array
    void sortArray() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // method to display array
    void display() {
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // main method
    public static void main(String[] args) {
        sort obj = new sort();
        obj.input();
        obj.sortArray();
        obj.display();
    }
}
