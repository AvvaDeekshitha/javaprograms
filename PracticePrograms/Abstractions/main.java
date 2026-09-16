abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();

    void displayName() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println("Salary = Rs.50000");
    }
}

class PartTimeEmployee extends Employee {

    PartTimeEmployee(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println("Salary = Rs.25000");
    }
}

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee f =
            new FullTimeEmployee("Rahul");

        PartTimeEmployee p =
            new PartTimeEmployee("Anu");

        f.displayName();
        f.calculateSalary();

        p.displayName();
        p.calculateSalary();
    }
}
