package lab5;
import java.util.Scanner;

interface Salary {
    double earnings();
    double deductions();
    double bonus();
}


abstract class Manager implements Salary {
    protected double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    // Earnings = basic + DA (80%) + HRA (15%)
    public double earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    // Deduction = PF (12%)
    public double deductions() {
        return 0.12 * basic;
    }

    // bonus() is not implemented here
}

// Substaff class extends Manager and implements bonus()
class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    // Bonus = 50% of basic
    public double bonus() {
        return 0.50 * basic;
    }
}

// Driver class
public class manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Substaff s = new Substaff(basicSalary);

        System.out.println("Earnings - " + s.earnings());
        System.out.println("Deduction - " + s.deductions());
        System.out.println("Bonus - " + s.bonus());

        sc.close();
    }
}

