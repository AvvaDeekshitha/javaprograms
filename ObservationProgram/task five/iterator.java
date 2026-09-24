import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> i = list.iterator();

        // hasNext() and next()
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // remove()
        i = list.iterator();
        i.next();
        i.remove();

        System.out.println("After remove: " + list);

        // forEachRemaining()
        i = list.iterator();
        i.next();

        System.out.print("Remaining: ");
        i.forEachRemaining(x -> System.out.print(x + " "));
    }
}
