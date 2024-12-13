package collectionFramework;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        // creating an object
        TreeSet<Integer> treeSet = new TreeSet<>();

        // adding element
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(4);
        treeSet.add(20);
        treeSet.add(12);

        // printing set
        System.out.println(treeSet);

        // removing element
        treeSet.remove(20);
        System.out.println(treeSet);

        // floor --> returns first value <= element
        System.out.println(treeSet.floor(9));

        // ceiling --> prints first value >= element
        System.out.println(treeSet.ceiling(5));
    }
}
