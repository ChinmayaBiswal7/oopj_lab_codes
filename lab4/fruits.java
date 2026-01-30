package lab4;

class Apple {
    void show() {
        System.out.println("This is Apple class show method");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show method");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show method");
    }
}

public class fruits {
    public static void main(String[] args) {

        Apple a;   // Parent class reference

        a = new Apple();
        a.show();   // Calls Apple show()

        a = new Banana();
        a.show();   // Calls Banana show()

        a = new Cherry();
        a.show();   // Calls Cherry show()
    }
}

