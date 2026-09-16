class StringExceptionDemo {
    public static void main(String[] args) {
        try {
            String str = "Java";
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is out of bounds");
        }
    }
}
