class Employee {
    String name = "Rahul";

    void displayName() {
        System.out.println("Employee: " + name);
    }
}

class Developer extends Employee {
    void work() {
        System.out.println("Developer writes code");
    }
}

public class single {
    public static void main(String[] args) {
        Developer d = new Developer();

        d.displayName();
        d.work();
    }
}
