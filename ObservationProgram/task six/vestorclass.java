import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        // add()
        v.add(10);
        v.add(20);

        // addElement()
        v.addElement(30);

        System.out.println("Vector: " + v);

        // get()
        System.out.println("Element: " + v.get(1));

        // set()
        v.set(1, 25);
        System.out.println("After set: " + v);

        // contains()
        System.out.println("Contains 10: " + v.contains(10));

        // size()
        System.out.println("Size: " + v.size());

        // capacity()
        System.out.println("Capacity: " + v.capacity());

        // remove(index)
        v.remove(0);
        System.out.println("After remove: " + v);

        // removeElement()
        v.removeElement(30);
        System.out.println("After removeElement: " + v);
    }
}
