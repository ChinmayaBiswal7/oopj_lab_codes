package lab1;
import java.util.*;

public class grade {
    public static void main(String[] args) {

        int mark;
        String grade;

        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter mark in range of 1 to 100: ");
        mark = scannerObject.nextInt();

        if (mark >= 90)
            grade = "O";
        else if (mark >= 80)
            grade = "E";
        else if (mark >= 70)
            grade = "A";
        else if (mark >= 60)
            grade = "B";
        else if (mark >= 50)
            grade = "C";
        else
            grade = "F";   // For marks < 50

        System.out.println("Grade = " + grade);
    }
}
