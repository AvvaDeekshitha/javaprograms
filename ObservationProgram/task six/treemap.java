import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // put()
        students.put(103, "Anu");
        students.put(101, "Ravi");
        students.put(104, "Kiran");
        students.put(102, "Priya");

        System.out.println("TreeMap: " + students);

        // get()
        System.out.println("Student with key 102: " + students.get(102));

        // remove()
        students.remove(103);
        System.out.println("After removing key 103: " + students);

        // containsKey()
        System.out.println("Contains key 101? " + students.containsKey(101));

        // containsValue()
        System.out.println("Contains value Ravi? "
                + students.containsValue("Ravi"));

        // firstKey() and lastKey()
        System.out.println("First key: " + students.firstKey());
        System.out.println("Last key: " + students.lastKey());

        // higherKey() and lowerKey()
        System.out.println("Higher key than 101: " + students.higherKey(101));
        System.out.println("Lower key than 104: " + students.lowerKey(104));

        // ceilingKey() and floorKey()
        System.out.println("Ceiling key of 102: " + students.ceilingKey(102));
        System.out.println("Floor key of 102: " + students.floorKey(102));

        // entrySet()
        System.out.println("Key-Value pairs: " + students.entrySet());
    }
}
