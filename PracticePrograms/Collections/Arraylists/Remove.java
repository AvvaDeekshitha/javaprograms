import java.util.ArrayList;

class RemoveElement {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Before removal: " + fruits);

        fruits.remove("Banana");

        System.out.println("After removal: " + fruits);
    }
}
