import java.util.Set;
import java.util.HashSet;

class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println("Set: " + set);

        // remove()
        set.remove(20);
        System.out.println("After remove: " + set);

        // contains()
        System.out.println("Contains 10: " + set.contains(10));

        // size()
        System.out.println("Size: " + set.size());

        // isEmpty()
        System.out.println("Is Empty: " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear: " + set);
    }
}
