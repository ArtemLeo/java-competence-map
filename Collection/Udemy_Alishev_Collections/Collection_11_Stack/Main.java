package Collection.Udemy_Alishev_Collections.Collection_11_Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Stack = LIFO (Last In First Out);
        // push(); Adds an element to the Stack;
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(32);
        stack.push(54);
        stack.push(98);

        // pop(); Shows the element on the display and extracts it;
        System.out.println(stack.pop()); // = 98
        System.out.println(stack.pop()); // = 54
        System.out.println(stack.pop()); // = 32
        System.out.println("-------------------------");

        // peek(); Shows the element on the display and not extracts it;
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println("-------------------------");

        // empty();
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
