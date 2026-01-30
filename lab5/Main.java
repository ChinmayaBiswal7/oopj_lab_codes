package lab5;
abstract class Student {
    int rollno;
    long regno;

    void getInput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}


class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    // Method to display details
    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {


        Kiitian k = new Kiitian();
        
        int roll = 2205180;
        long reg = 1234567890L;

        k.getInput(roll, reg);
        
        k.display();
    }
}
