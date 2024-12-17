package basicHashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding elements
        map.put("Raghu", 19);
        map.put("Daksh", 18);
        map.put("Pankaj", 19);
        map.put("Jaskaran", 17);
        map.put("Rohit Sharma", 37);

        // getting value of key from HashMap
        System.out.println(map.get("Rohit Sharma"));

        // changing/updating value of a key in the HashMap
        map.put("Rohit Sharma", 38);

        // removing a pair from HashMap
        map.remove("Rohit Sharma");

        // checking if a key exists in HashMap
        System.out.println(map.containsKey("Raghu"));

        // Adding a new entry only if the new key doesn't exist
        map.putIfAbsent("Rohit Sharma", 37);

        // get all keys in the HashMap
        System.out.println(map.keySet());
        System.out.println();

        // get all values in the HashMap
        System.out.println(map.values());
        System.out.println();

        // get all entries in the HashMap
        System.out.println(map.entrySet());
        System.out.println();

        // Traversing all entries of HashMap --> Multiple methods
        for(String key : map.keySet()) {
            System.out.printf("Age of %s is %d\n", key, map.get(key));
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Age of " + e.getKey() + " is : " + e.getValue());
        }
        System.out.println();

        for(var e : map.entrySet()) {
            System.out.println("Age of " + e.getKey() + " is : " + e.getValue());
        }
        System.out.println();
    }
}
