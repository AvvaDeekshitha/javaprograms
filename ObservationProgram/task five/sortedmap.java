import java.util.SortedMap;
import java.util.TreeMap;

class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "C");
        map.put(40, "C++");
        map.put(50, "HTML");

        System.out.println("Map: " + map);

        // firstKey()
        System.out.println("First Key: " + map.firstKey());

        // lastKey()
        System.out.println("Last Key: " + map.lastKey());

        // headMap()
        System.out.println("Head Map: " + map.headMap(30));

        // tailMap()
        System.out.println("Tail Map: " + map.tailMap(30));

        // subMap()
        System.out.println("Sub Map: " + map.subMap(20, 40));

        // comparator()
        System.out.println("Comparator: " + map.comparator());
    }
}
