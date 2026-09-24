import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class ListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

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
        System.out.println("After remove: " + list);

        // indexOf()
        System.out.println("First 30: " + list.indexOf(30));

        // lastIndexOf()
        System.out.println("Last 30: " + list.lastIndexOf(30));

        // subList()
        System.out.println("SubList: " + list.subList(0, 2));

        // sort()
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + list);
    }
}
