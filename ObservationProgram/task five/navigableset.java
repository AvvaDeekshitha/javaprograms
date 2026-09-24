import java.util.NavigableSet;
import java.util.TreeSet;

class NavigableSetDemo {
    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Set: " + set);

        // lower()
        System.out.println("Lower: " + set.lower(30));

        // floor()
        System.out.println("Floor: " + set.floor(30));

        // ceiling()
        System.out.println("Ceiling: " + set.ceiling(25));

        // higher()
        System.out.println("Higher: " + set.higher(30));

        // pollFirst()
        System.out.println("Poll First: " + set.pollFirst());

        // pollLast()
        System.out.println("Poll Last: " + set.pollLast());

        // descendingSet()
        System.out.println("Descending: " + set.descendingSet());
    }
}
