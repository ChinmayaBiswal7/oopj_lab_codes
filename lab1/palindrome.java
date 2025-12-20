package lab1;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        int no;
        int r, sum = 0, temp;
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter a number: ");
        no = scannerObject.nextInt();

        temp = no;

        while (no > 0) {
            r = no % 10;
            sum = (sum * 10) + r;
            no = no / 10;
        }

        if (temp == sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
            
            
    }
}

