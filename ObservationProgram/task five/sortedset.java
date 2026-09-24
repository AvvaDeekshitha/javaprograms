import java.util.SortedSet;
import java.util.TreeSet;

class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Set: " + set);

        // first()
        System.out.println("First: " + set.first());

        // last()
        System.out.println("Last: " + set.last());

        // headSet()
        System.out.println("HeadSet: " + set.headSet(30));

        // tailSet()
        System.out.println("TailSet: " + set.tailSet(30));

        // subSet()
        System.out.println("SubSet: " + set.subSet(20, 40));

        // comparator()
        System.out.println("Comparator: " + set.comparator());
    }
}
