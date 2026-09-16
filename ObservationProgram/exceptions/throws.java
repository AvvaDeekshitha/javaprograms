class Throws {

    static void divide() throws ArithmeticException {
        int a = 10;
        int b = 0;

        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
