package collectionFramework;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        // creating an object
        LinkedList<Integer> linkedList = new LinkedList<>();

        // adding an element
        linkedList.add(1);

        // adding to front
        linkedList.addFirst(0);

        // adding to last
        linkedList.addLast(2);

        // printing linked list
        System.out.println(linkedList);

        // removing first element
        linkedList.removeFirst();

        // removing last element
        linkedList.removeLast();

        System.out.println(linkedList);

        linkedList.addFirst(0);
        linkedList.addLast(2);
        System.out.println(linkedList);

        // getting first element
        System.out.println(linkedList.getFirst());

        // getting last element
        System.out.println(linkedList.getLast());

        System.out.println(linkedList);

        // rest all functions are same as ArrayList
    }
}
