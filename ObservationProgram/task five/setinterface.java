import java.util.*;

class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println(set);
        System.out.println("Contains 20: " + set.contains(20));
    }
}
