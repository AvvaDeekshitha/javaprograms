import java.util.Map;
import java.util.HashMap;

class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C");

        System.out.println("Map: " + map);

        // get()
        System.out.println("Value: " + map.get(1));

        // containsKey()
        System.out.println("Key 2: " + map.containsKey(2));

        // containsValue()
        System.out.println("Value Java: " + map.containsValue("Java"));

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries: " + map.entrySet());

        // size()
        System.out.println("Size: " + map.size());

        // remove()
        map.remove(3);
        System.out.println("After remove: " + map);

        // isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}
