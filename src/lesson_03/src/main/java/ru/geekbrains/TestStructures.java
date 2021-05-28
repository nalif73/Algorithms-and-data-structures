package ru.geekbrains;

import ru.geekbrains.queue.*;
import ru.geekbrains.stack.Stack;
import ru.geekbrains.stack.StackImpl;

public class TestStructures {

    public static void main(String[] args) {
        System.out.println("---- Test Stack ----");
        testStack();
        System.out.println("---- Test Queue ----");
        testQueue();
        System.out.println("---- Test Priority Queue ----");
        testPriorityQueue();
        System.out.println("---- Test Deque ----");
        testDeque();
    }

    private static void testQueue() {
        Queue<Integer> queue = new QueueImpl<>(5);

        System.out.println(queue.insert(1));
        System.out.println(queue.insert(2));
        System.out.println(queue.insert(3));
        System.out.println(queue.insert(4));
        System.out.println(queue.insert(5));
        System.out.println(queue.insert(6));

        System.out.println("Queue peek: " + queue.peekFront());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is full: " + queue.isFull());

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    private static void testPriorityQueue() {

        Queue<Integer> queue = new PriorityQueue<>(5);
        System.out.println(queue.insert(5));
        System.out.println(queue.insert(1));
        System.out.println(queue.insert(3));
        System.out.println(queue.insert(2));
        System.out.println(queue.insert(4));
        System.out.println(queue.insert(6));

        System.out.println("Queue peek: " + queue.peekFront());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is full: " + queue.isFull());

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    private static void testDeque() {
        System.out.println("- RemoveL InsertR -");
        Deque<Integer> queue1 = new DequeImpl<>(5);
        System.out.println(queue1.insertR(1));
        System.out.println(queue1.insertR(2));
        System.out.println(queue1.insertR(3));
        System.out.println(queue1.insertR(4));
        System.out.println(queue1.insertR(5));
        System.out.println(queue1.insertR(6));

        System.out.println("Queue peek: " + queue1.peekFront());
        System.out.println("Queue size: " + queue1.size());
        System.out.println("Queue is full: " + queue1.isFull());

        while (!queue1.isEmpty()) {
            System.out.print(queue1.removeL() + " ");
        }
        System.out.println();

        System.out.println("- InsertL RemoveR -");
        Deque<Integer> queue2 = new DequeImpl<>(5);
        System.out.println(queue2.insertL(1));
        System.out.println(queue2.insertL(2));
        System.out.println(queue2.insertL(3));
        System.out.println(queue2.insertL(4));
        System.out.println(queue2.insertL(5));
        System.out.println(queue2.insertL(6));

        System.out.println("Queue peek: " + queue2.peekFront());
        System.out.println("Queue size: " + queue2.size());
        System.out.println("Queue is full: " + queue2.isFull());

        while (!queue2.isEmpty()) {
            System.out.print(queue2.removeR() + " ");
        }
        System.out.println();
    }

    private static void testStack() {
        Stack<Integer> stack = new StackImpl<>(5);
        System.out.println("Add value 1: " + addToStack(stack, 1));
        System.out.println("Add value 2: " + addToStack(stack, 2));
        System.out.println("Add value 3: " + addToStack(stack, 3));
        System.out.println("Add value 4: " + addToStack(stack, 4));
        System.out.println("Add value 5: " + addToStack(stack, 5));
        System.out.println("Add value 6: " + addToStack(stack, 6));

        System.out.println(stack);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + removeFromStack(stack));

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    private static Integer removeFromStack(Stack<Integer> stack) {
        return !stack.isEmpty() ? stack.pop() : null;
    }

    private static boolean addToStack(Stack<Integer> stack, Integer value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }
}
