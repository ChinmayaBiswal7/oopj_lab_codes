

package lab5;
import java.util.Scanner;

// Interface Employee
interface Employee {
    void getDetails();
}

// Derived Interface Manager
interface Manager extends Employee {
    void getDeptDetails();
}

// Class Head implements Manager
class Head implements Manager {

    int empId;
    String empName;
    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    // Method to get employee details
    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
    }

    // Method to get department details
    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter department name: ");
        deptName = sc.nextLine();
    }

    // Method to display all details
    public void display() {
        System.out.println("\nEmployee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

// Driver class
public class employee {
    public static void main(String[] args) {

        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
