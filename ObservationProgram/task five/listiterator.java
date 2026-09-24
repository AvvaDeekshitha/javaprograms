import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListIteratorDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> i = list.listIterator();

        // hasNext(), next(), nextIndex()
        while (i.hasNext()) {
            System.out.println("Index: " + i.nextIndex()
                    + " Value: " + i.next());
        }

        // hasPrevious(), previous(), previousIndex()
        System.out.println("Backward:");
        while (i.hasPrevious()) {
            System.out.println("Index: " + i.previousIndex()
                    + " Value: " + i.previous());
        }

        // add()
        i.add(5);

        // next() and set()
        i.next();
        i.set(15);

        // remove()
        i.next();
        i.remove();

        System.out.println("Final List: " + list);
    }
}
