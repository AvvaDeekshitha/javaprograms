import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);

        System.out.println(list);
        System.out.println("Element: " + list.get(1));

        list.set(1, 25);
        list.remove(0);

        System.out.println(list);
    }
}
