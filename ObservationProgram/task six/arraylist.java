import java.util.ArrayList;
import java.util.Comparator;

class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add()
        list.add(30);
        list.add(20);
        list.add(30);

        // add(index, element)
        list.add(1, 40);
        System.out.println("List: " + list);

        // get()
        System.out.println("Element: " + list.get(1));

        // set()
        list.set(1, 50);
        System.out.println("After set: " + list);

        // remove(index)
        list.remove(1);

        // remove(object)
        list.remove(Integer.valueOf(30));
        System.out.println("After remove: " + list);

        // contains()
        System.out.println("Contains 20: " + list.contains(20));

        // size()
        System.out.println("Size: " + list.size());

        // isEmpty()
        System.out.println("Is Empty: " + list.isEmpty());

        // indexOf()
        System.out.println("Index of 20: " + list.indexOf(20));

        // lastIndexOf()
        list.add(20);
        System.out.println("Last Index of 20: " + list.lastIndexOf(20));

        // sort()
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + list);

        // clear()
        list.clear();
        System.out.println("After clear: " + list);
    }
}
