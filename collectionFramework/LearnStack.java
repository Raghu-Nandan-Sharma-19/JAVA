package collectionFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        // creating an object
        Stack<Integer> stack = new Stack<>();

        // pushing an element
        stack.push(1);
        stack.push(3);
        stack.push(0);
        stack.push(6);

        // printing stack
        System.out.println(stack);

        // getting last push element
        System.out.println(stack.peek());

        // popping element from stack
        stack.pop();
        System.out.println(stack);

        // checking if stack is empty
        System.out.println(stack.isEmpty());

        // printing stack
        while(stack.isEmpty() == false) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
