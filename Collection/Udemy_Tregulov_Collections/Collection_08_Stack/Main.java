package Collection.Udemy_Tregulov_Collections.Collection_08_Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push - добавляет элемент в конец Stack;
        stack.push("Igor");
        stack.push("Anna");
        stack.push("Max");
        stack.push("Zoe");
        stack.push("John");
        stack.push("Den");
        stack.push("Mary");
        System.out.println(stack);
        System.out.println("-----------------------------");

        // pop - находит/выводит и УДАЛЯЕТ последний элемент Stack;
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("-----------------------------");

        // peek - находит/выводит, но НЕ удаляет последний элемент Stack;
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println("-----------------------------");

        // isEmpty - проверка на наличие элементов в Stack;
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);
            if (stack.isEmpty()){
                break;
            }
        }
    }
}
