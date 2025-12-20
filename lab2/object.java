package lab2;

import java.util.Scanner;

public class object {
   static int count = 0;    
   object() {
       count++;
   }    
   void displayCount() {
       System.out.println("Number of objects created: " + count);
   }    
   public static void main(String[] args) {
       object obj1 = new object();
       object obj2 = new object();
       object obj3 = new object();
       obj1.displayCount();
   }    

}

