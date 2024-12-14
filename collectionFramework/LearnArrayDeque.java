package collectionFramework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        // creating an object
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // adding element
        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(3);

        // printing array deque
        System.out.println(arrayDeque);

        // printing first element
        System.out.println(arrayDeque.peek());

        // removing first element
        arrayDeque.poll();
        System.out.println(arrayDeque);

        // adding to first place
        arrayDeque.addFirst(1);
        System.out.println(arrayDeque);

        // adding to last place
        arrayDeque.addLast(4);
        System.out.println(arrayDeque);
    }
}
