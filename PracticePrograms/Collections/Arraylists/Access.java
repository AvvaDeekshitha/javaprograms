import java.util.ArrayList;

class ArrayListAccess {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("Second element: " + numbers.get(1));
        System.out.println("All elements: " + numbers);
    }
}
