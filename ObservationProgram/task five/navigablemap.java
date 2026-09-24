import java.util.NavigableMap;
import java.util.TreeMap;

class NavigableMapDemo {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "C");
        map.put(40, "C++");
        map.put(50, "HTML");

        System.out.println("Map: " + map);

        // lowerKey()
        System.out.println("Lower Key: " + map.lowerKey(30));

        // floorKey()
        System.out.println("Floor Key: " + map.floorKey(30));

        // ceilingKey()
        System.out.println("Ceiling Key: " + map.ceilingKey(25));

        // higherKey()
        System.out.println("Higher Key: " + map.higherKey(30));

        // firstEntry()
        System.out.println("First Entry: " + map.firstEntry());

        // lastEntry()
        System.out.println("Last Entry: " + map.lastEntry());

        // pollFirstEntry()
        System.out.println("Poll First: " + map.pollFirstEntry());

        // pollLastEntry()
        System.out.println("Poll Last: " + map.pollLastEntry());

        // descendingMap()
        System.out.println("Descending Map: " + map.descendingMap());
    }
}
