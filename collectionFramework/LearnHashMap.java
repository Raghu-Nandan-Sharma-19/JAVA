package collectionFramework;

import java.util.HashMap;
import java.util.Set;

public class LearnHashMap {
    public static void main(String[] args) {
        // creating an object
        HashMap<Integer, String> hashMap = new HashMap<>();

        // adding key, values
        hashMap.put(1, "Raghu");
        hashMap.put(2, "Daksh");
        hashMap.put(3, "Pankaj");
        hashMap.put(4, "Jaskaran");
        hashMap.put(5, "Djokovic");
        // printing hashmap
        System.out.println(hashMap);

        // printing value at a key
        System.out.println(hashMap.get(2));

        // printing size of hashmap
        System.out.println(hashMap.size());

        // removing from hashmap
        hashMap.remove(5);

        System.out.println(hashMap);

        Set<Integer> set = hashMap.keySet();
        for(Integer num  : set) {
            System.out.println(num);
        }
    }
}
