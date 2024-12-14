package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class LearnCommonAlgorithms {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println(Collections.min(arrayList));

        System.out.println(Collections.max(arrayList));

        Collections.reverse(arrayList);

        System.out.println(Collections.frequency(arrayList, 5));


        System.out.println(Math.pow(2, 5));
    }
}
