package lab4;

import java.util.Scanner;

// 2D Class (Base Class)
class Plastic2D {
    double length, breadth;
    double cost;

    // Method to calculate cost of 2D sheet
    void calculateCost2D(double l, double b) {
        length = l;
        breadth = b;
        double area = length * breadth;
        cost = area * 40;
        System.out.println("Cost of 2D Plastic Sheet = Rs " + cost);
    }
}

// 3D Class (Derived Class)
class Plastic3D extends Plastic2D {
    double height;

    // Method to calculate cost of 3D box
    void calculateCost3D(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
        double volume = length * breadth * height;
        cost = volume * 60;
        System.out.println("Cost of 3D Plastic Box = Rs " + cost);
    }
}

// Main Class
public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plastic3D obj = new Plastic3D();

        System.out.println("Enter length and breadth for 2D sheet:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        obj.calculateCost2D(l, b);

        System.out.println("\nEnter length, breadth and height for 3D box:");
        double l3 = sc.nextDouble();
        double b3 = sc.nextDouble();
        double h3 = sc.nextDouble();
        obj.calculateCost3D(l3, b3, h3);

        sc.close();
    }
}

