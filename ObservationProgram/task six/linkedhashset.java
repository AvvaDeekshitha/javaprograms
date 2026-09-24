import java.util.LinkedHashSet;

class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

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

        // clear()
        set.clear();
        System.out.println("After clear: " + set);
    }
}
