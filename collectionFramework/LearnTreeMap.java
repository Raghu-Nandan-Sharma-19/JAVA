package collectionFramework;

import java.util.Set;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        // creating object
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // adding element
        treeMap.put(1, "Raj");
        treeMap.put(5, "Raghu");
        treeMap.put(2, "Striver");

        // printing tree map
        System.out.println(treeMap);

        // ceiling key
        System.out.println(treeMap.ceilingKey(5));

        // floor key
        System.out.println(treeMap.floorKey(3));

        // removing element
        treeMap.remove(1);

        System.out.println(treeMap);
        
        Set<Integer> set = treeMap.keySet();
        for(Integer num : set) {
            System.out.println(num);
        }
    }
}
