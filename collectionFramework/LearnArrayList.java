package collectionFramework;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // adding an element
        arrayList.add(10);
        arrayList.add(16);
        arrayList.add(18);

        // printing list
        System.out.println(arrayList);

        // size of list
        System.out.println(arrayList.size());

        // getting element from index
        System.out.println(arrayList.get(1));

        // removing element
        arrayList.remove(2);
        System.out.println(arrayList);

        // adding element at a particular index
        arrayList.add(1, 17);
        System.out.println(arrayList);

        // checking if element is present in list
        System.out.println(arrayList.contains(17));

        // clearing the list
        arrayList.clear();
        System.out.println(arrayList);
    }
}
