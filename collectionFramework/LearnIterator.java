package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);

        // creating an object
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }
    }
}
