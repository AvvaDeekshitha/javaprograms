interface Calculator {
    void add(int a, int b);
    void subtract(int a, int b);
}

class MyCalculator implements Calculator {

    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class multi{
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();

        c.add(10, 5);
        c.subtract(10, 5);
    }
}
