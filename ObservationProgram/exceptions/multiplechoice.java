class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};
            int result = arr[5] / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");

        } catch (Exception e) {
            System.out.println("Some other exception");
        }
    }
}
