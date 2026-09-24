import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // add()
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("TreeSet: " + numbers);

        // remove()
        numbers.remove(30);
        System.out.println("After removing 30: " + numbers);

        // contains()
        System.out.println("Contains 20? " + numbers.contains(20));

        // first() and last()
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // higher() and lower()
        System.out.println("Higher than 20: " + numbers.higher(20));
        System.out.println("Lower than 20: " + numbers.lower(20));

        // ceiling() and floor()
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));
        System.out.println("Floor of 25: " + numbers.floor(25));

        // pollFirst()
        System.out.println("Removed first element: " + numbers.pollFirst());
        System.out.println("TreeSet after pollFirst(): " + numbers);

        // pollLast()
        System.out.println("Removed last element: " + numbers.pollLast());
        System.out.println("TreeSet after pollLast(): " + numbers);
    }
}
