package lab6;

import java.util.Scanner;

class NegNum extends Exception {
    NegNum(String msg) {
        super(msg);
    }
}

class NumberHandler {

    void processInput() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new NegNum("number should be positive");
            }

            System.out.println("Double value: " + (num * 2));

        } catch (NegNum e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}

public class userdefined {
    public static void main(String[] args) {
        NumberHandler obj = new NumberHandler();
        obj.processInput();   // ONLY call
    }
}
