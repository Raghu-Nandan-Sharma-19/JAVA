package collectionFramework;

import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
        // creating an object
        HashSet<Integer> hashSet = new HashSet<>();

        // adding element
        hashSet.add(1);
        hashSet.add(0);
        hashSet.add(2);

        // printing hash set
        System.out.println(hashSet);

        // removing element
        hashSet.remove(2);
        System.out.println(hashSet);

        // printing hash set
        for(var num : hashSet) {
            System.out.println(num);
        }
    }
}
