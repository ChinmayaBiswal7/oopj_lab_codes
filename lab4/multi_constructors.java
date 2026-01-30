package lab4;

import java.util.Scanner;

// Base Class
class Plate {
    double length, width;

    // Constructor of Plate
    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Dimensions:");
        System.out.println("Length = " + length);
        System.out.println("Width  = " + width);
    }
}

// Derived Class (Level 2)
class Box extends Plate {
    double height;

    // Constructor of Box
    Box(double l, double w, double h) {
        super(l, w);   // Calls Plate constructor
        height = h;
        System.out.println("Box Dimensions:");
        System.out.println("Height = " + height);
    }
}

// Derived Class (Level 3)
class WoodBox extends Box {
    double thickness;

    // Constructor of WoodBox
    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);  // Calls Box constructor
        thickness = t;
        System.out.println("WoodBox Dimensions:");
        System.out.println("Thickness = " + thickness);
    }
}

// Main Class
public class multi_constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter legth width height and thickness of toolbar:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        // Object of most derived class
        WoodBox wb = new WoodBox(l, w, h, t);

        sc.close();
    }
}
