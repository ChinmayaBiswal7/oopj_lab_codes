package lab3;

import java.util.Scanner;  
public class rectangle {
    
    double length;
    double width;
    double area;
    double perimeter;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle:");
        length =sc.nextInt();
        width=sc.nextInt();
        sc.close();
    }
    void output(){
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
    }
    void calculate(){
        area =length*width; 
        perimeter = 2*(length+width); 
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
    public static void main(String[] args){
        rectangle r=new rectangle();
        r.input();
        r.output();
        r.calculate();
        r.display();

    }
}
