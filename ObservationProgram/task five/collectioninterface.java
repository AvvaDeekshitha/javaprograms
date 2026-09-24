import java.util.*;

class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(20);
        c.add(30);

        System.out.println(c);
        System.out.println("Size: " + c.size());
        System.out.println("Contains 20: " + c.contains(20));

        c.remove(20);
        System.out.println(c);
    }
}
