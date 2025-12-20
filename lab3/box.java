package lab3;

import java.util.Scanner;

public class box {
    
    double length;
    double width;
    double height;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length width and height of box:");
        length =sc.nextInt();
        width=sc.nextInt();
        height=sc.nextInt();
        sc.close();
    }
    void output(){
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
        System.out.println("Height:"+height);
    }
    double volume(){
        return length*width*height;  
    }
    public static void main(String[] args){
        box b=new box();
        b.input();
        b.output();
        System.out.println("volume of box is"+b.volume());

    }
    
}
