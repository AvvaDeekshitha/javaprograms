import java.util.Collection
class CollectionDemo {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();

        // add()
        c.add(10);
        c.add(20);
        c.add(30);
        System.out.println("Collection: " + c);

        // addAll()
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(40);
        c2.add(50);
        c.addAll(c2);
        System.out.println("After addAll: " + c);

        // remove()
        c.remove(20);
        System.out.println("After remove: " + c);

        // removeAll()
        c.removeAll(c2);
        System.out.println("After removeAll: " + c);

        // contains()
        System.out.println("Contains 10: " + c.contains(10));

        // containsAll()
        System.out.println("Contains all: " + c.containsAll(c2));

        // size()
        System.out.println("Size: " + c.size());

        // isEmpty()
        System.out.println("Is Empty: " + c.isEmpty());

        // iterator()
        System.out.print("Elements: ");
        Iterator<Integer> i = c.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");

        // clear()
        c.clear();
        System.out.println("\nAfter clear: " + c);
    }
}
