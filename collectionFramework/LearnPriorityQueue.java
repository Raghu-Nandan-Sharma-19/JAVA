package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static Comparator<Integer> getComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
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
        // creating an object -- Min heap
        // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // crating an obect -- Max heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(getComparator());

        // adding element
        priorityQueue.offer(1);
        priorityQueue.offer(0);
        priorityQueue.offer(2);
        priorityQueue.offer(-1);

        // printing priority queue
        System.out.println(priorityQueue);

        // peek element
        System.out.println(priorityQueue.peek());

        // removing an element
        priorityQueue.poll();
        System.out.println(priorityQueue);
    }
}
