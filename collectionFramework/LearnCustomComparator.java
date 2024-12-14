package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnCustomComparator {
    public static Comparator<Integer> getComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                // num1 < num2
                if(num1 < num2) {
                    return 1;
                } else if(num1 > num2) {
                    return -1;
                } 
                return 0;
            }
        };
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        
        System.out.println(arrayList);
        
        Collections.sort(arrayList, getComparator());

        System.out.println(arrayList);
    }
}
